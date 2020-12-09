package devoir03;
/** Cr�ation de joueurs d'un jeu vid�o **/
/*
 * @author Morgann
 */

public abstract class Joueur {

	public String nom;
	public int niveau;
	
	/** Cr�ation d'une nouvelle instance de la classe Joueur
	 * elle pr�sentera le joueur avec son nom et son niveau
	 *  
	 * @param niveauJoueur 	niveau du joueur
	 * @param nomduJoueur, 	nom du joueur 		
	 */
	public Joueur (String nomduJoueur, int niveauJoueur) {
		nomduJoueur = nom;
		niveauJoueur = niveau;
	}

	/** on pr�sente le joueur **/
	public void pr�sente() {
		System.out.println("Mon nom est : " + nom + "\nJe suis niveau " + niveau);
	}
		
	/** Lancer un sort */
	public abstract void sort();
	
	/** Langue parl�e */
	public abstract void langue();


}
	
