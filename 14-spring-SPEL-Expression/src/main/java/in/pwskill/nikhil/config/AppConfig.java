package in.pwskill.nikhil.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.pwskill.nikhil")
public class AppConfig {
	static {
		System.out.println("AppConfig class loaded");
	}

	public AppConfig() {
		System.out.println("AppConfig class object is created");
	}
}
