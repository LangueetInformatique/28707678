package devoir01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mediane_list {
	/*
	 * @author Morgann
	 */
	
	public static void main(String[] args) {
		/*
		 * @param args
		 * classe permettant de trouver la valeur médiane d'une liste de 5 éléments 
		 */
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;			// Valeur int pour liste 
		int p6;
		
		List<Integer> NbList = new ArrayList<Integer>(); 		// créer une liste avec les 5 valeurs

        NbList.add(p1);       
        NbList.add(p2);
        NbList.add(p3);
        NbList.add(p4);
        NbList.add(p5);
        
        System.out.println("Liste désordonnée : " + NbList); 	// Liste désordonnée
        Collections.sort(NbList);								// Méthode importée de util qui classe par ordre croissant
        System.out.println("Liste ordonnée : " + NbList); 		// Liste ordonnée
        
        p6 = NbList.get(2); 									// On associe la valeur du milieu de la liste à p6
        
        System.out.println("Nombre médian : " + p6);
	}

}
