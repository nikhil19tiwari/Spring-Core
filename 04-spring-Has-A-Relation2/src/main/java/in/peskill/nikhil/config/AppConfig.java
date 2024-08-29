package in.peskill.nikhil.config;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskill.nikhil.bean.Employee;
@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig class loading ...");
	}

	AppConfig() {
		System.out.println("AppConfig object created ...");
	}
@Bean(name = "emp")
	public Employee employee() {
		// create the dependent object
		Set s = Set.of(11111111, 222222, 3333333);
		List l = List.of("nikita", "shrejal", "sakshi");
		Map m = Map.of("SBI", 1234, "UNION", 4444, "BOB", 1345);
		// create the Target object
		Employee employee = new Employee();
       // set the reference objects
		employee.setEage(21);
		employee.setEid(34);
		employee.setEname("nikhil");
		// link the objects
		employee.setFriends(l);
		employee.setBankAccount(m);
		employee.setPhoneNumber(s);
		return employee;
	}
}
