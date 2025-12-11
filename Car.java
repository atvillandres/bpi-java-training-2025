package M2_Activity6;

public class Car extends Vehicle implements Refuelable {
	
    public Car(int numberOfWheels, String brand) {
        super(numberOfWheels, brand);
    }

    @Override
    public void startEngine() {
    	System.out.println("The " + getNumberOfWheels() + "-wheeler " + getBrand() + " car has been started..."); 
        }

    @Override
    public void refuel() {
        System.out.println("Refueling the " + getNumberOfWheels() + "-wheeler " + getBrand() + " car...");
    }
    
}