package bankingSystemAbstraction;

public class SavingsAccount extends BankAccount {
	
	double interestRate;
	SavingsAccount(String accountNumber, String accountHolderName, double balance){
		this.setAccountNumber(accountNumber);
		this.setAccountHolderName(accountHolderName);
		this.setBalance(balance);
		
	}
	
	
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Balance after depositing "+amount+" is: "+balance);
	}
	void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance-=amount;
			System.out.println("Balance after withdrawing "+amount+" is: "+balance);
		}
	}
	

}
