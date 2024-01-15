import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float prixFabrication = sc.nextInt();
		float prixDeVente = sc.nextInt();
		
		if(prixFabrication > prixDeVente) {
			System.out.println("Tu vends à perte mon gars!");
		}
		
		if(prixFabrication == prixDeVente) {
			System.out.println("Tu n'as pas de bénéfice");
		}
		
		if(prixFabrication < prixDeVente) {
			System.out.println("Tu as du bénéfice");
		}
		
		sc.close();
	}

}
