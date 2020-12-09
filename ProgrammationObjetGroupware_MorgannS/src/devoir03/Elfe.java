package devoir03;

public class Elfe extends Joueur{
	

	protected boolean raceMéchante = true; 

	public Elfe(String nom, int niveau) {
		super(nom, niveau);
		}
	//public Elfe(String nom) {

	//}
	
	public void sort() {
		String sortilège = "Abracadabra";
		System.out.println("Je peux lancer le sort" + sortilège);
	}
	
	public void présente() {
		super.présente();
		String typeJoueur = (raceMéchante) ? "raceMéchante" : "Cruel";
		System.out.println("Je suis " + typeJoueur);
	}

	@Override
	public void langue() {
		String malangue = "Elfique";
		System.out.println("Je parle cette langue : " + malangue);
		
	}
	

}
