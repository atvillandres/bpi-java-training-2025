package ph.com.bpi.M4_Activity2;

public class ATMSystem {
	public static void main(String[] args) {
		System.out.println("=== ATM Withdrawal System ===\n");
		System.out.println("--- Test 1: Valid Withdrawal ---");
		processWithdrawal("1", "5000");
		System.out.println("--- Test 2: Invalid Account Index ---");
		processWithdrawal("abc", "5000");
		System.out.println("--- Test 3: Account Not Found ---");
		processWithdrawal("10", "5000");
		System.out.println("--- Test 4: Insufficient Funds ---");
		processWithdrawal("1", "20000");
		System.out.println("=== All tests completed! ===");
	}
	
	public static void processWithdrawal (String accountIndex, String amountInput) {
		double[] accounts = {10000, 15000, 20000};
		try {
			System.out.println("Account=" + accountIndex + ", " + "Amount=" + amountInput);
			double balance = accounts[Integer.parseInt(accountIndex)];
			System.out.println("Current balance: ₱"+ String.format("%.2f", balance));
			double amount = Double.parseDouble(amountInput);
			System.out.println("Withdrawal: ₱" + String.format("%.2f", amount));
			if (amount > balance) {
				System.out.println("Insufficient funds! Cannot withdraw ₱" + String.format("%.2f", amount));
			} else {
				double newbalance = balance - amount;
				System.out.println("New balance: ₱" + String.format("%.2f", newbalance));
				System.out.println("Withdrawal successful!");
			}
		} catch  (NumberFormatException e) {
			System.out.println("Error: Invalid input");
			System.out.println("Please enter valid numbers.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Account not found");
			System.out.println("Invalid account index.");
		} catch (Exception e) {
			System.out.println("Transaction failed");
		}
		System.out.println();
	}

}
