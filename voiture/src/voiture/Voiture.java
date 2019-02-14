package voiture;
import java.util.Scanner;
public class Voiture {
	public static String[] stock;
	public static Scanner sc=new Scanner(System.in);
	public static String[] stock1;
	public static void main(String[] args) {

		System.out.println("Combien voulez vous de voiture ?");
		int nbVoiture=sc.nextInt();
		stock=new String[nbVoiture];

		for(int i=0;i<stock.length;i++) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Quel est la marque, le type et le prix de la voiture ? ");
			String voiture=scan.nextLine();
			stock[i]=voiture;

		}

		while(true) {
			System.out.println("Que choisissez-vous ?(1-afficher le stock,2-supprimer du stock,3-quitter ou 4-ajouter voiture)");
			int choix=sc.nextInt();
			if(choix==1) {
				afficherStock(stock);}
			else if(choix==2) {
				supprimerStock(stock);}
			else if(choix==3) {
				System.out.println("a bientot !");
				break;
			}
			else if(choix==4) {
				nbVoiture++;
				stock1=new String [nbVoiture];
				System.out.println(stock1.length);
				for(int i=0;i<stock.length;i++) {
					stock1[i]=stock[i];
				}
				stock=stock1;
				System.out.println(stock.length+" "+stock1.length);
				Scanner sca=new Scanner(System.in);
				System.out.println("Ajoute ta voiture :");
				String ajout=sca.nextLine();
				stock[nbVoiture-1]=ajout;
				afficherStock(stock);
			}
		}
	}public static void afficherStock(String[] tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}}
	public static void supprimerStock(String[] tab) {
		System.out.println("Avez vous vendu une voiture ?(O/N)");
		char confirm=sc.next().charAt(0);
		if(confirm=='N') {
			System.out.println("ok");
		}
		if(confirm=='O') {

			for(int i=1;i<=tab.length;i++) {
				System.out.println(i+"-"+tab[i-1]);


			}
			Scanner sci=new Scanner(System.in);
			System.out.println("Qu'avez vous vendu ?");
			int vendu=sci.nextInt();
			for(int i=0;i<tab.length;i++) {
				if(vendu==i+1) {
					tab[i]="";
				}
			}afficherStock(stock);
		}

	}

}
