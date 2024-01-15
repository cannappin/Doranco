import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exo4 {
	public static void main(String args[]) {
//		//Initialisation du Scanner sur le flux System.in
//		Scanner sc = new Scanner(System.in);
//		
//		//Demande d'entrée d'une ligne entiere
//		System.out.println("Veuillez rentrer votre premier terme :");
//		int a = sc.nextInt();
//		System.out.println("Veuillez rentrer votre 2eme terme :");
//		int b = sc.nextInt();
//		int somme = a+b;
//		int produit = a*b;
//		System.out.println("La somme de a et b :"+somme);
//		System.out.println("Le produit de a et b :"+produit);
//		//Parce que Scanner est ouvert sur un flux
//		//Il faut le fermer
//		sc.close();	
		BufferedReader IN;
		try {
			IN=new BufferedReader(new InputStreamReader(System.in));
			String firstTermString = IN.readLine();
			int a = Integer.parseInt(firstTermString);
			String secondTermString = IN.readLine();
			int b = Integer.parseInt(secondTermString);			
			
			int somme = a+b;
			int produit = a*b;
			System.out.println("La somme de a et b :"+somme);
			System.out.println("Le produit de a et b :"+produit);
		}catch(Exception ex) {
			System.err.println("Error occured");
		}
	}
}
