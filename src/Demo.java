import grandChildren.Crocodile;
import grandChildren.Eel;
import grandChildren.Swallow;

public class Demo {
	
	public static void main(String[] args) {
		Crocodile crocodile = new Crocodile(120, 30, "Reptile", 'A', true, true, true, true);
		System.out.println(crocodile.showInfo());
		Swallow swallow = new Swallow(10, 2, "bird", 'C', false, "test", false);
		System.out.println(swallow.showInfo());
		Eel eel = new Eel(50, 2, "fish", 'B', true, false, true);
		System.out.println(eel.showInfo());
	}

}
