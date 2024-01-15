import java.util.Random;

public class Exo1 {

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
		System.out.print("\n"); 
		//Boucle de lecture
		for(int element:tab) {
			//lit élément par élément
			System.out.println("L'element courant est :" + element);
		}
	}

}
