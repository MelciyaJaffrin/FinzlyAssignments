package bankingSystemAbstraction;

public class CheckingAccount extends BankAccount {
	
	double overDraftLimit=10000;
	CheckingAccount(String accountNumber, String accountHolderName, double balance){
		this.setAccountNumber(accountNumber);
		this.setAccountHolderName(accountHolderName);
		this.setBalance(balance);
	}

	

	@Override
	void withdraw(double amount) {
		if(amount<balance || amount<overDraftLimit) {
			balance=balance-amount;
			System.out.println("Balance after withdrawal is: "+getBalance());
			
		}
		else {
			System.out.println("Cannot withdraw amount greater than overdraft limit");
		}
		
	}



	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

}
