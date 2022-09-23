package com.loginuser;

public class Loginentry {
public int intime;
public String indate;
public String outtime;
public String outdate;
public int getIntime() {
	return intime;
}
public void setIntime(int intime) {
	this.intime = intime;
}
public String getIndate() {
	return indate;
}
public void setIndate(String indate) {
	this.indate = indate;
}
public String getOuttime() {
	return outtime;
}
public void setOuttime(String outtime) {
	this.outtime = outtime;
}
public String getOutdate() {
	return outdate;
}
public void setOutdate(String outdate) {
	this.outdate = outdate;
}
public Loginentry(int intime, String indate, String outtime, String outdate) {
	super();
	this.intime = intime;
	this.indate = indate;
	this.outtime = outtime;
	this.outdate = outdate;
}
public Loginentry() {
	super();
}

}
