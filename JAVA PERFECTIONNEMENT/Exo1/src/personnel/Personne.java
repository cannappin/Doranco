package personnel;

public abstract class Personne {
	protected String nom;
	protected String prenom;
	protected String rue;
	protected String ville;
	protected static int nbPersonne = 0;
	
		
	//Constructeur avec les champs
	public Personne(String nom, String prenom, String rue, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
		nbPersonne++;
	}
	
	//Méthodes	
	
	//méthode abstraite qui va être redéfinie dans les classes filles
	public abstract void ecrirePersonne();
	
	//méthodes normales
	public void modifierPersonne(String ville, String rue) {
		this.ville=ville;
		this.rue = rue;
	}
	
	public static int getNbPersonne() {
		return nbPersonne;
	}
}
