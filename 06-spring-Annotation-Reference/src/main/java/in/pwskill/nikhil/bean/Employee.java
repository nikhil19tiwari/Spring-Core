package in.pwskill.nikhil.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
}

}
