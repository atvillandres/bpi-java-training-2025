package M1_Activity1;

import java.util.Scanner;

/**
 * 
 */

public class BasicJavaActivity1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine(); //input
		System.out.println("Hello, " + name + "!:)");
		
		scanner.close();
	}

}
