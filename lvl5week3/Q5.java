package lvl5week3;
interface PaymentMethod{
	void processPayment(double amount);
}
class Esewa implements PaymentMethod{
	@Override
	public void processPayment(double amount) {
		System.out.println("Payment of Rs. " + amount + " using eSewa.");
	}
}
class Khalti implements PaymentMethod{
	public void processPayment(double amount) {
		System.out.println("Payment of Rs. " + amount + " using Khalti");
	}
}
public class Q5 {
	public static void main(String[] args) {
		
		PaymentMethod esewa = new Esewa();
		PaymentMethod khalti = new Khalti();
		
		System.out.println("Using esewa: ");
		esewa.processPayment(1500.00);
		
		System.out.println("\nUsing Khalti: ");
		khalti.processPayment(2500.00);
	}

}
