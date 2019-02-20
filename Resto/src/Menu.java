import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		//affichMenu();
		Scanner sc=new Scanner(System.in);
		System.out.println("Bonjour et bienvenue dans le restaurant du coeur");
		String menu[]={"moules","vegetarien","vegan","gigot"};
		String accompagnements[]={"frites","ketchup","salade"};
		String boissons[]={"coca","fanta","bieres","diabolo menthe"};
		System.out.println("Combien de menu vous voulez ?");
		int nombreMenu=sc.nextInt();
		String menu1="menu";
		String accompagenement1="accompagnement";
		String boisson1="boisson";
		int personne=1;
		String[][] menuGent= new String[nombreMenu][3];
		while(personne<=nombreMenu){
			System.out.println("Personne "+personne+" Quel menu vous voulez ?");
	
			/*for (int i=0;i<menu.length;i++){
				System.out.println((i+1)+"-"+menu[i]);
			}
		
			System.out.print("Quel menu voulez vous ?");
			int menuc=sc.nextInt();
			System.out.println("Vous avez choisi le menu "+menuc);
			System.out.println("Personne "+personne+" Quel accompagenments vous voulez ?");
			menuGent[personne-1][0]=menu[menuc-1];
		
			for (int i=0;i<accompagnements.length;i++){
				System.out.println((i+1)+"-"+accompagnements[i]);
			}
		
			System.out.print("Quel accompagnements voulez vous ?");
			int accompagnement=sc.nextInt();
			System.out.println("Vous avez choisi l'accompagnement "+accompagnement);
			System.out.println("Personne "+personne+" Quel boisson vous voulez ?");
			menuGent[personne-1][1]=accompagnements[accompagnement-1];
			for (int i=0;i<boissons.length;i++){
				System.out.println((i+1)+"-"+boissons[i]);
			}
		
			System.out.print("Quel boissons voulez vous ?");
			int boisson=sc.nextInt();
			System.out.println("Vous avez choisi la boisson "+boisson);
			System.out.println("Vous avez choisi le menu "+menu[menuc-1]);
			System.out.println("Vous avez choisi l'accompagnement "+accompagnements[accompagnement-1]);
			System.out.println("Vous avez choisi la boisson "+boissons[boisson-1]);
			menuGent[personne-1][2]=boissons[boisson-1];
			personne=personne+1;
			//continue;
		
			for (int i=0;i<menuGent.length;i++){
				System.out.println("Personne "+(i+1)+":");
				System.out.println("a choisi en menu "+menuGent[i][0]);
				System.out.println("a choisi en accompagenment "+menuGent[i][1]);
				System.out.println("a choisi en boisson "+menuGent[i][2]);
			}*/
		}
	}
	
	public static String saisirMenu(String menu,String[] tab,int personne,String[][] menuGent) {
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<tab.length;i++){
			System.out.println((i+1)+"-"+tab[i]);
		}
	
		System.out.print("Quel "+menu+" voulez vous ?");
		int menuc=sc.nextInt();
		System.out.println("Vous avez choisi le menu "+menuc);
		System.out.println("Personne "+personne+" Quel accompagenments vous voulez ?");
		menuGent[personne-1][0]=tab[menuc-1];		
	}
}
