package tp8;

public class Ville {
	private String name;
	private String country;
	private int nbHabitants;
	private static int nbInstance = 0;

	public Ville() {
		this.name = "rien";
		this.country = "rien";
		this.nbHabitants = 0;
		this.nbInstance++;

	}

	public Ville(String nomVille, String nomPays, int nbHabitant) {
		this.name = nomVille;
		this.country = nomPays;
		this.nbHabitants = nbHabitant;
		this.nbInstance++;
	}

	/*
	 * public static void main(String[] args) { Ville vtest = new Ville(); Ville v1
	 * = new Ville("toulouse", "france", 10000); Ville v2 = new Ville("Los Angeles",
	 * "USA", 150000); Ville v3 = new Ville("Paris", "france", 1000);
	 * vtest.display(); v1.display(); v2.display(); v3.display();
	 * 
	 * }
	 */

	public static int getNbinstance() {
		return nbInstance;
	}

	public void setNbHabitants(int nbHabitant) {
		if (nbHabitant < 0)
			this.nbHabitants = 0;

		else
			this.nbHabitants = nbHabitant;
	}

	public int getNbHabitants() {
		return this.nbHabitants;
	}

	public void setNom(String nomVille) {
		this.name = nomVille;
	}

	public String getNom() {
		return this.name;
	}

	public void setPays(String nomPays) {
		this.country = nomPays;
	}

	public String getPays() {
		return this.country;
	}

	public void display() {

		System.out.println("Ma ville est " + this.getNom() + ". Mon pays est " + this.getPays()
				+ ". Le nombre d'habitant est " + this.getNbHabitants());
	}
}
