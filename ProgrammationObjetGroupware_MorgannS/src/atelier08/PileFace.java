package atelier08;

public class PileFace {

	public static void main(String[] args) {
		Aleat test = new Aleat(2);
		int pile = 0; 
		int face = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (test.get() == 1)
				pile++;
			else
				face++;
		}
			System.out.println("Nombre de pile : " + pile + " \nNombre de face : " + face);
		}
		
	}

