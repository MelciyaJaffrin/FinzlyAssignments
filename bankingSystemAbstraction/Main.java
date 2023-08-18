package bankingSystemAbstraction;

public class Main  {

	public static void main(String[] args) {
		
		SavingsAccount s=new SavingsAccount("123","aaa",1000.0);
		CheckingAccount c=new CheckingAccount("234","bbb",12000.0);
		s.displayInfo();
		s.deposit(200.0);
		s.withdraw(100.0);
		c.displayInfo();
		c.withdraw(2000.0);
		

	}

}
