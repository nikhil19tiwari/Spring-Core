package in.pwskill.nikhil.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.pwskill.nikhil.bean.Employee;
import in.pwskill.nikhil.bean.Printer;

@Configuration
public class AppConfig {
static {
	System.out.println("AppConfig class is loaded");
}
AppConfig(){
	System.out.println("AppConfig object is created");
}
@Bean(name = "e1")
//@Scope("singleton")//eager loading and give the same object
@Scope("prototype")//lazy loading and give new object
public Employee getemp1() {
	// create the dependent object
	LocalDateTime ldt = LocalDateTime.now();
	//create the target object
	Employee emp = new Employee();
	emp.setEaddress("nallasopara");
	emp.setEage(21);
	emp.setEid(1);
	emp.setEname("nikhil");
	// link the object
	emp.setLdt(ldt);
	return emp;
}
@Bean(name = "e2")
//@Scope("singleton")
@Scope("prototype")
public Employee getemp2() {
	// create the dependent object
	LocalDateTime ldt = LocalDateTime.now();
	//create the target object
	Employee emp = new Employee();
	emp.setEaddress("nallasopara");
	emp.setEage(21);
	emp.setEid(1);
	emp.setEname("nikhil");
	// link the object
	emp.setLdt(ldt);
	return emp;
}
@Bean(name = "p1")
public Printer getInstence1() {
	return Printer.getIntence();
}
@Bean(name = "p2")
public Printer getInstence2() {
	return Printer.getIntence();
}
}
