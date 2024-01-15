package banque;

import banque.model.Compte;
import banque.utils.VirementUtils;

public class Main {
	public static void main(String[] args) {
		Compte c1 = new Compte("Maurice Dupond", "10029344", 10108);
		Compte c2 = new Compte("Fabrice Millot", "30499450", 1304);
		Compte c3 = new Compte("Nora Excillia", "4059963", 300400);
	
		VirementUtils.executerOperation(c1, c2, 1233);
		VirementUtils.executerOperation(c2, c3, 433);
		VirementUtils.executerOperation(c2, c1, 33);
		VirementUtils.executerOperation(c3, c1, 778);
		VirementUtils.executerOperation(c2, c3, 374);
		VirementUtils.executerOperation(c3, c1, 1778);
		VirementUtils.executerOperation(c2, c1, 58);
		VirementUtils.executerOperation(c2, c3, 158);
		VirementUtils.executerOperation(c3, c2, 2524);
		VirementUtils.executerOperation(c3, c1, 889);
	}
}
