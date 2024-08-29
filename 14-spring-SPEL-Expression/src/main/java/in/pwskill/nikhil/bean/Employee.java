package in.pwskill.nikhil.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {
	// Reference Type
	@Value("#{new java.util.Random().nextInt(100)}")
	private Integer eid;
	
	@Value("${info.emp.ename}")
	private String ename;
	
	@Value("${info.emp.eage}")
	private Integer eage;
	
	@Value("${info.emp.eaddress}")
	private String eaddress;
	
	// Setting the direct value
	@Value("#{20 > 10 ? 100000 : 2000000}")
	private Integer salary;
	
	@Value("#{1 > 2 ? 51 : 50}")
	private Integer rollNumber;

	// Has-A type
	@Value("#{'${info.emp.phoneNumber}'.split(',')}")
	private Set<String> phoneNumber;
	
	@Value("#{'${info.emp.friends}'.split(',')}")
	private List<String> friends;
	
	@Value("#{${info.emp.bankDetails}}")
	private Map<String, Integer> bankDetails;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + ", phoneNumber="
				+ phoneNumber + ", friends=" + friends + ", bankDetails=" + bankDetails + "]";
	}
	
	// Business logic
	public void process() {
		System.out.println(eid + " " + ename + " " + eage + " " + eaddress);
		System.out.println(salary);
		System.out.println(rollNumber);
		System.out.println(phoneNumber);
		System.out.println(friends);
		System.out.println(bankDetails);
	}
}
