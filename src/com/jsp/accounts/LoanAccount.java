package com.jsp.accounts;

public class LoanAccount extends Account {

	private int tenure;

	public LoanAccount(String accnum, double accbal, boolean isActive, String custname, int tenure) {
		super(accnum, accbal, isActive, custname);
		this.setTenure(tenure);
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	@Override
	public void deposit(double amt) {
		System.out.println("Depositing Rs "+amt);
		this.setAccbal(this.getAccbal()-amt);
		
	}

	@Override
	public void withdrwal(double amt) {
		System.out.println("Withdrwaing Rs "+amt);
		this.setAccbal(this.getAccbal()+amt);
		
	}

	
	
	
}
