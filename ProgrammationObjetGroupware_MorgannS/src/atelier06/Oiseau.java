package atelier06;

/** Cr�ation et gestion de oiseau  **/
public class Oiseau extends Animal{
	// ajout d'attributs propres � la sous classe 
	protected boolean domestique = false;
	
	/** Le constructeur de F�lins fait appel au constructeur de la sur-classe Animal **/
	
	public Oiseau(String type) { // les f�lins ont quatre pattes
		super(type, 2);
		type = "Oiseau";
	}

	public void pr�sente() {
		// Appel de la m�thode de la surclasse
		// ...............
		String etat = (domestique) ? "domestique" : "sauvage ou domestique";
		System.out.println("Je suis vraiment un animal " + etat);
	}
	
	/** cri du f�lin */
	public void crie() {
		String cri = "pioupiou";
		System.out.println("Mon cri est le " + cri);
	}
}