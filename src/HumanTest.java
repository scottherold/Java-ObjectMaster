// Imports the Human class
import com.sherold.humanclasses.*;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		
		// Human test
		h1.attack(h2);
		h2.displayHealth();
		
		// Ninja test
		Ninja n1 = new Ninja();
		n1.runAway();
		n1.displayHealth();
		n1.steal(h1);
		n1.displayHealth();
		n1.attack(h1);
		h1.displayHealth();
		
		// Wizard test
		Wizard w1 = new Wizard();
		w1.health(h1);
		h1.displayHealth();
		w1.fireball(n1);
		n1.displayHealth();
		
		// Samurai test
		Samurai s1 = new Samurai();
		s1.deathBlow(h1);
		h1.displayHealth();
		s1.meditate();
		s1.displayHealth();
		System.out.println(s1.howMany());
	}

}
