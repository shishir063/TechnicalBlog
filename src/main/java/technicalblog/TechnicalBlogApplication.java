package technicalblog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;

@SpringBootApplication

public class TechnicalBlogApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TechnicalBlogApplication.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", "8889"));
        application.run(args);

    }
}
