package atelier05;

import cours04.Date;

public class ex1_nbJours {

	public static void main(String[] args) {
		Date df = new Date(14,7,2021); /* initialisation date finale */
		Date di = new Date(22,10,2020); /* initialisation date initiale */
		
		int nb = 0; /* initialisation compteur jours */
		
		while(di.CompareTo(df) == true){ /* boucle qui compare la date initiale à la date finale tant qu'elles sont différentes */
			
			di.Incrementer(); /* On ajoute un jour à chaque tour de boucle */
			nb++; /* ajoute 1 à chaque tour de boucle, donc chaque jour */
		}
		
		System.out.println("Il y a " + nb + "jour(s) de différence"); /* On affiche le compteur*/
	}
}
