package personnel;

public abstract class Personne {
	protected String nom;
	protected String prenom;
	protected String rue;
	protected String ville;
	protected static int nbPersonnes;
	
	public Personne() {
		System.out.println("Par defaut");
	}
	
	public Personne(String nom, String prenom, String rue, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", rue=" + rue + ", ville=" + ville + "]";
	}
	
	
}
