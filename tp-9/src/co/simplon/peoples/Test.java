package co.simplon.peoples;
import co.simplon.towns.Ville;
import java.util.Iterator;

import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		ArrayList<Employe> employers=new ArrayList<Employe>();
		
		Employe p=new Employe();
		Ville v1=new Ville("Londre","Angleterre",2000);
		Ville v2=new Ville("Paris","France",4000);
		Ville v3=new Ville("New York","USA",4000);
		employers.add(new Employe("chirey","bernard",27,"1 bis avenue mars 33000 Bordeaux ",v1,"Google",5000));
		employers.add(new Employe("Cathy","Lassale",20,"3 street of the London ",v2,"Simplon",1200));
		employers.add(new Employe("Allan","Cerveaux",20,"3 street of the London ",v3,"Simplon",1200));
		employers.add(new Employe("Alex","Masson",45,"3 street of the London ",v3,"CIA",8000));
		employers.add(new Employe("Mark","Zuckerberg",30,"3 street of the London ",v3,"facebook",100000000));
		employers.add(new Employe("Bill","Gate",50,"3 street of the London ",v3,"Microsoft",100000000));
		employers.add(new Employe("Steve","Job",90,"3 street of the London ",v3,"Apple",100000000));
		employers.add(new Employe("Michael","Callery",35,"3 street of the London ",v3,"Amazon",7000));
		employers.add(new Employe("Michael","Jackson",90,"3 street of the London ",v3,"France2",3000));
		employers.add(new Employe("Edward","Snodwen",50,"3 street of the London ",v3,"NSA",8000));
		
		int i=0;
		Iterator it = employers.iterator(); 
		 while(it.hasNext()) {
		
			System.out.println(it.next());
			
			
		}
	}
}
