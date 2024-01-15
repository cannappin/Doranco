package personnel;

public class Main {

	public static void main(String[] args) {
		Secretaire secretaire = new Secretaire("NomS","prenomS","Ville","rue","120");
		Enseignant enseignant = new Enseignant("NomE1","PrenomE1","Ville","rue","Maths");
		Enseignant enseignant2 = new Enseignant("NomE1","PrenomE1","Ville","rue","Français");
		Etudiant etudiant1=new Etudiant("NomEt1","PrenomEt1","Ville","rue","lettres");
		Etudiant etudiant2=new Etudiant("NomEt2","PrenomEt2","Ville","rue","lettres");
		Etudiant etudiant3=new Etudiant("NomEt3","PrenomEt3","Ville","rue","lettres");
		Etudiant etudiant4=new Etudiant("NomEt4","PrenomEt4","Ville","rue","lettres");
		Etudiant etudiant5=new Etudiant("NomEt5","PrenomEt5","Ville","rue","lettres");
		Etudiant etudiant6=new Etudiant("NomEt6","PrenomEt6","Ville","rue","lettres");
		Etudiant etudiant7=new Etudiant("NomEt7","PrenomEt7","Ville","rue","lettres");
		Etudiant etudiant8=new Etudiant("NomEt8","PrenomEt8","Ville","rue","lettres");
		Etudiant etudiant9=new Etudiant("NomEt9","PrenomEt9","Ville","rue","lettres");
		Etudiant etudiant10=new Etudiant("NomEt10","PrenomEt10","Ville","rue","lettres");
		
		//Les etudiants ont la possibilité d'avoir des notes
		etudiant10.ajouterNote(12);
		etudiant10.ajouterNote(13);
		etudiant10.ajouterNote(15);
		
		//Les enseignants doivent déclarer une moyenne de la classe
		enseignant.setMoyenne(14);
		enseignant2.setMoyenne(17);
		
		//Création de mon tableau
		Personne[] personnes = {secretaire, enseignant, enseignant2,etudiant1,
				etudiant2,etudiant3,etudiant4,etudiant5,
				etudiant6,etudiant7,etudiant8,etudiant9,etudiant10};
		
		//Je parcours mon tableau
		for(Personne p:personnes) {
			p.ecrirePersonne();
			System.out.println(p.toString());
			System.out.println("------------------");
		}
		
		//J'affiche les nombres incrémentés par les constructeurs
		System.out.println("J'ai "+Secretaire.getNbSecretaire()+" secretaire");
		System.out.println("J'ai "+Etudiant.getNbEtudiant()+" etudiants");
		System.out.println("J'ai "+Enseignant.getNbEnseignant()+" enseignants");
		System.out.println("J'ai "+Personne.getNbPersonne()+" personnes");
	}

}
