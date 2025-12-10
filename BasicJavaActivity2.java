package M1_Activity2;

import java.util.Scanner;

/**
 * 
 */

public class BasicJavaActivity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		String age = input.next();
		
		int iage = Integer.parseInt(age);
		System.out.println("Your age as int is: " + iage);
		
		double dage = Double.parseDouble(age);
		System.out.println("Your age as double is: " + dage);
		
		input.close();
	}
 
}
