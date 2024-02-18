package com.jsp.accounts;

public class LoanAccountCreation {

	private static int random=10001;
	final private static String acctype="57000299";
	
	public LoanAccount createLoanAccount(double loanAmt,String custname,int tenure) {
		LoanAccount la=new LoanAccount(acctype+random++,loanAmt,true,custname,tenure);
		return la;
	}
}
