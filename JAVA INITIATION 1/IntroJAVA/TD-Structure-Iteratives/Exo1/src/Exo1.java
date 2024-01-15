import java.util.Scanner;

/**
 * Factorielle n!
 * Le produit d'un entier avec tous les entiers de 1 à lui
 *  */
public class Exo1 {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		//Proposition 1
		//Je pars de 1 et je vais jusqu'a ma valeur tappée
		int factorielle=1;
		//Ici on doit aller jusqu'a n
		for(int i=1; i <= n; i++) {
			factorielle *= i; //factorielle = factorielle * i;
		}
		System.out.println("Factorielle  :"+factorielle);
		
		//Proposition 2
		//Je pars de la valeur tappée et je retourne jusqu'a 1
		int factorielle1=n;
		
		for(int i=(n-1); i >= 1; i--) {
			factorielle1 *= i; //factorielle = factorielle * i;
		}
		System.out.println("Factorielle 1 :"+factorielle1);
		
       //5,7
	}

}
