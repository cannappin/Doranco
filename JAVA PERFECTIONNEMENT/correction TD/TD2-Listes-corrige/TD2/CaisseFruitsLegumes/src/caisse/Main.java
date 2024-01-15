package caisse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import caisse.model.LigneFacture;

public class Main {
	//Constantes
	private static final String POMME="pomme";
	private static final String POIRE="poire";
	private static final String FRAISE="fraise";
	private static final String BANANE="banane";
	private static final String MANGUE="mangue";
	private static final String ANANAS="ananas";
	private static final String CHOUX="choux";
	private static final String ORANGE="orange";
	private static final String ARTICLE_LIST_COMMAND="\\l";
	private static final String TOTAL_COMMAND="\\t";
	private static final String QUIT_COMMAND="\\q";
	
	
	private static double calculerSomme(List<LigneFacture> listeFacture) {
		double resultat = 0;
		Iterator<LigneFacture> it = listeFacture.iterator();
		while(it.hasNext()) {
			resultat += it.next().getTotalLigne();
		}
		return resultat;
	}
	
	
	
	public static void main(String[] args) {
		boolean exit = false;
		List<LigneFacture> articleList = new ArrayList<LigneFacture>();
		
 		//Etape1
		Map<String,Double> carte = new HashMap<String, Double>();
		carte.put(POMME,.43);
		carte.put(POIRE,.19);
		carte.put(FRAISE,.23);
		carte.put(BANANE,.99);
		carte.put(MANGUE, 2d);
		carte.put(ANANAS, 1.39);
		carte.put(CHOUX, 1.20);
		carte.put(ORANGE, 1.20);
		
		//Programme de gestion de l'interface utilisateur
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			//Premiere lecture
			String typed = sc.nextLine();

			switch(typed.toLowerCase()) {
				//Tous les Cas des articles:
				//Demander la quantité
				//Aller cherche le prix dans la map
				case POMME: 
				case POIRE:
				case FRAISE:
				case BANANE:
				case MANGUE:
				case ANANAS:
				case CHOUX:
				case ORANGE:
					System.out.println("Veuillez entrer la quantité :");
					int quantite = sc.nextInt();
					articleList.add(new LigneFacture(typed,quantite,carte.get(typed.toLowerCase())));
					break;
				case ARTICLE_LIST_COMMAND:
					System.out.println(carte);
					for(Map.Entry<String, Double> entry:carte.entrySet()) {
						System.out.println(entry.getKey()+".............."+entry.getValue()+"€ la pièce");
					}
					break;
				case TOTAL_COMMAND:
					for(LigneFacture ligneArticle:articleList) {
						System.out.println(ligneArticle);
					}
					System.out.println("Total: "+calculerSomme(articleList));
					articleList.clear();
					break;
				case QUIT_COMMAND:
					sc.close();
					System.exit(0);
				default:
					System.out.println(typed+" non reconnu comme une commande valide ou un article");
				
			}
		}
	}

}
