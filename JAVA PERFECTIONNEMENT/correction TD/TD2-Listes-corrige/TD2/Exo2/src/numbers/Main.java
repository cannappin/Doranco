package numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {

	/**
	 * Genere aléatoirement un nombre entier dans une plage
	 * @param min 
	 * @param max
	 * @return
	 * 		valeur aléatoire générée
	 */
	public static Integer getRandomInteger(int min,int max) {
		int diff = max-min;
		Random random = new Random();
		return (random.nextInt(diff) + min);
	}
	
	public static void main(String[] args) {
		Set<Integer> integerSet = new HashSet<>();
		for(int i = 0;i<20;i++) {
			while(!integerSet.add(getRandomInteger(0,100)));
		}
		System.out.println(integerSet);
		System.out.println(integerSet.size());
		
		//Tri du set dans l'ordre décroissant
		//Astuce : comme on ne peut pas faire un Collections.sort() sur un set
		//On repasse par une liste
		List<Integer> intList = new ArrayList<>(integerSet);
		Collections.sort(intList,Collections.reverseOrder()); //organise dans l'ordre décroissant
		//Afficher la liste de nombre 		
		System.out.println(intList);
	}
}
