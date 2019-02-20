package co.simplon.shapes;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//Point2D tri=new Point2D(2,3);
		Point2D centreT=new Point2D(2,3);
		Point2D centreC=new Point2D(5,10);
		Point2D centreCE=new Point2D(5,20);
		Triangle triangle=new Triangle(centreT,25,50);
		Carre carre=new Carre(centreC,5);
		
		Cercle cercle=new Cercle(centreCE,10);		
		//System.out.println(cercle);
		
		ArrayList<Formes> listeFormes=new ArrayList<Formes>();
		listeFormes.add(cercle);
		listeFormes.add(triangle);
		listeFormes.add(carre);
		for(int i=0;i<listeFormes.size();i++) {
			System.out.println(listeFormes.get(i) + " " + listeFormes.get(i).area()+" "+listeFormes.get(i).perimetre());
		}
		
		triangle.deplacer(5, 13);
		System.out.println("\n");
		afficherForme(listeFormes);
		//System.out.println(triangle.aireT()+" "+carre.aireC()+" "+cercle.aireR());

	}public static void afficherForme(ArrayList<Formes> liste) {
		for(int i=0;i<liste.size();i++) {
			System.out.println(liste.get(i) + " " + liste.get(i).area()+" "+liste.get(i).perimetre());
		}
	}

}
