package devoir03;
/** Création de joueurs d'un jeu vidéo **/
/*
 * @author Morgann
 */

public abstract class Joueur {

	public String nom;
	public int niveau;
	
	/** Création d'une nouvelle instance de la classe Joueur
	 * elle présentera le joueur avec son nom et son niveau
	 *  
	 * @param niveauJoueur 	niveau du joueur
	 * @param nomduJoueur, 	nom du joueur 		
	 */
	public Joueur (String nomduJoueur, int niveauJoueur) {
		nomduJoueur = nom;
		niveauJoueur = niveau;
	}

	/** on présente le joueur **/
	public void présente() {
		System.out.println("Mon nom est : " + nom + "\nJe suis niveau " + niveau);
	}
		
	/** Lancer un sort */
	public abstract void sort();
	
	/** Langue parlée */
	public abstract void langue();


}
	
