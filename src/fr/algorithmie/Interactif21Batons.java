package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		
		int joueur = new Random().nextInt(2)+1; 
		
		/* joueur = 1 -> ordi 
		   joueur = 2 -< utilisateur */
		
		int nbTotalBatons = 21;
		
		if (joueur == 1) {
			while (nbTotalBatons >= 0) {
			
				/* Il reste un seul b�ton pour l'ordinateur. */
				if (nbTotalBatons == 1) {
					System.out.println("Vous avez gagn�! ");
					break;
				}
				
				if ( 3 <= nbTotalBatons && nbTotalBatons <= 7) {
					int nbBatonsOrdi = new Random().nextInt(nbTotalBatons)+1; 
					nbTotalBatons -= nbBatonsOrdi;
					System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
				} else {
					int nbBatonsOrdi = new Random().nextInt(3)+1; 
					nbTotalBatons -= nbBatonsOrdi;
					System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
				}
				
				/* Il reste un seul b�ton pour l'utilisateur. */
				if (nbTotalBatons == 1) {
					System.out.println("L'ordinateur a gagn�! ");
					break;
				}
				System.out.println("Il reste " + nbTotalBatons + " b�ton(s).");
				
				System.out.print("Choisissez le nombre de b�tons que vous enlevez (entre 1 et 3) : ");
				Scanner saisie = new Scanner(System.in);
				int nbBatonsUtilisateur= saisie.nextInt();
				nbTotalBatons -= nbBatonsUtilisateur;
			
			}
		}

	}

}
