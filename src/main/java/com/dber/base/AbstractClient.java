package com.dber.base;

import com.dber.base.enums.DberSystem;
import com.dber.base.util.BaseKeyUtil;
import com.dber.base.util.DefaultClientUtil;
import com.dber.base.util.IClientUtil;
import com.dber.cache.ICacheService;
import com.dber.cache.config.CacheConfig;
import com.dber.config.SystemConfig;
import com.dber.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/12
 */
@EnableConfigurationProperties({SystemConfig.class})
@Import({CacheConfig.class})
public abstract class AbstractClient implements IClient {

  @Autowired
  protected SystemConfig systemConfig;

  @Autowired
  protected ICacheService cacheService;

  protected final DberSystem serviceSystem;

  @Autowired
  private DberSystem customSystem;

  private String baseUrl;

  private static final List<AbstractClient> clinets = new ArrayList<>();

  private boolean isMonitor = false;

  protected IClientUtil clientUtil;

  /**
   * 缓存服务Client实例
   */
  private static final Map<DberSystem, IClient> SERVICE_CLIENT_MAP = new HashMap<>();

  /**
   * @param serviceSystem 提供本客户端的服务系统
   */
  protected AbstractClient(DberSystem serviceSystem) {
    if (SERVICE_CLIENT_MAP.containsKey(serviceSystem)) {
      throw new IllegalArgumentException('【' + serviceSystem.name() + "】客户端实例已经存在，请保持单例使用！");
    }
    this.serviceSystem = serviceSystem;
    SERVICE_CLIENT_MAP.put(serviceSystem, this);
  }

  private final boolean setClientUtil() {
    String customKey = systemConfig.getAuth().getObtain().get(serviceSystem.name().toLowerCase());
    if (Util.isBlank(customKey)) {
      throw new IllegalStateException("请在application.yml的节点dber.service-auth配置要访问服务的key【"
              + serviceSystem.name() + '】');
    }

    String baseUrl = cacheService.get(BaseKeyUtil.getBaseKey(this.serviceSystem), String.class);

    if (Util.isBlank(baseUrl)) {
      return false;
    }

    if (!baseUrl.equals(this.baseUrl)) {
      this.baseUrl = baseUrl;
      this.clientUtil = DefaultClientUtil.getClientUtil(baseUrl, customSystem, customKey);
    }

    return true;
  }

  private void resetClient(AbstractClient client) {
    clinets.add(client);
    if (!isMonitor) {
      isMonitor = true;
      new Thread(() -> {
        for (; ; ) {
          for (AbstractClient aClient : clinets) {
            aClient.setClientUtil();
          }
          LockSupport.parkNanos(Util.timeMili2Nano(1000 * 60));
        }
      }).start();
    }
  }


  @PostConstruct
  private void init() {
    this.resetClient(this);
  }
}
