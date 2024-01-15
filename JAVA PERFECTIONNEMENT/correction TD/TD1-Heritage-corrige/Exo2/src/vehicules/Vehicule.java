package vehicules;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public  class Vehicule {
	protected String marque;
	protected LocalDate dateAchat;
	protected double prixAchat;
	protected double prixCourant;	
	
	public Vehicule(String marque, String dateAchat, double prixAchat) {
		this.marque = marque;
		this.dateAchat = LocalDate.parse(dateAchat,DateTimeFormatter.ofPattern("d/MM/yyyy"));
		this.prixAchat = prixAchat;
		this.prixCourant = prixAchat;
	}
	 
	public void calculePrix(int anneeActuelle) {
		//Enlève 1% du prixAchat pour chaque année
		int difference = anneeActuelle - dateAchat.getYear();
		if(difference > 0) {
			this.prixCourant = this.prixAchat - this.prixAchat * difference / 100;
		} 
	}
	
	public double getPrixCourant() {
		return prixCourant;
	}
}
