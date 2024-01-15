package com.exemple.td.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.exemple.td.model.Etudiant;

/**
 * Cette classe gère les 2 fichiers notes.txt et liste_etudiants.txt
 * @author lionel
 *
 */
public final class FileUtils {
	/**
	 * Lit le fichier liste_etudiants.txt ligne à ligne et receuille les informations 
	 * @return
	 * 		la liste d'objets etudiants crées 
	 * @throws FileNotFoundException si le fichier liste_etudiants.txt n'est pas présent
	 */
	public static Etudiant[] processListeEtudiants() throws FileNotFoundException {
		//Ouvre le fichier liste_etudiants.txt
		FileInputStream fis = new FileInputStream(new File("liste_etudiants.txt"));
		//Déclare le tableau d'étudiants (ici on en a 15)
		Etudiant[] etudiants = new Etudiant[15];
		//Initialise le scanner
		Scanner sc = new Scanner(fis);
		int i=0;
		//Lit le fichier et créé la liste d'objets étudiant
		while(sc.hasNextLine()) {
			//Explose la ligne pour récupérer les valeurs
			String[] lineValues = sc.nextLine().split(",");
			//Récupère l'id de l'étudiant
			int id = Integer.parseInt(lineValues[0]);
			//Récupère le nom de l'étudiant
			String name = lineValues[1];
			//Récupère l'age de l'étudiant
			int age = Integer.parseInt(lineValues[2]);
			//Créé l'objet étudiant avec les valeurs récupérées
			Etudiant e = new Etudiant(id,name,age);
			//Stockage de l'étudiant dans la liste
			etudiants[i] = e;
			i++;
		}
		sc.close();
		return etudiants;
	}
	/**
	 * Affecter la liste de notes à chaque etudiant à l'aide du fichier texte
	 * @param listeEtudiants la liste d'étudiant qui ont des notes à affecter
	 * @throws FileNotFoundException levée si notes.txt non trouvé
	 */
	public static void processNotes(Etudiant[] listeEtudiants) throws FileNotFoundException {
		//Ouvre le fichier
		FileInputStream fis = new FileInputStream(new File("notes.txt"));
		Scanner sc = new Scanner(fis);
		//Lecture du fichier ligne à ligne		
		while(sc.hasNextLine()) {
			//Explose la ligne en tableau pour récupérer les informations sur la note
			String[] lineValues = sc.nextLine().split(",");
			//Récupère l'id de la note (complètement inutile)
			int id = Integer.parseInt(lineValues[0]);
			//Récupère la valeur de la note
			int note = Integer.parseInt(lineValues[1]);
			//Récupère l'id de l'étudiant associé à la note
			int etudiantId = Integer.parseInt(lineValues[2]);
			//Recherche l'étudiant pour lui affecter la note
			for(Etudiant e: listeEtudiants) {
				if(e.getId() == etudiantId) {
					e.addNote(note);
					break;
				}
			}
		}
		sc.close();
	}
	
	
}
