package devoir03;

public class Chasseur extends Archer implements Ressources {

	public Chasseur(String nom, int niveau) {
		super(nom, niveau);
		mesRessources(nom);
		//this.nom = nom;
	}

	public void mesRessources(String nom) {
		int gibier = 8;
		System.out.println("Je suis " + nom + "et j'ai chassé " + gibier + " animaux");
		
	}
	
	public void presente() {
		super.présente();
		}

	@Override
	public String nom() {
		return this.nom;
	}
	
}
