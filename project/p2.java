package com.project;
//Banking application

abstract class Account{
	private String accountNumber;
	private String accountHolder;
	private int balance;
	
	public Account(String accountNumber, String accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = 100;
		
	}
	
	
	public String getAccountNumber(){
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public int getBalance(){
		return balance;
	}
	
	
	
	public void deposit(int amount) {
	if(amount >0) {
		balance +=amount;
		System.out.println("Deposit amount successfully: current balance:"+balance);
	}	
	else {
		System.out.println("Invalid amount for deposit");
	 }
	}
	
	
	public void withdraw(int  amount) {
		if(amount>0 && balance>=amount) {balance-=amount;
		System.out.println("Withdraw successfully: credit balance:"+balance);
		}
		else {
			System.out.println("Invalid amount for withdraw");
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance=" + balance
				+ "]";
	}
	
}

class SavingsAccount extends Account{
	private int interestRate;
	public SavingsAccount(String accountNumber,String accountHolder,int interestRate) {
		super(accountNumber,accountHolder);
		this.interestRate=interestRate;
	}
	public int getInterestRate() {
		return interestRate;
	}
	
}

class CheckingAccount extends Account{
	private int overDraftLimit;
	public CheckingAccount(String accountNumber,String accountHolder,int overDraftLimit) {
		super(accountNumber,accountHolder);
		this.overDraftLimit=overDraftLimit;
	}
	
	public int getdraftLimit() {
		return overDraftLimit;
	}
	
}
public class p2 {

	public static void main(String[] args) {
Account sv=new SavingsAccount("123dfs","murugan",2);
Account ch=new CheckingAccount("321sdf","muthu",12000);

System.out.println("\nSaving Account Details........\n");
System.out.println(sv);
sv.deposit(1000);
sv.withdraw(500);

System.out.println("\nChecking Account Details.......\n");
System.out.println(ch);
ch.deposit(2000);
ch.withdraw(300);
	}

}
