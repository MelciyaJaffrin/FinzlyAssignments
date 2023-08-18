package FinalAndConstructor;

public class Transaction {
	private boolean transactionDone;
    Transaction(){
        this.transactionDone = false;
    }
    public boolean transactionDone() {
        return transactionDone;
    }
    public void performTransaction(){
        transactionDone = true;
    }

}
