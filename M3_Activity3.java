package ph.com.bpi.M3_Activity3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class M3_Activity3 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> products = new HashMap<>();
		products.put("Laptop", 50000);
		products.put("Monitor", 7000);
		products.put("Mouse", 500);
		products.put("Keyboard", 1000);
		products.put("Printer", 6000);
		
		menu(products);		
		
		scanner.close();
	}
	
	public static void menu(Map<String, Integer> products) {
		System.out.println("Select an option:");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and prices");
		System.out.println("4. Find the cheapest product");
        System.out.println("5. Exit");
		System.out.print("> ");
		String option = scanner.next();
		decision(products, option);
	}
	
	public static void decision(Map<String, Integer> products, String option) {
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
			System.out.print("Enter price: ");
			Integer addPrice = scanner.nextInt();
            add(products, addProduct, addPrice);
			System.out.println();
			menu(products);
			break;
		case "3":
			System.out.println();
			System.out.println("All products and prices:");
			print(products);
			System.out.println();
			menu(products);
			break;
		case "4":
			findCheapest(products);
			System.out.println();
			menu(products);
			break;
		case "5":
			exit();
			break;
			
		}
	}
	
	public static void search(Map<String, Integer> products, String searchProduct) {
        if (products.containsKey(searchProduct)) {
            System.out.println("Product found! Price: " + products.get(searchProduct));
        } else {
        	System.out.println("Product not found!");
		}
	}
	
	public static void add(Map<String, Integer> products, String product, Integer price) {
		products.put(product, price);
		System.out.println("Product added: " + product);
	}
	
	public static void print(Map<String, Integer> products) {
		for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
		System.out.println("Total products: " + products.size());
	}
	
	public static void findCheapest(Map<String, Integer> products) {
		String cheapestProduct = null;
		Integer lowPrice = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
                                   if (entry.getValue() < lowPrice) {
                lowPrice = entry.getValue();
                cheapestProduct = entry.getKey();
            }
        }
        System.out.println("Cheapest product: " + cheapestProduct + " - " + lowPrice);
	}
		
	public static void exit() {
		System.out.println("Exiting...");
	}
}