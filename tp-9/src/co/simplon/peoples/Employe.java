package co.simplon.peoples;
import co.simplon.towns.Ville;

public class Employe extends Personne{

	public String job;
	public int salaire;
	
	public Employe() {
		super();
		this.job="sans emploi";
		this.salaire=600;
	}
	
	public Employe(String nom,String prenom,int age,String adresse,Ville ville,String job,int salaire) {
		super(nom,prenom,age,adresse,ville);
		this.job=job;
		this.salaire=salaire;
	}
	
	public String toString() {
		return super.toString()+" "+this.job+" "+this.salaire;
	}
}
