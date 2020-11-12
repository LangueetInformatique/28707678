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
		System.out.println(" Nom : " +nom+ " Prénom : " +prenom+ " Numéro Etudiant : "+numeroEtudiant);
	}

	@Override
	public void travailler() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void allerExams() {
		// TODO Auto-generated method stub
		
	}
	
}
