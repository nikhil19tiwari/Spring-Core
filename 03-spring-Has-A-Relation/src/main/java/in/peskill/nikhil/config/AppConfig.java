package in.peskill.nikhil.config;

import java.time.LocalDateTime;

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
	//create the dependent object
	LocalDateTime ldt = LocalDateTime.now();
	// create the target object
	Employee emp = new Employee();
	emp.setEaddress("klyan");
	emp.setEage(34);
	emp.setEid(33);
	emp.setEname("rakesh");
	// linkig the object dependent in the target object
	emp.setLdt(ldt);
	return emp;
}
}
