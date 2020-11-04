package atelier04;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class conditionnel3 {

	public static void main(String[] args) {

		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6;
		
		List<Integer> NbList = new ArrayList<Integer>(); // créer une liste avec les 5 valeurs

        NbList.add(p1);       
        NbList.add(p2);
        NbList.add(p3);
        NbList.add(p4);
        NbList.add(p5);
        
        System.out.println(NbList); // Liste désordonnée
        Collections.sort(NbList);	// Méthode importée de util qui classe par ordre croissant
        System.out.println(NbList); // Liste ordonnée
        
        p6 = NbList.get(2); // On associe la valeur du milieu de la liste à p6
        
        
        System.out.println(p6);
	}

}
