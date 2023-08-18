package FinalAndConstructor;

public class Main {

	public static void main(String[] args) {
		Antivirus antivirus = new Antivirus();
        Transaction transaction = new Transaction();
        //transaction.performTransaction();
        antivirus = new Antivirus("PRODUCT KEY");
        antivirus.activate(transaction);
		

	}

}
