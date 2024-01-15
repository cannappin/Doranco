package personnel;

public class Enseignant extends Personne {

	private String specialite;
	private static int nbEnseignant;
	private int moyenneClasse;
	
	/**
	 * Constructeur dérivé de la super classe Personne
	 * @param nom
	 * @param prenom
	 * @param rue
	 * @param ville
	 * @param specialite
	 */
	public Enseignant(	String nom, 
						String prenom, 
						String rue, 
						String ville,
						String specialite) {
		super(nom, prenom, rue, ville);
		this.specialite = specialite;
		nbEnseignant++;
	}

	
	//Méthode rédifinie
	@Override
	public void ecrirePersonne() {
		enseigner();
	}
	
	//Traitement spécifique appelé par écrirePersonne
	private void enseigner() {
		System.out.println("Je suis un professeur de "+specialite+", je m'appelle "+nom+ " "+prenom);
		System.out.println("voici la moyenne de la classe:"+moyenneClasse);
	
	}
	
	public void setMoyenne(int moyenne) {
		this.moyenneClasse = moyenne;
	}
	///////////////////////////////////////////

	@Override
	public String toString() {
		return "Enseignant [specialite=" + specialite + ", nom=" + nom + ", prenom=" + prenom + ", rue=" + rue
				+ ", ville=" + ville + "]";
	}
	
	public static int getNbEnseignant() {
		return nbEnseignant;
	}
	
}
