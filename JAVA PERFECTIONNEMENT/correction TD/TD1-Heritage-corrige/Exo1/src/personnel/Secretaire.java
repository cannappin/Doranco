package personnel;

public class Secretaire extends Personne {
	private String numBureau;
	private static int nbSecretaire;

	public Secretaire(	String nom, 
						String prenom, 
						String rue, 
						String ville,
						String numBureau) {
		super(nom, prenom, rue, ville);
		this.numBureau = numBureau;
		nbSecretaire++;
	}

	public String getNumBureau() {
		return numBureau;
	}
	
	public static int getNbSecretaire() {
		return nbSecretaire;
	}
}
