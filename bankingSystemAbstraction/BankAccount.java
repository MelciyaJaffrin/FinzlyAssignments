package bankingSystemAbstraction;

public abstract class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	double balance;
	
	//abstract void getAccountNumber();
	//abstract void getAccountHolderName();
	//abstract void getBalance();
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayInfo() {
		System.out.println("Account Number is: "+this.getAccountNumber()+", Accountholder Name is: "+this.getAccountHolderName()+", Balance is: "+this.getBalance());
	}

}
