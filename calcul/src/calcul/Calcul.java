package calcul;
import java.util.Scanner;
import java.lang.Math;
public class Calcul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisissez un premier nombre :");
		int nombre1=sc.nextInt();
		System.out.println("Saisissez un deuxième nombre :");
		int nombre2=sc.nextInt();
		System.out.println(nombre1+"+"+nombre2+"="+Math.addExact(nombre1,nombre2));
		System.out.println(nombre1+"*"+nombre2+"="+Math.multiplyExact(nombre1,nombre2));
		System.out.println(nombre1+"-"+nombre2+"="+Math.subtractExact(nombre1,nombre2));
		System.out.println(nombre1+"/"+nombre2+"="+Math.floorDiv(nombre1,nombre2));
	}
	/*public static int add(int a,int b) {
		return a+b;
	}*/
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int div(int a,int b) {
		return a/b;
	}

}
