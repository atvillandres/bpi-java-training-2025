package M2_Activity3;

public class M2_Activity3 {

	public static void main(String[] args) {	
		// Using parameter
		System.out.println("CAR DETAILS:");
		System.out.println("+-------------+-------------+-------------+-------------+-------------+");
		System.out.println("|   Car No.   |    Brand    |     Model   |     Type    |     Year    |");
		System.out.println("+-------------+-------------+-------------+-------------+-------------+");
		
		Car myCar1 = new Car(1,"Lexus", "UX 300e ", "Battery", 2019);
        myCar1.details();
        
        // Using setter and getter
        Car myCar2 = new Car();
        myCar2.setNumber(2);
        myCar2.setBrand("Jeep ");
        myCar2.setModel("Wrangler");
        myCar2.setType("Hybrid ");
        myCar2.setYear(2021);
        myCar2.details();   
        

	}

}
