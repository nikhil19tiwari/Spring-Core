package in.pwskill.nikhil.bean;

public class StudentVO {
private String sid;
private String sname;
private String pmt;
private String rate;
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getPmt() {
	return pmt;
}
public void setPmt(String pmt) {
	this.pmt = pmt;
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
private String time;
@Override
public String toString() {
	return "StudentVO [sid=" + sid + ", sname=" + sname + ", pmt=" + pmt + ", rate=" + rate + ", time=" + time + "]";
}

}
