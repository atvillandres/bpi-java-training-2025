package ph.com.bpi.M4_Activity4;

public class AccountValidator {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 validateAccountNumber("1234567890");
		 validateAccountNumber("123");
		 validateAccountNumber(null);
	}
	
	public static void validateAccountNumber(String accountNumber) throws Exception{
		try {
			if (accountNumber == null || accountNumber.isEmpty()) {
                throw new NullPointerException ("Cannot be null");
            }
			
            int length = accountNumber.length();
			
            if (length == 10) {
				System.out.println("Valid account: " + accountNumber);
			} else {
				throw new Exception ("Must be 10 digits");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
