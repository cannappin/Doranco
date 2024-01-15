package vehicules;

public class Voiture extends Vehicule{
	private int cylindree;
	private int nbPortes;
	private int puissance;
	private int kilometrage;
	
	public Voiture(String marque, 
					String dateAchat, 
					double prixAchat, 
					int cylindree,
					int nbPortes,
					int puissance,
					int kilometrage) {
		super(marque, dateAchat, prixAchat);
		this.cylindree = cylindree;
		this.nbPortes = nbPortes;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
	}

	@Override
	public void calculePrix(int anneeActuelle) {
		//Enlève 2% du prixAchat pour chaque année
		int difference = anneeActuelle - dateAchat.getYear();
		if(difference > 0) {
			this.prixCourant = (double) this.prixAchat - this.prixAchat * 2 * difference / 100;
		}
		//Enlève 5% par tranche de 10000km
		int tranche = (kilometrage / 10000);
		if(tranche > 0) {
			this.prixCourant -= (double) this.prixAchat * 5 * tranche / 100;
		}
		//Enlève 10% pour Renault et Fiat et ajoute 20% pour Ferrari ou Porsche
		switch(marque.toLowerCase()) {
			case "renault":
			case "fiat":
				this.prixCourant -= this.prixAchat * 10 / 100;
				break;
			case "ferrari":
			case "porsche":
				this.prixCourant += this.prixAchat * 20 / 100;
		}
		
		//Si prixnégatif, on le ramène à null
		if(this.prixCourant < 0) {
			this.prixCourant = 0;
		}
		
	}

	@Override
	public String toString() {
		return String.format(
				"Voiture [cylindree=%s, nbPortes=%s, puissance=%s, kilometrage=%s, marque=%s, dateAchat=%s, prixAchat=%s, prixCourant=%s]",
				cylindree, nbPortes, puissance, kilometrage, marque, dateAchat, prixAchat, prixCourant);
	}

}
