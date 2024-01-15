import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		//Initialisation du Scanner sur le flux System.in
		Scanner sc = new Scanner(System.in);
				
		//Demande d'entrée de 4 entier
		System.out.println("Veuillez rentrer votre premiere note :");
		int a = sc.nextInt();
		System.out.println("Veuillez rentrer votre 2eme note :");
		int b = sc.nextInt();
		System.out.println("Veuillez rentrer votre 3eme note :");
		int c = sc.nextInt();
		System.out.println("Veuillez rentrer votre 4eme note :");
		int d = sc.nextInt();
		float resultat = (float) (a+b+c+d)/4; //Va forcer le résultat de la division d'entiers à devenir à virgule flottante
		//S'appelle un CAST
		System.out.println("La moyenne est de :"+resultat);
	}

}
