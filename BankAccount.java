package ph.com.bpi.M4_Activity8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BankAccount {
	
	Double balance = (double) 10000;
	

	
	private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
		
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		
		logger.info("Withdrawal requested: ₱{}", amount);
				
			if (amount < 0) {
				logger.error("Invalid withdrawal amount: ₱{}", amount);
				throw new InvalidAmountException (String.format("Invalid withdrawal amount ₱{}", amount));
				
			} else if (amount > balance) {
				logger.warn("Insufficient funds: ₱{} available", balance);
				throw new InsufficientFundsException("Insufficient funds for withdrawal", balance, amount);

			} else {
				this.balance -= amount;
				logger.info("Withdrawal completed: ₱{}, New balance: ₱{}", amount, balance);
			}
			
	}
		
	public void deposit(double amount) throws InvalidAmountException {
		
		logger.info("Deposit requested: ₱{}", amount);
			if (amount <= 0) {
				logger.error("Invalid deposit amount: ₱{}", amount);
				throw new InvalidAmountException ("Deposit amount must be positive");
			} else {
				if (amount > 50000) {
					logger.warn("Large deposit: ₱{} - requires verification", amount);
				}
				this.balance += amount;
				logger.info("Deposit completed: ₱{}, New balance: ₱{}", amount, balance);
			}
			
	}

	public void runTest(BankTestOperation operation, String operationName) {

		try {
			operation.execute();
		} catch (InvalidAmountException e) {
			logger.error("{} failed: {}", operationName, e.getMessage());
			e.printStackTrace();
		} catch (InsufficientFundsException e) {
			logger.error("{} failed: {}", operationName, e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			logger.error("{} failed: {}", operationName, e.getMessage());
			e.printStackTrace();
		}
			
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.runTest(() -> account.deposit(5000), "Deposit");
		account.runTest(() -> account.withdraw(3000), "Withdrawal");
		//TEST: Deposit failed: Deposit amount must be positive
		account.runTest(() -> account.deposit(-500), "Deposit");
		
		//TEST: Withdrawal failed: Insufficient funds for withdrawal
		account.runTest(() -> account.withdraw(20000), "Withdrawal");
		
		account.runTest(() -> account.deposit(60000), "Deposit");
	
	}	
}
