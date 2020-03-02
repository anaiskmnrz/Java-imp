package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		
		/* Affichage une unique fois du menu. */
		System.out.println("Voici un menu des options possibles: ");
		System.out.println("1. Ajouter un nombre au tableau.");
		System.out.println("2. Afficher le tableau avec les nombres existants.");
		
		/* Choix d'une taille de tableau arbitraire pour array. */
		int[] array = new int[10];
		int nbTours = 0;
		int index = 0;
		int nbOption = 0;

		/* Choix arbitraire d'un nombre de tours pour le programme. */
		int nbToursMax = 15;
		System.out.println("Le programme va tourner " + nbToursMax + " fois.\n");
		
		/* On fixe un nombre de tours, au bout de nbTours, le programme s'arrête*/
		while (nbTours < nbToursMax) {
			
			/* Choix de l'option par l'utilisateur. */
			nbOption = 0;
			while ( (nbOption != 1) && (nbOption != 2) ) {
				System.out.print("Indiquez le numéro de l'option que vous souhaitez: ");
			
				Scanner saisie = new Scanner(System.in);
				nbOption = saisie.nextInt();
			}
			++nbTours;
			
			/* S'il choisit la 1. */
			if (nbOption == 1) {
				
				/* Agrandissement du tableau si nécessaire, de 10 en 10. */
				if (index == array.length) {
					int[] arrayCopy = new int[index+10];
					for (int i = 0; i < index ; ++i) {
						arrayCopy[i] = array[i];
					}
					array = arrayCopy; 	
				}
				
				/* Demande du nombre à ajouter. */
				System.out.print("\nQuel est le nombre que vous souhaitez ajouter? ");
				Scanner saisie = new Scanner(System.in);
				int nb = saisie.nextInt();
				
				/* Ajout du nombre en question. */
				array[index] = nb;
				++index;
				
			}
			/* Option n°2 : Affichage du tableau. */
			else {
				System.out.print("\nVoici le tableau: [");
				for (int i = 0; i < index; ++i) {
					System.out.print(" " + array[i]);
				}
				System.out.println(" ].");
			}
			
		}
	}

}
