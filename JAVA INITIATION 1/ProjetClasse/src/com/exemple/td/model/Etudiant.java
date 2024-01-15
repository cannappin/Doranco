package com.exemple.td.model;

/**
 * Cette classe représente les étudiants
 * @author lionel
 *
 */
public class Etudiant {
	private String nom;
	private int id;
	private int age;
	private int[] notes = new int[10];
	private int noteArrayIndex = 0;
	
	/**
	 * Construit un objet Etudiant en lui affectant les propriétés
	 * @param nom nom de l'etudiant
	 * @param id identifiant unique de l'étudiant
	 * @param age age de l'étudiant
	 */
	public Etudiant(int id, String nom, int age) {
		this.nom = nom;
		this.id = id;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", id=" + id + ", age=" + age + ",Moyenne="+getMoyenne()+ "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getNotes() {
		return notes;
	}

	public void setNotes(int[] notes) {
		this.notes = notes;
	}
	/**
	 * Permet d'ajouter une note au tableau
	 * @param note note à rajouter
	 */
	public void addNote(int note) {
		this.notes[noteArrayIndex++]=note;
	}
	
	/**
	 * Permet de calculer la moyenne des notes
	 * @return
	 * 		moyenne des notes
	 */
	public double getMoyenne() {
		int notesSum = 0;
		for(int note:this.notes) {
			notesSum+=note;
		}
		return (double) notesSum / (noteArrayIndex);
	}
}
