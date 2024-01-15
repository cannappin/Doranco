package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectureFichier {
	public static void main(String[] args) {
		//Ouvre le fichier liste_etudiants.txt
		FileInputStream fis;
		Scanner sc = null;
		try {
			fis = new FileInputStream(new File("liste_etudiants.txt"));
	
			//Initialise le scanner
			 sc = new Scanner(fis);
			int i=0;
			//Lit le fichier 
			while(sc.hasNextLine()) {
				//Print les lignes
				System.out.println(sc.nextLine());
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(sc!=null)
			sc.close();
		}

	}
}
