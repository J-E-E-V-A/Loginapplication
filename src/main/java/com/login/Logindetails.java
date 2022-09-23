package com.login;

public class Logindetails {
	public String Uniquecode;
	public String empid;
	public String getUniqcode() {
		return Uniquecode;
	}
	public void setUniqcode(String uniquecode) {
		Uniquecode = uniquecode;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public Logindetails(String uniquecode, String empid) {
		super();
		Uniquecode = uniquecode;
		this.empid = empid;
	}
	public Logindetails() {
		super();
	}
	
}
