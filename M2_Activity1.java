package M2_Activity1;

public class M2_Activity1 {

	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.author = "HYBE";
		myBook.title = "Dark Moon: The Blood Altar";
		myBook.bookInfo();
		
		System.out.println("");
		
		House myHouse = new House();
		myHouse.street = "3367 Sinagtala St.";
		myHouse.barangay = "Bahay Toro";
		myHouse.city = "Quezon City";
		myHouse.state= "Metro Manila";
		myHouse.country = "Philippines";
		myHouse.zipcode = "1106";
		myHouse.address();
		
		System.out.println("");
		
		Tree myTree = new Tree();
		myTree.name = "Coconut";
		myTree.count = 25;
		myTree.treeInfo();
	}

}
