package tp8;

public class Test {

	public static void main(String[] args) {
		System.out.println("Il y a " + Ville.getNbinstance() + " villes!");
		
		Ville v1 = new Ville("toulouse", "france", 10000);
		Ville v2 = new Ville("Los Angeles", "USA", 150000);
		Ville v3 = new Ville("Paris", "france", 1000);
		
		System.out.println("Il y a " + v1.getNbinstance() + " villes!");
		
		v1.display();
		v1.setNbHabitants(-200);
		v1.display();
		v2.display();
		v3.display();
	}
}
