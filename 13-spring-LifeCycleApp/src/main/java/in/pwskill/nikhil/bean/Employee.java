  package in.pwskill.nikhil.bean;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "employee")
@PropertySource("application.properties")
public class Employee {
	@Value("${info.emp.eid}")
private Integer eid;
	@Value("${info.emp.ename}")
private String ename;
	@Value("${info.emp.eage}")
private Integer eage;
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + ", ldt=" + ldt
			+ "]";
}
@Value("${info.emp.eaddress}")
private String eaddress;
private LocalDateTime ldt;

//Initialize method
@PostConstruct
public void  initilize() {
	 ldt = LocalDateTime.now();
}
// Business logic
public void process(String name) {
	int time = ldt.getHour();
	System.out.println("Good morning "+name+"the time is "+time);
	System.out.println("your id is ::"+eid);
	System.out.println("your name is ::"+ename);
	System.out.println("your age is ::"+eage);
	System.out.println("your address is ::"+eaddress);
}

// destroy method
@PreDestroy
public void destroying() {
	ldt = null;
}

}
