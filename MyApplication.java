package M2_Activity6;

public class MyApplication {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Car car = new Car(4, "Lexus");
        Truck truck = new Truck(10, "Hino");
            
        car.startEngine();
        car.refuel();

        System.out.println("");
        
        truck.startEngine();
        truck.refuel();
        
        System.out.println("");

        destroyVehicle(car);
        destroyVehicle(truck);
     }

     public static void destroyVehicle(Vehicle vehicle) {
         vehicle.destroy();
     }
 }