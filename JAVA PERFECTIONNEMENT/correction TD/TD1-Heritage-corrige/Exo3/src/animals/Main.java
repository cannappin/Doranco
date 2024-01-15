package animals;

public class Main {

	public static void main(String[] args) {
			Animal[] tab = new Animal[4];
			tab[0] = new Chat();
			tab[1] = new Chien();
			tab[2] = new Chat();
			tab[3] = new Lapin();
			
			for (int i=0; i<4; i++){
				//Je check si l'objet est de classe Lapin
				if(tab[i] instanceof  Lapin) {
					((Lapin) tab[i]).froncerDuNez();
					continue;
				}
				tab[i].crier();
			}
	}
}
