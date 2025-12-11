package M2_Activity6;

public class Truck extends Vehicle implements Refuelable {
	
    public Truck(int numberOfWheels, String brand) {
        super(numberOfWheels, brand);
    }

    @Override
    public void startEngine() {
    	System.out.println("The " + getNumberOfWheels() + "-wheeler " + getBrand() + " truck has been started..."); 
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the " + getNumberOfWheels() + "-wheeler " + getBrand() + " truck...");
    }
    
}