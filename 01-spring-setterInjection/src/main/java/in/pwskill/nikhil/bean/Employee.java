package in.pwskill.nikhil.bean;

public class Employee {
private Integer eid;
private String ename;
private Integer eage;
private String eaddress;
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Integer getEage() {
	return eage;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
}
public void setEage(Integer eage) {
	this.eage = eage;
}
public String getEaddress() {
	return eaddress;
}
public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}

}
