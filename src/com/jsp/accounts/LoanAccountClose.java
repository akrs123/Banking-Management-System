package com.jsp.accounts;

public class LoanAccountClose {

	public boolean closeLoanAccount(LoanAccount l) {
		boolean isSuccess=true;
		l.setActive(false);
		if(l.isActive()==true) {
			isSuccess=false;
		}
		return isSuccess;
	}
}
