package devoir02;

public class Etudiant extends Promotion{
	String nom, prenom;
	int numeroEtudiant;

	/**
	 *  constructeur vide
	 */

	public Etudiant (String nom, String prenom, int numero) {
		super("Langue Info", 2020);
		this.nom = nom;
		this.prenom = prenom;
		this.numeroEtudiant = numero;
		
	}
	
	public void carteEtu() {
		System.out.println(" Nom : " +nom+ " Pr�nom : " +prenom+ " Num�ro Etudiant : "+numeroEtudiant);
	}

	@Override
	public void travailler() {
		System.out.println("J'apprends le java");
		
	}

	@Override
	public void allerExams() {
	}
	
}
