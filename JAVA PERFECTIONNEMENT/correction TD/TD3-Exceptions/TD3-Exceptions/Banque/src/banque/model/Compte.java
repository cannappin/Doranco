package banque.model;

/**
 * Cette classe décrit un compte en banque avec le nom du propriétaire du compte
 * le numéro du compte et le solde
 * @author lionel
 *
 */
public class Compte {
	private String name;
	private String numero;
	private double solde;
	
	public Compte(String name, String numero, double solde) {
		this.name = name;
		this.numero = numero;
		this.solde = solde;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [name=" + name + ", numero=" + numero + ", solde=" + solde + "]";
	}
	
	
}
