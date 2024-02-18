package com.jsp.transaction;

import com.jsp.accounts.Account;

public class AccountDepositTransaction {

	public void depositTxn(Account a,double amt) {
		if(a.isActive()) {
		a.deposit(amt);
		}
		else {
			System.out.println("Inactive Account");
		}
	}
}
