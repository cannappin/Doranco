package com.exemple.td;

import java.io.FileNotFoundException;

import com.exemple.td.model.Etudiant;
import com.exemple.td.utils.FileUtils;
import com.exemple.td.utils.TableUtils;

public class Main {
	public static void main(String[] args) {
		try {
			Etudiant [] listeEtudiants = FileUtils.processListeEtudiants();
			FileUtils.processNotes(listeEtudiants);
			
			System.out.println("Student and note Process OK");
			System.out.println("La moyenne générale de la classe est de:"+TableUtils.moyenneGenerale(listeEtudiants));
			TableUtils.sortTable(listeEtudiants);
			for(Etudiant e: listeEtudiants) {
				System.out.println(e);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
