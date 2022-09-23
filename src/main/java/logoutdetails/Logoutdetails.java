package logoutdetails;

public class Logoutdetails {
	public String Uniquecode;
	public String empid;
	public String getUniquecode() {
		return Uniquecode;
	}
	public void setUniquecode(String uniquecode) {
		Uniquecode = uniquecode;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public Logoutdetails(String uniquecode, String empid) {
		super();
		Uniquecode = uniquecode;
		this.empid = empid;
	}
	public Logoutdetails() {
		super();
	}

}
