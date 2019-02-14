package co.simplon.towns;

public class Ville {
	public String nom;
	public String pays;
	public int nbHabitants;
	private static int nbInstance = 0;

	public Ville() {
		this.nom = "rien";
		this.pays = "rien";
		this.nbHabitants = 0;
		this.nbInstance++;

	}

	public Ville(String nomVille, String nomPays, int nbHabitant) {
		this.nom = nomVille;
		this.pays = nomPays;
		this.nbHabitants = nbHabitant;
		this.nbInstance++;
	}

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
		this.nom = nomVille;
	}

	public String getNom() {
		return this.nom;
	}

	public void setPays(String nomPays) {
		this.pays = nomPays;
	}

	public String getPays() {
		return this.pays;
	}

	public String toString() {
		
		return "ville:" + nom + " pays : " + pays
			+ "habitants : " + nbHabitants;
	}
}
