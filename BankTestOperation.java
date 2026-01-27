package ph.com.bpi.M4_Activity8;

@FunctionalInterface 
public interface BankTestOperation {
	
	public void execute() throws InvalidAmountException, InsufficientFundsException;

}