package EncapsulationAndAccessControl;

public class Main {
	public static void main(String args[]) {
		BankAccount b=new BankAccount();
		b.setAccountNumber(123);
		b.setOwnerName("abc");
		b.setBalance(1000.00);
		System.out.println("Account number is: "+b.getAccountNumber()+", Owner name is: "+b.getOwnerName()+", Balance is: "+b.getbalance());
		b.deposit(1000);
		b.withdraw(500);
		System.out.println(b.getbalance());
		
		
	}

}
