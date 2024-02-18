package com.jsp.transaction;

import com.jsp.accounts.Account;


public class ViewAccountBalance {
	
//	public void viewBalance(SavingsAccount sa) {
//		System.out.println("Account Balance Rs "+sa.getAccbal());
//	}
//	public void viewBalance(LoanAccount la) {
//		System.out.println("Account Balance Rs "+la.getAccbal());
//	}
	
	public void viewBalance(Account a) {
		if(a.isActive()) {
			System.out.println("Account Balance Rs "+a.getAccbal());
		}
		else {
			System.out.println("Inactive Account");
		}
	}

}
