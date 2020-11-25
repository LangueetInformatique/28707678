package devoir03;

public abstract class Archer extends Elfe implements etreVIP{

	
	public Archer(String nom, int niveau) {
		super(nom, niveau);
		vip(nom);
	}


	@Override
	public void vip(String nom) {
		raceMéchante = false;
		this.nom = nom;
		
	}

	@Override
	public abstract String nom();
	
	public void présente() {
		super.présente();
	}
}
