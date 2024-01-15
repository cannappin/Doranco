package personnel;

public class Etudiant extends Personne {

	private String diplomeEtudie;
	private int[] notes = new int[10];
	private int cpt = 0;
	private static int nbEtudiant=0;
	
	/**
	 * Constructeur dérivé de la superclasse Personne
	 * @param nom
	 * @param prenom
	 * @param rue
	 * @param ville
	 * @param diplome
	 */
 	public Etudiant(	String nom, 
						String prenom, 
						String rue, 
						String ville,
						String diplome) {
		super(nom, prenom, rue, ville);
		this.diplomeEtudie = diplome;
		nbEtudiant++;
	}

 	//Redéfinition de ecrirePersonne
	@Override
	public String toString() {
		return "Etudiant [diplomeEtudie=" + diplomeEtudie + ", nom=" + nom + ", prenom=" + prenom + ", rue=" + rue
				+ ", ville=" + ville + "]";
	}
 	
 	@Override
	public void ecrirePersonne() {
		etudier();
	}

	//Traitement spécifique
	private void etudier() {
		System.out.println("Je suis un etudiant de "+diplomeEtudie+", je m'appelle "+nom+ " "+prenom);
		System.out.println("voici les notes de la classe:");
		for(int i=0;i<cpt;i++)
			System.out.println(notes[i]);
	}
	
	public void ajouterNote(int note) {
		if(cpt < 10) {
			notes[cpt++]=note;
		}
	}
	///////////////////////////////////
	
	public static int getNbEtudiant() {
		return nbEtudiant;
	}
	
}
