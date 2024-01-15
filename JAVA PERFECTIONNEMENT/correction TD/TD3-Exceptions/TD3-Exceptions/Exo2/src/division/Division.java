package division;

import java.util.Random;

public class Division {

	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i = 0; i < 20;i++) {
			int dividende = r.nextInt(20);
			int diviseur = r.nextInt(10);
			
			System.out.println("Le dividende est :"+dividende);
			System.out.println("Le diviseur est "+diviseur);
			//Le fait d'attraper l'erreur
			//Le programme peut continuer si elle apparait
			//A la base on  aucune obligation de le faire contrairement à une checked Exception
			try {
				System.out.println("Le résultat est" + (dividende/diviseur));
			} catch(ArithmeticException ex) {
				System.err.println("On ne divise pas par 0 !!!");
				ex.printStackTrace();
			}
		} 
		
	}

}
