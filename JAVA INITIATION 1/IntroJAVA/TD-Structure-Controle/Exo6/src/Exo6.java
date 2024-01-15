import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0); 
		
		if (c == 'a' || c== 'e' || c=='i' || c=='o' || c=='u' || c=='y' ) {
			System.out.println(c+" est une voyelle");
		} else {
			System.out.println(c+" est une consonne");
		}
		
		System.out.println("Avec switch");
		switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
				System.out.println(c+" est une voyelle");
				break;
			default:
				System.out.println(c+" est une consonne");
			
		}
		
		sc.close();
	}

}
