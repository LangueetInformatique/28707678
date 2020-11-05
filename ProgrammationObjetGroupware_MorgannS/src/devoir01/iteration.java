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
		 * cette classe permet d'obtenir l'indice du premier pr�nom dans l'ordre lexicographique
		 * 
		 */
		String[] prenoms = {"Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djam�"};
		int imin = 0;
		int i;
		//System.out.println(prenoms[0].compareTo(prenoms[1]));
		// Lorsque que r�sultat compareTo n�gatif --> prenoms[0] est avant dans l'ordre lexicographique
		//
		// Je dois v�rifier si prenoms[0].compareTo(prenoms[1]) > 0
		// Mon pr�nom le premier dans l'ordre lexicographique : "Agatha" soit prenoms[3]
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
		System.out.println("Le pr�nom " + prenoms[imin]); 							// Premier pr�nom ordre lexicographique
		System.out.println("est � la position num�ro " + imin + " de la liste");			// Son indice
	}
}


