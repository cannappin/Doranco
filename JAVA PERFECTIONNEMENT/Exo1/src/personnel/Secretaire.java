/**
 * 
 */
package personnel;

/**
 * Classe secrétaire qui va gérer un type de personne
 */
public final class Secretaire extends Personne {

	private String numBureau;
	private static int nbSecretaire; 
	/**
	 * Constructeur dérivé du constructeur de superclasse avec paramètres
	 * @param nom
	 * @param prenom
	 * @param rue
	 * @param ville
	 */
	public Secretaire(  String nom, 
						String prenom, 
						String rue, 
						String ville,
						String numBureau) {
		super(nom, prenom, rue, ville);
		this.numBureau = numBureau;
		nbSecretaire++;
	}

	//Méthodes redéfinies
	@Override
	public void ecrirePersonne() {
		System.out.println("Je suis une secrétaire, je m'appelle: "+nom+" "+prenom+" et bosse au bureau n°"+numBureau);
	}

	@Override
	public void modifierPersonne(String ville, String rue) {
		System.out.println("Je modifie la secrétaire "+nom+" "+prenom);
		super.modifierPersonne(ville, rue);
	}

	@Override
	public String toString() {
		return "Secretaire [numBureau=" + numBureau + ", nom=" + nom + ", prenom=" + prenom + ", rue=" + rue
				+ ", ville=" + ville + "]";
	}
	
	public static int getNbSecretaire() {
		return nbSecretaire;
	}
}
