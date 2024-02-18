package com.jsp.accounts;

public class SavingsAccountCreation {

	private static int randum=1001;
	final private static String acctype="57028000";
	
	public SavingsAccount CreateSavingsAccount(String custname,double accbal) {
	  SavingsAccount sav=new SavingsAccount(acctype+randum++,accbal,true, custname);
		
	  return sav;
	}
}
