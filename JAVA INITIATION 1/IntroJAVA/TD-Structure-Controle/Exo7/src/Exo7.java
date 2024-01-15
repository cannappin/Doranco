import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0); 
		int i = (int)c;
		
		if(48 <= i && i <= 57) {
			System.out.println(c+" est un chiffre");
		} else if (65 <= i && i <= 90) {
			System.out.println(c+" est une majuscule");
		} else if(97 <= i && i <= 122) {
			System.out.println(c+" est une minuscule");
		} else {
			System.out.println(c+" est un caractère autre");
		}

	}

}
