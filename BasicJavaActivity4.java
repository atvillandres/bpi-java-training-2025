package M1_Activity4;

import java.util.Scanner;

/**
 * 
 */

public class BasicJavaActivity4 {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		String sage = input.next();
		
		int age = Integer.parseInt(sage);
        if (age <= 18) {
            System.out.println("Minor");
        } else {
        	if (age >= 60) {
            System.out.println("Senior");
        	} else {
        	System.out.println("Adult");	
        	}
        
        }
        
		input.close();
    }
}