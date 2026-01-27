package ph.com.bpi.M4_Activity8;

public class InsufficientFundsException extends Exception {

	String message;
	Double balance;
	Double requestedAmount;

	public InsufficientFundsException(String message, Double balance, Double requestedAmount) {
		super(message);
		this.message = message;
		this.balance = balance;
		this.requestedAmount = requestedAmount;
	}
	
	public String getMessage() {
		return message;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getRequestedAmount() {
		return requestedAmount;
	}
	
}
