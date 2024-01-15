package animals;

public class Lapin implements Animal {

	@Override
	public void crier() {
		throw new UnsupportedOperationException("T'as déjà entendu un lapin crier ??");
	}
	
	public void froncerDuNez() {
		System.out.println("je fronce du nez!");
	}

}
