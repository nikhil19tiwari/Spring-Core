package in.pwskill.nikhil.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component(value="wmg")
@PropertySource("application.properties")
public class Employee implements Serializable{
	@Value("${info.emp.id}")
private Integer id;
	@Value("${info.emp.name}")
private String name;
	@Value("${info.emp.age}")
private Integer age;
	@Value("${info.emp.address}")
private String address;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", ld=" + ld + "]";
}
@Autowired(required = false)
private LocalDateTime ld;
public void process() {
	
	System.out.println("Good morning brother"+ld.getHour());
}
}
