package com.jsp.accounts;

public class SavingsAccount extends Account {

	public SavingsAccount(String accnum, double accbal, boolean isActive, String custname) {
		super(accnum,accbal, isActive,custname);
		
	}

	@Override
	public void deposit(double amt) {
		System.out.println("Depositing Rs "+amt);
		this.setAccbal(this.getAccbal()+amt);
		
	}

	@Override
	public void withdrwal(double amt) {
		System.out.println("Withdrwaing Rs "+amt);
		
		if(amt<this.getAccbal()) {
			this.setAccbal(this.getAccbal()-amt);
			}
		else {
				System.out.println("Insufficient Balance");
			 }
		
	}
	
	
	

}
