package atelier04;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class conditionnel3 {

	public static void main(String[] args) {

		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6;
		
		List<Integer> NbList = new ArrayList<Integer>(); // cr�er une liste avec les 5 valeurs

        NbList.add(p1);       
        NbList.add(p2);
        NbList.add(p3);
        NbList.add(p4);
        NbList.add(p5);
        
        System.out.println(NbList); // Liste d�sordonn�e
        Collections.sort(NbList);	// M�thode import�e de util qui classe par ordre croissant
        System.out.println(NbList); // Liste ordonn�e
        
        p6 = NbList.get(2); // On associe la valeur du milieu de la liste � p6
        
        
        System.out.println(p6);
	}

}
