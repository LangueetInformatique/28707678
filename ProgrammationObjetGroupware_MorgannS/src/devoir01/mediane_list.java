package devoir01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mediane_list {
	/*
	 * @author Morgann
	 */
	
	public static void main (String[] args) {
		/*
		 * @param args
		 * classe permettant de trouver la valeur m�diane d'une liste de 5 �l�ments 
		 */
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8, p7 = 19, p8 = 2;			// Valeur int pour liste 
		int p6, p6bis = 0, indexMid;
		List<Integer> NbList = new ArrayList<Integer>(); 		// cr�er une liste avec les 5 valeurs

        NbList.add(p1); // 0       
        NbList.add(p2); // 1
        NbList.add(p3); // 2
        NbList.add(p4); // 3
        NbList.add(p5); // 4
        NbList.add(p7); // 5
        //NbList.add(p8);  
        
        System.out.println("Liste d�sordonn�e : " + NbList); 	// Liste d�sordonn�e
        Collections.sort(NbList);								// M�thode import�e de util qui classe par ordre croissant
        System.out.println("Liste ordonn�e : " + NbList); 		// Liste ordonn�e
        
        System.out.println(NbList.size());						
        indexMid = NbList.size()/2;								// On r�cup�re l'indice central de la liste ordonn�e
        System.out.println(indexMid);
        
        if (NbList.size()%2 == 0) { 							// Nbr d'entr�es paires : on obtient les deux valeurs centrales
        	p6 = NbList.get(indexMid);
        	p6bis = NbList.get(indexMid-1);
        	
        	System.out.println("Nombres m�dians : " + p6 + " et " + p6bis);
        } else {
        	
        	p6 = NbList.get(indexMid);
        	System.out.println("Nombre m�dian : " + p6);
        }
	}
}
