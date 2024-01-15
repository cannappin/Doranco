
public class Exo3 {

	public static void main(String[] args) {
		String[][] armoire = new String[3][2];
		// Boucle d'affectaction
		for(int i=0;i<armoire.length;i++) {
			for(int j=0;j<armoire[i].length;j++) {
				armoire[i][j]="sc"+(i+1)+"."+(j+1);
			}
		}		
		
		//Boucle de lecture
		for(int i=0;i<armoire.length;i++) {
			System.out.println("c"+(i+1));
			for(String souscasier:armoire[i]) {
				System.out.println("    "+souscasier);
			}
		}
	}

}
