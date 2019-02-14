package tp8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Voiture {
	private String marque;
	private String type;
	public static String[] voitur;
	public Voiture() {
		this.marque="rien";
		this.type="rien";
		
	}
	public Voiture(String marque,String type) {
		this.marque=marque;
		this.type=type;
	}
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		ArrayList<Voiture> stock=new ArrayList<Voiture>();
		System.out.println("Combien voulez vous de voiture ? ");
		int nbVoiture=sca.nextInt();
		for(int i=0;i<nbVoiture;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Rentre la marque de la voiture :");
			String marque=sc.nextLine();
			Scanner scan=new Scanner(System.in);
			System.out.println("Rentre le type de la voiture "+marque+": ");
			String type=scan.nextLine();
			
			stock.add(new Voiture(marque,type));
		
		
			
		}for(int i=0;i<stock.size();i++) {
			System.out.print(stock.get(i).marque+" ");
			System.out.println(stock.get(i).type);
		
		}
	}
	public static void afficherStock(Voiture[] tab) {
		
	}

}
