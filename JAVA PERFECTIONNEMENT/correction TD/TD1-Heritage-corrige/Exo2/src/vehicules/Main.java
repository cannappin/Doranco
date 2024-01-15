package vehicules;

import vehicules.Avion.AvionType;

public class Main {
	public static void main(String[] args) {
		Vehicule v = new Avion("Boeing","12/12/2007",120000,AvionType.REACTION,1300);
		v.calculePrix(2010);
		System.out.println(v);
		System.out.println("-------------------------------");
		v= new Voiture("Renault","13/12/2015",12345,4,23,13,45);
		v.calculePrix(2017);
		System.out.println(v);
		System.out.println("-------------------------------");
	}
}
