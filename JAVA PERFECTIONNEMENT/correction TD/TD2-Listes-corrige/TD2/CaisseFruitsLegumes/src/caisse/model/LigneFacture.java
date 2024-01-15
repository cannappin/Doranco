package caisse.model;

public class LigneFacture {
	private String article;
	private int quantite =0;
	private double prixUnitaire;
	
	public LigneFacture(String article, int quantite, double prixUnitaire) {
		this.article = article;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}

	public double getTotalLigne() {
		return prixUnitaire*quantite;
	}

	@Override
	public String toString() {
		return article + "    "  + quantite + "    " + prixUnitaire
				+ "    " + getTotalLigne() + "€";
	}
	
	
	 
}
