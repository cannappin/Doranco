import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b || b == c || c == a) {
			System.err.println("Les valeurs saisies doivent être distinctes");
		} 	
		
		if(a > b && a > c) {
			System.out.println("C'est a le plus grand");
		}
		
		if(b > a && b > c) {
			System.out.println("C'est b le plus grand");
		}
		
		if(c > b && c > a) {
			System.out.println("C'est c le plus grand");
		}
		
		sc.close();
	}
}
