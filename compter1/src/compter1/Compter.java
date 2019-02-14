package compter1;
import java.util.Scanner;
public class Compter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisissez nombre de depart :");
		int depart=sc.nextInt();
		System.out.println("Saisissez nombre finale :");
		int finale=sc.nextInt();
		int moitie=(finale+depart)/2;
		for (int i=depart;i<=finale;i++) {
		
		if(i==moitie) {
			System.out.println("moitié");
		}else {
			System.out.println(i);
		}
		}
	}

}
