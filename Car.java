package M2_Activity3;

public class Car {
	// Attributes
	private int number;
	private String brand;
	private String model;
	private String type;
	private int year;

	// No arg Constructor
    public Car() {    	
    }

    // Parameterized Constructor
    public Car(int number, String brand, String model,String type, int year) {
    	this.number = number;
    	this.brand = brand;
    	this.model = model;
    	this.type = type;
    	this.year = year; 
    }
    
	// Getters and Setters

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// RETURN CAR DETAILS
	public void details() {
		System.out.println("|      " + number + "      |    " + brand + "    |    " + model + " |    " + type + "  |     " + year + "    |" );
		System.out.println("+-------------+-------------+-------------+-------------+-------------+");
	}
}
