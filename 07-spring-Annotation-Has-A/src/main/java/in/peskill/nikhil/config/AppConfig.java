package in.peskill.nikhil.config;


import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="in.pwskill.nikhil")
public class AppConfig {
static {
	System.out.println("AppConfig class loading ");
}
AppConfig(){
	System.out.println("AppConfig object created");
}
@Bean(name = "employee")
public LocalDateTime Ldt() {
	LocalDateTime ld = LocalDateTime.now();
	return ld;
}

}
