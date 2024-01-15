package languages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Languages {

	public static void main(String[] args) {
		//Déclaration / initialisation
		List<String> languages = new ArrayList<String>();
		languages.add("PHP");
		languages.add("C++");
		languages.add("JAVA");
		languages.add("Python");
		//Affichage avec le .toString()
		System.out.println("Valeurs de ma liste: "+languages);
		
		//
		System.out.println("Mon 3eme element "+languages.get(2));
		
		if(languages.contains("C++")) System.out.println("Ok j'ai trouvé C++");
		if(languages.contains("Java")) System.out.println("Ok j'ai trouvé Java");

		//Tri de la liste par ordre alphabétique
		Collections.sort(languages);
		System.out.println("Valeurs de ma liste: "+languages);
		System.out.println("Mon 3eme element "+languages.get(2));
		
		
		//Mélange la liste
		Collections.shuffle(languages);
		System.out.println("Valeurs de ma liste: "+languages);
		System.out.println("Mon 3eme element "+languages.get(2));
	}

}
