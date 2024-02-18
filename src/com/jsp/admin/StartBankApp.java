package com.jsp.admin;

import com.jsp.accounts.LoanAccount;
import com.jsp.accounts.LoanAccountClose;
import com.jsp.accounts.LoanAccountCreation;
import com.jsp.accounts.SavingsAccount;
import com.jsp.accounts.SavingsAccountClose;
import com.jsp.accounts.SavingsAccountCreation;
import com.jsp.transaction.AccountDepositTransaction;
import com.jsp.transaction.AccountWithdrawTransaction;
import com.jsp.transaction.FundTransferTransaction;
import com.jsp.transaction.ViewAccountBalance;

public class StartBankApp {

	public static void main(String[] args) {
		System.out.println("======Welcome to SBI Banking System======");
		
		SavingsAccountCreation sac=new SavingsAccountCreation();
		SavingsAccountClose saclose=new SavingsAccountClose();
		LoanAccountCreation lac=new LoanAccountCreation();
		LoanAccountClose laclose=new LoanAccountClose();
		
		ViewAccountBalance vab=new ViewAccountBalance();
		AccountDepositTransaction adt=new AccountDepositTransaction();
		AccountWithdrawTransaction awt=new AccountWithdrawTransaction();
		FundTransferTransaction ftt=new FundTransferTransaction();
		
		SavingsAccount s=sac.CreateSavingsAccount("Balaji Dileep", 20000.00);
		System.out.println("Customer Name:"+s.getCustname());
		vab.viewBalance(s);

		SavingsAccount s1=sac.CreateSavingsAccount("Kinshu", 10000.00);
		vab.viewBalance(s1);
		ftt.fundTransfer(s, s1, 5000.00);
		System.out.println("Customer Name:"+s1.getCustname());
		vab.viewBalance(s1);
		vab.viewBalance(s);
		
		
		System.out.println("=========================================");
		LoanAccount r=lac.createLoanAccount(700000.00, "Balaji Dileep", 18);
		System.out.println("Loan Account Created");
		System.out.println("Loan Account Number:"+r.getAccnum());
		System.out.println("Customer Name:"+r.getCustname());
		vab.viewBalance(r);
		adt.depositTxn(r, 50000.00);
		vab.viewBalance(r);
		laclose.closeLoanAccount(r);
		vab.viewBalance(r);

	}

}
