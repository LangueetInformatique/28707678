package devoir01;

public class iteration {

	public iteration() {
		int imin;
		int i;
		int result;
		/*
		 * @author Morgann Sabatier 
		 */
	}

	public static void main (String[] args) 
	{
		/*
		 * @param args
		 * 
		 * cette classe permet d'obtenir l'indice du premier prénom dans l'ordre lexicographique
		 * 
		 */
		String[] prenoms = {"Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djamé"};
		int imin = 0;
		int i;
		//System.out.println(prenoms[0].compareTo(prenoms[1]));
		// Lorsque que résultat compareTo négatif --> prenoms[0] est avant dans l'ordre lexicographique
		//
		// Je dois vérifier si prenoms[0].compareTo(prenoms[1]) > 0
		// Mon prénom le premier dans l'ordre lexicographique : "Agatha" soit prenoms[3]
		int longueur = prenoms.length;
		
		for (i=0; i < longueur-1; i++) 
		{
			//System.out.println(prenoms[i].compareTo(prenoms[i+1]));
			int result = prenoms[i].compareTo(prenoms[i+1]);
			//System.out.println(result);
			if (result < 0)
			{	
				imin = i;
			} else {
				imin = i+1;
			}
		}
		System.out.println("Le prénom " + prenoms[imin]); 							// Premier prénom ordre lexicographique
		System.out.println("est à la position numéro " + imin + " de la liste");			// Son indice
	}
}


