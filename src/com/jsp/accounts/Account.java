package com.jsp.accounts;

abstract public class Account {
	
	final private String accnum;
	private double accbal;
	private boolean isActive;
	private String custname;
	public Account(String accnum, double accbal, boolean isActive, String custname) {

		this.accnum = accnum;
		this.accbal = accbal;
		this.isActive = isActive;
		this.custname = custname;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAccnum() {
		return accnum;
	}
	
	public abstract void deposit(double amt);
	public abstract void withdrwal(double amt);
	

}
