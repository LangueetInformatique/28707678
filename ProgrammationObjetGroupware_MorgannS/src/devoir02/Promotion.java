package devoir02;

import java.util.*;


public abstract class Promotion {
	String nomPromo;
	int annee;
	List<Etudiant> promoEtudiant; 

	public Promotion(String nomPromo, int annee) {
		this.nomPromo = nomPromo;
		this.annee = annee;	
	}
	
		
	public abstract void travailler();
	
	public abstract void allerExams();
}
