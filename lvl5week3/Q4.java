package lvl5week3;
abstract class GameCharacter{
	public abstract void attack();
	public abstract void defend();
}
class Warrior extends GameCharacter{
	@Override
	public void attack() {
		System.out.println("Attack enemy.");
	}
	@Override
	public void defend() {
		System.out.println("Defend enemy.");
	}
}
class Archer extends GameCharacter{
	@Override
	public void attack() {
		System.out.println("Archer Attack.");
	}
	@Override
	public void defend() {
		System.out.println("Archer Defend");
	}
}
public class Q4 {
	public static void main (String args[]) {
		GameCharacter warrior = new Warrior();
		GameCharacter archer = new Archer();
		
		System.out.println("Warrior");
		warrior.attack();
		warrior.defend();
		
		System.out.println("Archer");
		archer.attack();
		archer.defend();
	}
	

}
