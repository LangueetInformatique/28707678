package atelier06;

/** Cr�ation et gestion de f�lins **/
public class F�lin extends Animal{
	// ajout d'attributs propres � la sous classe 
	protected boolean domestique = false;
	
	/** Le constructeur de F�lins fait appel au constructeur de la sur-classe Animal **/
	
	public F�lin(String type) { // les f�lins ont quatre pattes
		super(type, 4);
		type = "F�lins";
		//int pattes = 4;
	}

	public void pr�sente() {
		// Appel de la m�thode de la surclasse
		super.pr�sente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("Je suis vraiment un animal " + etat);
	}
	
	/** cri du f�lin */
	public void crie() {
		String cri = "miaulement";
		System.out.println("Mon cri est le " + cri);
	}
}
