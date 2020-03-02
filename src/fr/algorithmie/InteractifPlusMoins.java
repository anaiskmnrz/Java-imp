package fr.algorithmie;
import java.util.Random;
import java.util.Scanner; 

public class InteractifPlusMoins {

	public static void main(String[] args) {
		/* G�n�ration al�atoire d'un nombre entre 1 et 100. */
		int secretNb = new Random().nextInt(100)+1; 
		
		int nb = -1;
		int tentativesNb = 0;
		System.out.println("Essayez de deviner le nombre secret compris entre 1 et 100.");
		
		/* Recherche par l'utilisateur du nombre secret avec calcul du nombre de coups et indications.*/
		while (nb != secretNb) {
			Scanner saisie = new Scanner(System.in);
			System.out.print("Quelle est votre propostition? ");
			nb = saisie.nextInt();
			++tentativesNb;
			
			if (nb < secretNb) {
				System.out.println("Vous �tes en dessous.");
			}
			if (nb > secretNb) {
				System.out.println("Vous �tes au dessus.");
			}
		}
		
		/* Affichage d'un message de f�licitations avec le nombre de coups pour trouver le nombre. */
		System.out.println("\nBravo, vous avez trouv� en " + tentativesNb + " coups.");
		

	}

}
