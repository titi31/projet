package phrase;

public class Palindrome {
	public static String mot;
	public static void main(String[] args) {
	mot="Suce ses ecus";
	mot=mot.replaceAll(" ", "");
	mot=mot.toLowerCase();
	StringBuffer motinverse=(new StringBuffer(mot)).reverse();
	//System.out.println(mot+" "+motinverse);
	
	if(mot.contentEquals(motinverse)) {
		System.out.println("c'est un palindrome");
		}else {
			System.out.println("Ce n'est pas un palindrome");
		}
	}
}
