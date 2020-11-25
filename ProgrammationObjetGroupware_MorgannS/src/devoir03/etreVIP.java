package devoir03;

/** Permet de donner le statut de VIP d'un joueur **/
public interface etreVIP {
	/**
	 * Donner le statut VIP à un joueur
	 * 
	 * @param nom		nom du joueur permettant de l'identifier
	 */
	
	public abstract void vip(String nom);
	/**
	 * renvoir le nom du joueur afin de l'identifier
	 * 
	 * @return nom du joueur
	 */
	public abstract String nom();

}
