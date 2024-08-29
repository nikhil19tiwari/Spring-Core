package in.pwskill.nikhil.bean;

public class StudentBO {
private Integer sid;
private String sname;
private Integer pmt;
private Integer rate;
private Integer time;
//one extra field to calculate the Simple interest
private Integer si;
public Integer getSid() {
	return sid;
}
@Override
public String toString() {
	return "StudentBO [sid=" + sid + ", sname=" + sname + ", pmt=" + pmt + ", rate=" + rate + ", time=" + time + ", si="
			+ si + "]";
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
public Integer getSi() {
	return si;
}
public void setSi(Integer si) {
	this.si = si;
}
}
