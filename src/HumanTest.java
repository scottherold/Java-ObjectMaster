// Imports the Human class
import com.sherold.humanclasses.*;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.attack(h2);
		h2.displayHealth();
	}

}
