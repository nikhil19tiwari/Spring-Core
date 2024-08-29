package in.pwskill.nikhil.bean;

public class Employee {
private Integer eid;
private String ename;
private Integer eage;
private String eaddress;
public Employee(Integer eid, String ename, Integer eage, String eaddress) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.eage = eage;
	this.eaddress = eaddress;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
}

}
