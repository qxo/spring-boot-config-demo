package demo.springbootconfigdemo;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = "appconfig")
public class AppConfig {

  private Map<String, String> strMap;

  private Map<String, Object> objectMap;

  public final Map<String, String> getStrMap() {
    return strMap;
  }

  public final void setStrMap(Map<String, String> dataMap) {
    this.strMap = dataMap;
  }

  public final Map<String, Object> getObjectMap() {
    return objectMap;
  }

  public final void setObjectMap(Map<String, Object> objectMap) {
    this.objectMap = objectMap;
  }
}
