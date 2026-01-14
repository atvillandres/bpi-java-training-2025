package ph.com.bpi.M4_Activity5;

public class AccountValidator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Account Number Validation Test ===");
		testValidation("Test 1: Valid account (1234567890)","1234567890");
		testValidation("Test 2: Too short (123)", "123");
		testValidation("Test 3: Contains letters (12345ABC90)", "12345ABC90");
		testValidation("Test 4: Contains spaces (1234 57890)", "1234 57890");
		testValidation("Test 5: Null value",null);
	}
	
	public static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException{

		if (accountNumber == null || accountNumber.isEmpty()) {
			throw new NullPointerException ("Account number cannot be null");
		}
			
		for (char c : accountNumber.toCharArray()) {
			if (!Character.isDigit(c))
				throw new InvalidAccountFormatException("Account number must contain only digits");
		}
			
		int length = accountNumber.length();
			
		if (length == 10) {
			System.out.println("Valid account number: " + accountNumber);
		} else {
			throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
		}
	}
	
	public static void testValidation(String testName,  String accountNumber) {
		System.out.println();
		System.out.println(testName);
		try {
			validateAccountNumber(accountNumber);
		} catch (InvalidAccountNumberException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidAccountFormatException e) {
			System.out.println("Warning: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Warning: " + e.getMessage());
		} 
	}
}
