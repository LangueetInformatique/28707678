package devoir03;

public abstract class Archer extends Elfe implements etreVIP{

	
	public Archer(String nom, int niveau) {
		super(nom, niveau);
		vip(nom);
	}


	@Override
	public void vip(String nom) {
		raceM�chante = false;
		this.nom = nom;
		
	}

	@Override
	public abstract String nom();
	
	public void pr�sente() {
		super.pr�sente();
	}
}
