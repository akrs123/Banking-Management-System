package com.jsp.transaction;

import com.jsp.accounts.Account;

public class AccountWithdrawTransaction {

		public void withdrawTxn(Account a,double amt) {
			if(a.isActive()) {
			a.withdrwal(amt);
			}
			else {
				System.out.println("Inactive Account");
			}
		}
}
