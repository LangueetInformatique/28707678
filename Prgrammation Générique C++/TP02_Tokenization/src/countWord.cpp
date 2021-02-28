#include "countWord.h"

vector<char> tab_car;
int tailleTab;

void countWord(string fichier)
{
	ifstream nomFichier(fichier);
	//ifstream monFlux(nomFichier.c_str());

	string text = "";
	if(nomFichier)
	{
		string ligne;

		while(getline(nomFichier, ligne))
		{
			text+=ligne+"\n";

		}
	}
	else
	{
		cerr << "ERREUR" << endl;
	}

	// cout << text.length() << endl; (renvoie le nombre de caract�res totaux)


	vector<char> tableau_char;
	int l = 0; // Taille tableau

	// on fait un tableau de compos� de chaque caract�re du texte
	for (int i = 0; i < text.length(); i++)
	{
		l+=1;
		tableau_char.push_back(text[i]);

		//cout << tableau_char[i] <<endl;
	}

	renvoieNbreTokens(tableau_char, l, 2);
}

int renvoieNbreTokens(vector<char> tableau_char, int l, int methode) {

	//
	int countW = 1; // Initialisation � 1 car une phrase commence par un mot AVANT le premier s�parateur

	if (methode == 1)
	{
		for(int i = 0; i < l; i++)
		{
			// Am�liorer le code : lister la ponctuation dans un tableau puis le parcourir en comparant
			if (tableau_char[i]== '...' || tableau_char[i]== ' ' || tableau_char[i]== '\t' || tableau_char[i]== '\n'|| tableau_char[i]== '.'|| tableau_char[i]== ','|| tableau_char[i]== '!' || tableau_char[i]== '?')
			// c'est la liste de nos s�parateur, les 3 points sont en premier par pr�caution car nous avons le point simple comme s�parateur qui est un s�parateur diff�rent
			{
				countW+=1;
			}
		}
	}
	else if (methode == 2)
	{
		regex token("[^0-9A-Za-z]");
		for(int i = 0; i < l; i++)
			{
				if (regex_match(string(1, tableau_char[i]), token))
				{
					countW+=1;
				}
			}
	}
	else
	{
		cout << "Choisir m�thode 1 ou 2" << endl;
	}

	cout << "Le texte comporte " << countW << " tokens en utlisant la m�thode "<< methode << endl;
	return countW;

}

void compterNbreE(){

	// Attention, on ne prend pas en compte la casse, pour prendre en compte la casse il faudrait convertir mon test en une string toUpper ou toLower.

	// Alternative : mettre la chaine de caract�re en param�tre de la fonction
	string test = "ebebeahabe bee ebah ";
	char lettre = 'e';


	int taille = test.length();
	int countE = 0;

	for(int i = 0; i < taille; i++) {
		if (test[i] == lettre){
			countE +=1;
		}
	}
	cout << "Il y a " << countE << " occurences de la lettre " << lettre << " dans le texte." << endl;
}

void attributionChar(){
	string chaine = "abcd zkdnc";

	for(int j=0; j<chaine.size(); j++)
	{
		bool dansTab = false;

		for(int i=0; i <tailleTab; i++)
		{
			if(chaine[j]==tab_car[i])
			{
				dansTab = true;
			}
		}

		if (dansTab == false)
		{
			tab_car.push_back(chaine[j]);
			tailleTab+=1;
		}
		cout << tab_car[j] << endl;
		cout << tab_car.size() << endl;
	}
}
