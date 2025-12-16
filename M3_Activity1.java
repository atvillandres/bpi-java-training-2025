package ph.com.bpi.M3_Activity1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class M3_Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<String> products = new ArrayList<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		System.out.println("All Products:");
		
		for(int i = 0; i<5; i++) {
			System.out.println(i+1 + " " + products.get(i));
		}
		
		products.remove(1);
		products.add("Webcam");
		System.out.println(" ");
		System.out.println("After adding and removing products:");
		
		for(int i = 0; i<products.size(); i++) {
			System.out.println(i+1 + " " + products.get(i));
		}
		
		System.out.println("");
		System.out.print("Enter product name to search: ");
		String product = scanner.nextLine();
		search(products, product);
		
		scanner.close();
		
		
	}
	
	public static void search(List<?> products, String product) {
		for(int i = 0; i<products.size(); i++) {
			if(products.contains(product)) {
				System.out.println("Product Found: " + product);
				break;
			}
			if(i == products.size()-1) {
				System.out.println("Product not found. ");
			}
		}
	}
}