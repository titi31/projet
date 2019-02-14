package co.simplon.towns;

public class Capitale extends Ville{

	public String monument;

	public Capitale() {
		super();
		this.monument="aucun";
	}
	public Capitale(String ville,String pays, int habitant,String monument) {
		super(ville,pays,habitant);
		this.monument=monument;
	}
	public String toString() {
		String str=super.toString()+" Le monument est "+this.monument;
		return str;
	}
	public void setMonument(String monument) {
		this.monument=monument;

	}
	public String getMonument() {
		return this.monument;
	}

}
