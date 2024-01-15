package vehicules;

public class Avion extends Vehicule{
	private AvionType type;
	private int nombreHeureVol = 0;

	public Avion(String marque, 
				 String dateAchat, 
				 double prixAchat, 
				 AvionType type, 
				 int nombreHeureDeVol) {
		super(marque, dateAchat, prixAchat);
		this.nombreHeureVol = nombreHeureDeVol;
		this.type = type;
	}

	@Override
	public void calculePrix(int anneeActuelle) {
		super.calculePrix(anneeActuelle);
		int ratio = this.nombreHeureVol / type.getTranche();
		
		this.prixCourant -= (double) this.prixAchat - this.prixAchat * (10 * ratio) /100;
			
		if(this.prixCourant < 0) {
			this.prixCourant = 0;
		}
	}

	public enum AvionType{
		REACTION(1000),HELICE(100);
		private int tranche;
		
		AvionType(int tranche) {
			this.tranche = tranche;
		}
		
		public int getTranche() {
			return tranche;
		}
	}

	@Override
	public String toString() {
		return String.format(
				"Avion [type=%s, nombreHeureVol=%s, marque=%s, dateAchat=%s, prixAchat=%s, prixCourant=%s]", type,
				nombreHeureVol, marque, dateAchat, prixAchat, prixCourant);
	}
	
	
}
