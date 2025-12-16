package ph.com.bpi.M3_Activity2;
import java.util.*;


public class M3_Activity2 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> products = new HashSet<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		menu(products);		
		
		scanner.close();
	}
	
	public static void decision(Set<String> products, String option) {
		switch(option) {
		case "1":
			System.out.print("Enter product name to search: ");	
			String searchProduct = scanner.next();
			search(products, searchProduct);
			System.out.println();
			menu(products);
			break;
		case "2":
			System.out.print("Enter product name to add: ");
			String addProduct = scanner.next();
			add(products, addProduct);
			System.out.println();
			menu(products);
			break;
		case "3":
			print(products);
			System.out.println();
			menu(products);
			break;
		case "4":
			exit();
			break;
			
		}
	}
	
	public static void search(Set<String> products, String product) {
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
	
	public static void add(Set<String> products, String product) {
		products.add(product);
		System.out.println("Product added: " + product);
	}
	
	public static void print(Set<String> products) {
		for (String product : products) {
			System.out.println(product);
		}
		System.out.println("Total unique products: " + products.size());
	}
	
	public static void exit() {
		System.out.println("Exiting...");
	}
	
	public static void menu(Set<String> products) {
		System.out.println("Select an option:");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and count");
		System.out.println("4. Exit");
		System.out.print("> ");
		String option = scanner.next();
		decision(products, option);
	}

}