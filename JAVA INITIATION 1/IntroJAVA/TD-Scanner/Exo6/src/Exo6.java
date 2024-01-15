import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Demande d'entrée d'une ligne entiere
		System.out.println("Veuillez rentrer votre premier terme :");
		int a = sc.nextInt();
		System.out.println("Veuillez rentrer votre 2eme terme :");
		int b = sc.nextInt();
		double division = (double) a/b;
		System.out.println("La division est égal à :"+division);
		//Parce que Scanner est ouvert sur un flux
		//Il faut le fermer
		sc.close();	
	}

}
