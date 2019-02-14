package co.simplon.towns;

public class Test {

	public static void main(String[] args) {
		Capitale cap = new Capitale();
		Capitale cap1 = new Capitale("Paris","france",2000,"Tour Effeil");
		System.out.println(cap);
		System.out.println(cap1);
		cap1.setMonument("statut de la liberte");
		cap1.setNom("New York");
		cap1.setPays("USA");
		System.out.println(cap1);		

	}

}
