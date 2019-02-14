package tp8;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private String adresse;
	private Ville VilleNaissance;

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
		this.VilleNaissance = new Ville(ville.getNom(),ville.getPays(),ville.getNbHabitants());
	}

	public static void main(String[] args) {
		Ville lille = new Ville("Lille","france",5000);
		Personne p2 = new Personne("Laude","Bernard",30,"32 rue des roys a Lille",lille);
		
		lille.display();
		lille = new Ville("Strasbourg","france",35000);
		lille.display();
		
		//Personne p1 = new Personne("Dupont", "Henri", 51, "3 rue des rosiers a Nice", "Paris", "france", 5000);
		//p1.display();
		p2.display();

	}

	public void display() {
		System.out.println(this.nom + "," + this.prenom + "," + this.age + "," + this.adresse + " Il est nait a "
				+ this.VilleNaissance.getNom() + "," + this.VilleNaissance.getPays() + ","
				+ this.VilleNaissance.getNbHabitants());
	}

}
