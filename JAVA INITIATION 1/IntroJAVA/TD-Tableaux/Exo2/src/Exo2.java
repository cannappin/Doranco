import java.util.Random;
import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] tab = new int[10];
		
		//Boucle d'affectation
		for(int i = 0; i < tab.length; i++) {
			int randomInt = rand.nextInt(21); //Generation randomisée d'int
											  // avec des valeurs entre 0 et 20
			System.out.print(randomInt+" "); 
			tab[i] = randomInt; //Je l'affecte aux cases de mon tableau
		}
		
		System.out.println("Choisissez une valeur en 0 et 20:");
		Scanner sc = new Scanner(System.in);
		int selected = sc.nextInt();
				
		for(int element:tab) {
			if(element == selected) {
				System.out.println("J'ai trouvé ma valeur");
				break;
			}
		}
	}
}
