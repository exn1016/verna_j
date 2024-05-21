package nx.kakuma.yuufuku.eureka;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    // SpringApplication.run(EurekaApplication.class, args);
    new SpringApplicationBuilder(EurekaApplication.class).web(WebApplicationType.SERVLET).run(args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(EurekaApplication.class);
  }
}
