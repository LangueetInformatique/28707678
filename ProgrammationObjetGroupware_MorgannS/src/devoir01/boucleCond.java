package devoir01;

public class boucleCond {

	public boucleCond() {
		
		/**
		 * @author Morgann Sabatier
		 */

		String s1; 	// Test string
		String s2; 	// Chaîne comparée à s1
		
		// Limits for my loop
		int i1; 	// Première position de ma châine de caractère
		int i2; 	// Dernière position de ma châine de caractère
		
		// characters 
		char c1; 	// test caractère s1
		char c2; 	// test caractère s2
		
	}

	public static void main(String[] args) {
		/**
		 * Test de ma châine de caractère avec une autre
		 * Renvoie true si les chaînes sont miroirs l'une de l'autre
		 */
		
		String s1 = "azerty", s2 = "ytreza"; 	// Définition de mes chaînes de caractères
		int i1 = 0, i2 = s2.length()-1; 		// Début (i1) et fin (i2) de mes chaînes de caractères
		char c1, c2; 							// test caractère c1 dans s1 et caractère c2 dans s2
		boolean flag = false; 					// resultat Vrai ou Faux
				
		do 
		{
			c1 = s1.charAt(i1); c2 = s2.charAt(i2); // def valeur de départ et de fin. 
													// Chaque tour de boucle --> change la valeur de i2 et i1 pour tester le caractère suivant
			if (c1 == c2) 
			{
				flag = true;
			}
			else
				flag = false;
			
			i1++;
			i2--;
			
		} while (i1 != s1.length() && flag == true); 
		
		System.out.println("Les chaînes de caractères sont miroirs : " + flag);
	}	
}
