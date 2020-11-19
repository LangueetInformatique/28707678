package atelier08;

public class division {

	public static void main (String[] args) {
		
			int i = 1000, j;
			
		try {
			do 
			{
				i--; j = 1/i;
			} while (true);
	
		} catch (Exception e) 
	{
			System.out.println("Il y a eu une erreur !");
			System.out.println(e.getMessage());
		} 
	}
}
// Exception arithmétique : Division par zéro 