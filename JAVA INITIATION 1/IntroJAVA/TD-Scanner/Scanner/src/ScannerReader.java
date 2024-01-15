import java.util.Scanner;

public class ScannerReader {

	public static void main(String args[]) {
		//Initialisation du Scanner sur le flux System.in
		Scanner sc = new Scanner(System.in);
		
		//Demande d'entrée d'une ligne entiere
		String entree = sc.nextLine();
		
		//Affichage de la chaine tappée
		System.out.println("Ma chaine tapée :" + entree);
		
		//Parce que Scanner est ouvert sur un flux
		//Il faut le fermer
		sc.close();
		
		
	}

}
