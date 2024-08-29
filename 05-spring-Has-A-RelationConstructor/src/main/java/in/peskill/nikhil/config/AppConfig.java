package in.peskill.nikhil.config;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskill.nikhil.bean.Employee;
@Configuration
public class AppConfig {
static {
	System.out.println("AppConfig class loaded");
	
}
AppConfig(){
	System.out.println("AppConfig class created");
}
@Bean
public Employee employee() {
	// create the dependent Object
	LocalDateTime ldt = LocalDateTime.now();
	Set s = Set.of("vivek", "nikhil", "ankit");
	List l = List.of(111111,222222,33333333);
	Map m = Map.of("SBI", 1234, "Cenera", 4754);
	//create the Target Object
	Employee employee = new Employee(1,"ram",ldt,s,l,m);
	return employee;
}

}
