package lvl5week3;
class Car{
	private String model;
	private double price;
	private double fuelLevel;
	
	public Car(String model, double price, double fuelLevel) {
		this.model = model;
        this.price = price;
        this.fuelLevel = fuelLevel;
	}   
        public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getFuelLevel() {
        return fuelLevel;
    }
}
public class Q2 {
	 public static void main(String[] args) {
	       
	        Car car = new Car("Deepal", 50000.0, 75.5);

	      
	        System.out.println("Model: " + car.getModel());
	        System.out.println("Price: $" + car.getPrice());
	        System.out.println("Fuel Level: " + car.getFuelLevel() + "%");

	       
	        car.setModel("Deepal V2");
	        car.setPrice(80000.0);

	       
	        System.out.println("Updated Model: " + car.getModel());
	        System.out.println("Updated Price: $" + car.getPrice());
	        System.out.println("Fuel Level (unchanged): " + car.getFuelLevel() + "%");
	    }

}
