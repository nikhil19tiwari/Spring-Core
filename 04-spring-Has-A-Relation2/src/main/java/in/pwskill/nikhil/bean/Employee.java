package in.pwskill.nikhil.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
private Integer eid;
private String ename;
private Integer eage;
List<String>friends;
Set<Long>phoneNumber;
Map<String,Integer>bankAccount;
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
public void setEage(Integer eage) {
	this.eage = eage;
}
public List<String> getFriends() {
	return friends;
}
public void setFriends(List<String> friends) {
	this.friends = friends;
}
public Set<Long> getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Set<Long> phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Map<String, Integer> getBankAccount() {
	return bankAccount;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", friends=" + friends + ", phoneNumber="
			+ phoneNumber + ", bankAccount=" + bankAccount + "]";
}
public void setBankAccount(Map<String, Integer> bankAccount) {
	this.bankAccount = bankAccount;
}

}
