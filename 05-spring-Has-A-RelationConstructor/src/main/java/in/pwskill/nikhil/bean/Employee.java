package in.pwskill.nikhil.bean;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	//toString method
@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ldt=" + ldt + ", friends=" + friends + ", phoneNumber="
				+ phoneNumber + ", bankAccount=" + bankAccount + "]";
	}
private Integer eid;
private String ename;
private LocalDateTime ldt;
private Set<String>friends;
private List<Long>phoneNumber;
//Constructor
public Employee(Integer eid, String ename, LocalDateTime ldt, Set<String> friends, List<Long> phoneNumber,
		Map<String, Long> bankAccount) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.ldt = ldt;
	this.friends = friends;
	this.phoneNumber = phoneNumber;
	this.bankAccount = bankAccount;
}
private Map<String,Long>bankAccount;
// Business logic
public void process(String name) {
	System.out.println("hey :"+name+"this is for you ,for learning from::"+ldt.getHour()+"Hours");
	for(int i = 0;i<5;i++) {
		for(int j = 0;j<5;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

}
