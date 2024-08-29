package in.pwskill.nikhil.bean;

public class StudentDTO {
	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;//p*r*t/100
	private Integer pmt;
	private Integer rate;
	private Integer time;
	@Override
	public String toString() {
		return "StudentDTO [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + ", pmt="
				+ pmt + ", rate=" + rate + ", time=" + time + "]";
	}
	public Integer getSid() {
		return sid;
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
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
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
