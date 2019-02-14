package phrase;
import java.util.Scanner;
public class Mot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String phrase="il fait beau aujourd'hui";
		if(phrase.indexOf("beau")!=-1) {
			System.out.println("mot trouvé");
			System.out.println("Saisissez un mot a mettre :");
			String mot=sc.nextLine();
			phrase=phrase.replace("beau", mot);
			System.out.println(phrase);
		}else {
			System.out.println("mot non trouvé");
		}

	}

}
