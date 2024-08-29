package pwskill.in.pwskill.nikhil.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class empConfig {
	@Bean
public Employee emp() {
	Employee e = new Employee();
	e.setEaddress("nallasopara");
	e.setEage(20);
	e.setEid(1);
	e.setEname("nikhil");
	return e;
}
}
