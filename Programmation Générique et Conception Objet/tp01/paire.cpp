#include "Paire.h"

int main(){

	short n;
	cout << " Entrez votre num�ro n : ";
	cin>>n;
	if (parite(n)==true)
		cout << "n est paire";
	else
		cout << "n est impaire";
	return 0;

}
