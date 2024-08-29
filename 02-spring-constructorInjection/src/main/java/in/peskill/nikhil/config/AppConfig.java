package in.peskill.nikhil.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskill.nikhil.bean.Employee;
@Configuration
public class AppConfig {
static {
	System.out.println("AppConfig class loaded");
}
AppConfig(){
	System.out.println("AppConfig constructor initlized");
}
@Bean
public Employee employee() {
	Employee emp = new Employee(2,"kamlesh",34,"pune");
	return emp;
}
}
