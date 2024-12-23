package lvl5week3;

abstract class Vehicle{
	public abstract void startEngine();
	public abstract void stopEngine();
}
class Carr extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("Car engine start");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Car engine stopped.");
	}
}	
class Motorcycle extends Vehicle {
	    @Override
	    public void startEngine() {
	        System.out.println("Motorcycle engine started.");
	    }

	    @Override
	    public void stopEngine() {
	        System.out.println("Motorcycle engine stopped.");
	    }
}
public class Q3 {
	public static void main(String[] args) {
       
        Vehicle car = new Carr();
        Vehicle motorcycle = new Motorcycle();

        
        System.out.println("Testing the Car:");
        car.startEngine();
        car.stopEngine();

        System.out.println("\nTesting the Motorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }

}

