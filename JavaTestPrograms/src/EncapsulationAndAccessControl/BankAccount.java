package EncapsulationAndAccessControl;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String ownerName;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public double getbalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName=ownerName;
	}
	public void deposit(int amt) {
		balance = balance+amt;
		System.out.println("New balance is: "+balance);
	}
	public void withdraw(int amt) {
		if(balance<amt) {
			System.out.println("Insufficient balance");
		}
		else {
			balance-=amt;
			System.out.println("Remaining balance is: "+balance);
		}
	}
	
	

}
