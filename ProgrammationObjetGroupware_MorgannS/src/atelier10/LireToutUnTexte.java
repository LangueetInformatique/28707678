package atelier10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.regex.*;

public class LireToutUnTexte {
	private String Stexte;

	/**
	 * lecture d'un fichier texte dans la chaîne sTexte
	 * 
	 * @param ft descripteur du fichier
	 */
	public LireToutUnTexte(File ft) {
		String ligne = null;
		Stexte = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(ft));
			while ((ligne = br.readLine()) != null) {
				Stexte += ligne + "\n";
			}

		}

		catch (IOException e) {
		}
	}
	
	/** affichage du contenu de Stexte
	 * 
	 */
	public void afficher() {
		System.out.println(Stexte);
	}

	/**
	 * Recherche du nombre d'occurences de s dans sTexte
	 * 
	 * @param s chaîne cherchée
	 * @return nombre d'occurences
	 * 
	 */
	public int Chercher(String s) {

		int deb = -1, nOcc = 0;
		while ((deb = Stexte.indexOf(s, deb+1)) != -1)
			nOcc++;
		
		return nOcc;
	}

	/**
	 * Affichage du contexte des occurences de s dans sTexte
	 * 
	 * @param s      chaîne cherchée
	 * @param taille taille du contexte
	 */
	public static String ChercherVoir(String texte, String chaine, int Contexte_mots) {
		
		String contexte;
		if(texte.contains(chaine)) {
			
			
			int index_start = texte.indexOf(chaine) - (Contexte_mots) ;
			int index_end = texte.indexOf(chaine) + (Contexte_mots + chaine.length());
			
			contexte = texte.substring(index_start,index_end);
		}
		else {
			
			contexte = null;
			System.out.println("la chaine cherchée n'est pas dans le texte");
		}
		
		return contexte;
	}
	
	public static void ChercherER (String texte, String motCherche) {
		Pattern test = Pattern.compile(motCherche);
		Matcher matcher = test.matcher(texte);
		
		while (matcher.find()) {
			System.out.println("J'ai trouv�" + matcher.group(1));
		}
		
	}
}