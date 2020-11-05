package atelier06;

/** Création et gestion de oiseau  **/
public class Oiseau extends Animal{
	// ajout d'attributs propres à la sous classe 
	protected boolean domestique = false;
	
	/** Le constructeur de Félins fait appel au constructeur de la sur-classe Animal **/
	
	public Oiseau(String type) { // les félins ont quatre pattes
		super(type, 2);
		type = "Oiseau";
	}

	public void présente() {
		// Appel de la méthode de la surclasse
		// ...............
		String etat = (domestique) ? "domestique" : "sauvage ou domestique";
		System.out.println("Je suis vraiment un animal " + etat);
	}
	
	/** cri du félin */
	public void crie() {
		String cri = "pioupiou";
		System.out.println("Mon cri est le " + cri);
	}
}