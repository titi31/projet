import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Console;
//import java.util.regex;
public class pendu {
	public static String [] trouve;
	public static int i=0;
	public static String cara;
	public static int chance=8;
	public static String mot;
	public static String motdevin;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Console console=System.console();
		while(true) {
		System.out.println("Choisissez un mot à faire devinez :");
		char[] motc=console.readPassword();
		mot=new String(motc);
		//mot=sc.nextLine();
		mot=mot.toLowerCase();
		trouve=new String[mot.length()];
		if(mot.matches(".*\\W+.*|.*\\d+.*")) {
			System.out.println("pas de chiffre !");
			continue;
		}
		
		motdevin=mot.trim().replaceAll("([a-z])", "?");
		System.out.println(motdevin);
		break;
		}
		
		while(true) {
			if(motdevin.indexOf("?")==-1) {
				System.out.println(motdevin);
				System.out.println("Vous avez gagnez !");
				break;
			}
			if(chance==-1) {
				System.out.println("Vous avez perdu. Le mot est "+mot);
				break;
			}
			System.out.println(motdevin);
			System.out.println("Tape une lettre pour devinez le mot :");
			
			String taper=sc.next();
			taper=taper.toLowerCase();
			    
			if(mot.indexOf(taper)!=-1) {
				trouve[i]=taper;
			
				for (var j=0;j<=i;j++) {
				
				cara+=trouve[j];
				cara=cara.replace("null","");
				motdevin=mot.replaceAll("([^"+cara+"])", "?");}
				i++;
			
				continue;
			}else if(mot.indexOf(taper)==-1 && taper.length()<=1 && !taper.matches(".*\\W+.*|.*\\d+.*")) {
				System.out.println("Le mot ne contient pas cette lettre.Vous avez "+chance+" point de chance.");
				chance--;
				continue;
			}else if(taper.length()>1) {
				System.out.println("une seule lettre");
				continue;
			}else if(taper.matches(".*\\W+.*|.*\\d+.*")) {
				System.out.println("caractères interdit !");
				continue;
			}
			
			
		
		}
	}
}