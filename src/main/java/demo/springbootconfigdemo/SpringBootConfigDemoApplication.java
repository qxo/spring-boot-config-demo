package demo.springbootconfigdemo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConfigDemoApplication implements InitializingBean {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootConfigDemoApplication.class, args);
  }

  @Autowired
  private AppConfig appConfig;

  @Override
  public void afterPropertiesSet() throws Exception {

    System.out.println("strMap:" + appConfig.getStrMap());
    
    System.out.println("objectMap:" + appConfig.getObjectMap());
  }

}
