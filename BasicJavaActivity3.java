package M1_Activity3;

import java.util.Scanner;

/**
 * 
 */

public class BasicJavaActivity3  {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read user input for first integer
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        // Read user input for second integer
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        
		input.close();

    }
}
