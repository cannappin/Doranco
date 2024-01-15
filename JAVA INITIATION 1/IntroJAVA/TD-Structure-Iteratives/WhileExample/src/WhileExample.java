import java.util.Scanner;

/**
 * Cette classe récupère un String et pour chaque caractère
 * nous dit si c'est une majuscule, une minuscule ou un chiffre
 */
public class WhileExample {

	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		int i = 0;
		
		while(i < s.length()) {
			char c = s.charAt(i);
			int intValueOfC = (int)c;
			if(48 <= intValueOfC && intValueOfC <= 57) {
				System.out.println(c+" est un chiffre");
			} else if (65 <= intValueOfC && intValueOfC <= 90) {
				System.out.println(c+" est une majuscule");
			} else if(97 <= intValueOfC && intValueOfC <= 122) {
				System.out.println(c+" est une minuscule");
			} else {
				System.out.println(c+" est un caractère autre");
			}
			i++;
		}
	}

}
