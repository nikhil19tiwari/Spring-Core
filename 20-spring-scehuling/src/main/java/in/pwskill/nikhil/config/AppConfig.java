package in.pwskill.nikhil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@ComponentScan(basePackages = "in.pwskill.nikhil")
@EnableScheduling
public class AppConfig {
    static {
        System.out.println("AppConfig class is loaded");
    }

    public AppConfig() {
        System.out.println("AppConfig class object is created");
    }

}
