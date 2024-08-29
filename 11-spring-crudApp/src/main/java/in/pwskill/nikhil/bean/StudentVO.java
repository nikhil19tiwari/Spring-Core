package in.pwskill.nikhil.bean;

public class StudentVO {
private String sid;
private String sname;
private String sage;
private String saddress;//p*r*t/100
private String pmt;
private String rate;
private String time;
@Override
public String toString() {
	return "StudentVO [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + ", pmt=" + pmt
			+ ", rate=" + rate + ", time=" + time + "]";
}
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
public String getSage() {
	return sage;
}
public void setSage(String sage) {
	this.sage = sage;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
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

}
