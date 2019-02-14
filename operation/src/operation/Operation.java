package operation;
import java.util.Scanner;
public class Operation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Choisissez un operateur entre entre +,-,/,* ou % :");
		String operateur=sc.nextLine();
		System.out.println("Choisissez un premier nombre :");
		int nombre1=sc.nextInt();
		System.out.println("Choisissez un deuxieme nombre :");
		int nombre2=sc.nextInt();
		if(operateur.contentEquals("+")) {
			System.out.println(nombre1+nombre2);
		}else if(operateur.equals("-")) {
			System.out.println(nombre1-nombre2);
		}else if(operateur.equals("/")) {
			System.out.println(nombre1/nombre2);
		}else if(operateur.equals("*")) {
			System.out.println(nombre1*nombre2);
		}else if(operateur.equals("%")) {
			System.out.println(nombre1%nombre2);
		}

	}

}
