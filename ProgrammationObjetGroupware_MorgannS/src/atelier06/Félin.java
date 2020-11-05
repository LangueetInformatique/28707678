package atelier06;

/** Création et gestion de félins **/
public class Félin extends Animal{
	// ajout d'attributs propres à la sous classe 
	protected boolean domestique = false;
	
	/** Le constructeur de Félins fait appel au constructeur de la sur-classe Animal **/
	
	public Félin(String type) { // les félins ont quatre pattes
		super(type, 4);
		type = "Félins";
		//int pattes = 4;
	}

	public void présente() {
		// Appel de la méthode de la surclasse
		super.présente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("Je suis vraiment un animal " + etat);
	}
	
	/** cri du félin */
	public void crie() {
		String cri = "miaulement";
		System.out.println("Mon cri est le " + cri);
	}
}
