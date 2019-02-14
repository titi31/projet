package notes;

import java.util.Scanner;

public class Eleves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eleves[] = { "franck teddy", "nicolas bogdanov", "mohamed meillard", "orlando bissard" };

		System.out.println("Saisissez un eleves pour savoir si il est dans l'école :");
		String eleve = sc.nextLine();
		String str = "Non existant";

		for (int i = 0; i < eleves.length; i++) {
		
			if (eleves[i].equals(eleve)) {
				str = "Existe";
			}
	
		}
		System.out.println(str);

	}
}
