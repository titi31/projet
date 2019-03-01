package tp8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Voiture {
	private String marque;
	private String type;
	public static String[] voiture;
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
		
		
			
			
		}
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Que voulez vous?ajouter au stock (1) regarder stock (2) supprimer du stock (3) quitter(4): ");
			int client=sc.nextInt();
			if(client==1) {
				ajouter(stock);
				continue;
			}else if(client==2) {
				afficherStock(stock);
				continue;
			}else if(client==3) {
				supprimer(stock);
				continue;
			}else if(client==4) {
				System.out.println("a bientot");
				break;
			}
		}
	
		
		
		
		
	}
	public static void afficherStock(ArrayList<Voiture> tab) {
		for(int i=0;i<tab.size();i++) {
			System.out.print(tab.get(i).marque+" ");
			System.out.println(tab.get(i).type);
		
		}
		
	}
	public static void ajouter(ArrayList<Voiture> tab) {
			Scanner ajm=new Scanner(System.in);
			System.out.println("Rentrer la marque de la voiture :");
			String marqu =ajm.nextLine();
			Scanner ajt=new Scanner(System.in);
			System.out.println("Rentre le type de la voiture "+marqu+": ");
			String typ=ajt.nextLine();
			tab.add(new Voiture(marqu,typ));
			

	}
	public static void supprimer(ArrayList<Voiture> tab) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<tab.size();i++) {
			System.out.println((i+1)+"-"+tab.get(i).marque+" "+tab.get(i).type);
		}
		System.out.println("Quel voiture avez vous vendu ? ");
		int vendre=sc.nextInt();
		tab.remove(tab.get(vendre-1));
	}

}
