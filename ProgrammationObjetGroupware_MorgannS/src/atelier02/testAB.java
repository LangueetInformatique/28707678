package tp01;
/** classe exécutable de la 2ème partie de l'atelier 2
 * 
 * @author Morgann
 *
 */
public class testAB {
	/**
	 * initialisation de i avec pour valeur 1, m pour valeur 10 et x 0
	 * boucle à 10 tours 
	 * @param args
	 */

	public static void main(String[] args) {
		int i = 1, m = 10, x = 0;
		for (int j = 0; j < m; j++) {
			if (j == 0)
				x = B.divise(i);
			else 
				x = B.divise(x);
				
			System.out.println(x);
		}
		
	}

}
