package com.exemple.td.utils;

import com.exemple.td.model.Etudiant;

/**
 * Cette classe est un utilitaire pour les opérations sur la liste d'étudiants
 * @author lionel
 */
public final class TableUtils {
	/**
	 * Retourne la liste d'étudiant triés selon la moyenne de la plus forte à la plus basse
	 * @param table liste des étudiants
	 */
	public static void sortTable(Etudiant[] table) {
		for(int i = 0; i < table.length; i++) {
			int PMAX = i;
			
			for(int j = i;j < table.length;j++) {
				if(table[j].getMoyenne() > table[PMAX].getMoyenne()) {
					PMAX=j;
				}		
			}
			
			Etudiant temp = table[i];
			table[i]=table[PMAX];
			table[PMAX]=temp;
		} 
	}
	
	/**
	 * Retourne la moyenne générale de tous les étudiants
	 * @param table liste des étudiants sous forme de tableau
	 * @return 
	 * 		Moyenne générale des étudiants
	 */
	public static double moyenneGenerale(Etudiant[] table) {
		double moyenneSomme = 0;
		for(Etudiant e:table) {
			moyenneSomme+=e.getMoyenne();
		}
		return moyenneSomme/table.length;
	}
}
