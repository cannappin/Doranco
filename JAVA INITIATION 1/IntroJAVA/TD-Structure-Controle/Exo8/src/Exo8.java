import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int numeroMois = sc.nextInt();
		
		switch(numeroMois) {
			case 1: System.out.println("Janvier 31 jours"); break;
			case 2: System.out.println("Février 28 ou 29 jours"); break;
			case 3: System.out.println("Mars 31 jours"); break;
			case 4: System.out.println("Avril 30 jours"); break;
			case 5: System.out.println("Mai 31 jours"); break;
			case 6: System.out.println("Juin 30 jours"); break;
			case 7: System.out.println("Juillet 31 jours"); break;
			case 8: System.out.println("Aout 31 jours"); break;
			case 9: System.out.println("Septembre 30 jours"); break;
			case 10: System.out.println("Octobre 31 jours"); break;
			case 11: System.out.println("Novembre 30 jours"); break;
			case 12: System.out.println("Décembre 31 jours"); break;				
		
			default:
				sc.close();
				throw new UnsupportedOperationException("Il n'y a que 12 mois dans l'année");
		}
		sc.close();
	}

}
