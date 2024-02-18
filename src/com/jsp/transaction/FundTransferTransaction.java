package com.jsp.transaction;

import com.jsp.accounts.Account;
import com.jsp.accounts.LoanAccount;
import com.jsp.accounts.SavingsAccount;

public class FundTransferTransaction {

	public void fundTransfer(Account fromAcc,Account toAcc,double amount) {
		if(fromAcc.isActive() && toAcc.isActive()) {
			if(fromAcc instanceof SavingsAccount && toAcc instanceof SavingsAccount) {
				fromAcc.withdrwal(amount);
				toAcc.deposit(amount);
			}else if(fromAcc instanceof SavingsAccount && toAcc instanceof LoanAccount) {
				fromAcc.withdrwal(amount);
				toAcc.deposit(amount);
			}
		}
		else {
			System.out.println("one of the account is inactive");
		}
	}
}
