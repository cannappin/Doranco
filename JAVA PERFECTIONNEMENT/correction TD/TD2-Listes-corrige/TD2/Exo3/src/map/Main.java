package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	static Map<String, String> unsortedMap = new HashMap<>();
	
	public static void main(String[] args) {
		unsortedMap.put("Z", "z");
		unsortedMap.put("B", "b");
		unsortedMap.put("A", "a");
		unsortedMap.put("C", "C");
		unsortedMap.put("D", "D");
		unsortedMap.put("E", "e");
		unsortedMap.put("Y", "y");
		unsortedMap.put("N", "n");
		unsortedMap.put("J", "j");
		unsortedMap.put("M", "m");
		unsortedMap.put("F", "f");
		
		//J'affiche ma map telle quelle
		for(Map.Entry<String, String> entry:unsortedMap.entrySet()) {
			System.out.println("Clé:"+entry.getKey()+",Value:"+entry.getValue());
		}
		System.out.println("-----------------------");
		//On ne peut pas trier avec un HashMap
		// Astuce : utilise un treemap qui va trier dès son initialisation 
		TreeMap<String, String> sortedMap = new TreeMap<>(unsortedMap);
		for(Map.Entry<String, String> entry:sortedMap.entrySet()) {
			System.out.println("Clé:"+entry.getKey()+",Value:"+entry.getValue());
		}
		
		
	}

}
