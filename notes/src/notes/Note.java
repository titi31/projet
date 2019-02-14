package notes;

import java.util.Scanner;

public class Note {
	public static int lnotes = 0;
	public static int moyenne;
	public static String nombreEleves[] = { "Nicolas Bidon", "Sylvie Larouette", "Juliette Billard", "Romain Perrein" };
	public static int tabmoyenne[] = new int[nombreEleves.length];

	public static void main(String[] args) {
		
		int notes[] = { 0, 10, 20 };
		
		for (int i = 0; i < nombreEleves.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Saisissez les notes de " + nombreEleves[i] + ":");
			String note = sc.nextLine();
			String[] lnote = note.split("\\s");
			for (int j = 0; j < lnote.length; j++) {
				int lnotes1 = Integer.parseInt(lnote[j]);
				lnotes += lnotes1;
			}
			
			moyenne = lnotes / lnote.length;
			lnotes = 0;
			tabmoyenne[i] = moyenne;

		}
		for (int j = 0; j < nombreEleves.length; j++) {
			System.out.println(nombreEleves[j] + " a " + tabmoyenne[j] + " de moyenne");
		}
	}

}
