package in.peskill.nikhil.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = "in.pwskill.nikhil")
public class AppConfig {
static {
	System.out.println("AppConfig class Loading ");
}
AppConfig(){
	System.out.println("AppConfig  object is created");
}

}
