package com.jsp.accounts;

public class SavingsAccountClose 
{
	public boolean closeSavingsAccount(SavingsAccount sa) {
		boolean isSuccess=true;
		sa.setActive(false);
		if(sa.isActive()==true) {
			isSuccess=false;
		}
		return isSuccess;
	}

}
