package devoir03;

public class Elfe extends Joueur{
	

	protected boolean raceM�chante = true; 

	public Elfe(String nom, int niveau) {
		super(nom, niveau);
		}
	//public Elfe(String nom) {

	//}
	
	public void sort() {
		String sortil�ge = "Abracadabra";
		System.out.println("Je peux lancer le sort" + sortil�ge);
	}
	
	public void pr�sente() {
		super.pr�sente();
		String typeJoueur = (raceM�chante) ? "raceM�chante" : "Cruel";
		System.out.println("Je suis " + typeJoueur);
	}

	@Override
	public void langue() {
		String malangue = "Elfique";
		System.out.println("Je parle cette langue : " + malangue);
		
	}
	

}
