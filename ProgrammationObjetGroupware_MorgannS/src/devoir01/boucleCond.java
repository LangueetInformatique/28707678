package devoir01;

public class boucleCond {

	public boucleCond() {
		
		/**
		 * @author Morgann Sabatier
		 */

		String s1; 	// Test string
		String s2; 	// Cha�ne compar�e � s1
		
		// Limits for my loop
		int i1; 	// Premi�re position de ma ch�ine de caract�re
		int i2; 	// Derni�re position de ma ch�ine de caract�re
		
		// characters 
		char c1; 	// test caract�re s1
		char c2; 	// test caract�re s2
		
	}

	public static void main(String[] args) {
		/**
		 * Test de ma ch�ine de caract�re avec une autre
		 * Renvoie true si les cha�nes sont miroirs l'une de l'autre
		 */
		
		String s1 = "azerty", s2 = "ytreza"; 	// D�finition de mes cha�nes de caract�res
		int i1 = 0, i2 = s2.length()-1; 		// D�but (i1) et fin (i2) de mes cha�nes de caract�res
		char c1, c2; 							// test caract�re c1 dans s1 et caract�re c2 dans s2
		boolean flag = false; 					// resultat Vrai ou Faux
				
		do 
		{
			c1 = s1.charAt(i1); c2 = s2.charAt(i2); // def valeur de d�part et de fin. 
													// Chaque tour de boucle --> change la valeur de i2 et i1 pour tester le caract�re suivant
			if (c1 == c2) 
			{
				flag = true;
			}
			else
				flag = false;
			
			i1++;
			i2--;
			
		} while (i1 != s1.length() && flag == true); 
		
		System.out.println("Les cha�nes de caract�res sont miroirs : " + flag);
	}	
}
