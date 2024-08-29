package in.pwskill.nikhil.bean;

public class StudentDTO {
private Integer sid;
private String sname;
private Integer pmt;
private Integer rate;
private Integer time;
public Integer getSid() {
	return sid;
}
@Override
public String toString() {
	return "StudentDTO [sid=" + sid + ", sname=" + sname + ", pmt=" + pmt + ", rate=" + rate + ", time=" + time + "]";
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Integer getPmt() {
	return pmt;
}
public void setPmt(Integer pmt) {
	this.pmt = pmt;
}
public Integer getRate() {
	return rate;
}
public void setRate(Integer rate) {
	this.rate = rate;
}
public Integer getTime() {
	return time;
}
public void setTime(Integer time) {
	this.time = time;
}
}
