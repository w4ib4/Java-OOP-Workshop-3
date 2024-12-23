package lvl5week3;
interface RemoteControl{
	void powerOn(); 
	void powerOff();
}
class TV implements RemoteControl{
	@Override
	public void powerOn() {
		System.out.println("The TV is on.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("The TV is off.");
	}
}
class AC implements RemoteControl{
	@Override
	public void powerOn() {
		System.out.println("The AC is on.");
	}
	@Override
	public void powerOff() {
		System.out.println("The AC is off.");
	}
}
public class Q6 {
	public static void main(String[] args) {
		RemoteControl tv = new TV();
		RemoteControl ac = new AC();
		
		tv.powerOn();
		tv.powerOff();
		
		ac.powerOn();
		ac.powerOff();
	}

}
