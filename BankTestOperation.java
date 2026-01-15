package ph.com.bpi.M4_Activity7;

@FunctionalInterface 
public interface BankTestOperation {
	
	public void execute() throws InvalidAmountException, InsufficientFundsException;

}