import java.util.Scanner;

/**
 * 	Il faut résoudre la division -b/a<br/>
 *	 En vérifiant que a n'est pas à 0
 */
public class Exo1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==0) {
			System.out.println("On divise pas par 0!!!!");
		} else {
			double x = (double) -b/a;
			System.out.println("x="+x);
		}
		
	}

}
