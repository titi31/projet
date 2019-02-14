package co.simplon.peoples;
import co.simplon.towns.Ville;

public class Personne {
	public String nom;
	public String prenom;
	public int age;
	public String adresse;
	public Ville VilleNaissance;
	
	public Personne(){
		this.nom="rien";
		this.prenom="rien";
		this.age=0;
		this.adresse="nule part";
		this.VilleNaissance=new Ville();
	}
	
	public Personne(String nom, String prenom, int age, String adresse, String VilleNom, String villePays,
			int villeNbHabitants) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.VilleNaissance = new Ville(VilleNom, villePays, villeNbHabitants);
	}
	
	public Personne(String nom, String prenom, int age, String adresse, Ville ville) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.adresse=adresse;
		this.VilleNaissance = ville;
	}

	/*
	 * public static void main(String[] args) { Ville lille = new
	 * Ville("Lille","france",5000); Personne p2 = new
	 * Personne("Laude","Bernard",30,"32 rue des roys a Lille",lille);
	 * 
	 * System.out.println(lille); lille = new Ville("Strasbourg","france",35000);
	 * System.out.println(lille);
	 * 
	 * Personne p1 = new Personne("Dupont", "Henri", 51, "3 rue des rosiers a Nice",
	 * "Paris", "france", 5000); System.out.println(p1); System.out.println(p2);
	 * 
	 * }
	 */
	public String toString() {
		return this.nom +" "+ this.prenom + " " + this.age + " " + this.adresse 
				+ " "+ this.VilleNaissance.nom + " " + this.VilleNaissance.pays + " "
				+ this.VilleNaissance.nbHabitants;
	}

}
