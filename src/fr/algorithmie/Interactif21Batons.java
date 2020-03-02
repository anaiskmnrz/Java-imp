package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		
		int joueur = new Random().nextInt(2)+1; 
		
		/* joueur = 1 -> ordi 
		   joueur = 2 -> utilisateur */
		
		int nbTotalBatons = 21;
		
		/* S�pare en deux codes pour si c'est le j1 ou j2 qui commence. */
		if (joueur == 1) {
			while (nbTotalBatons >= 1) {
			
				/* Il reste un seul b�ton pour l'ordinateur. */
				if (nbTotalBatons == 1) {
					System.out.println("VOUS AVEZ GAGNE! ");
					break;
				}
				
				/* Plusieurs cas optimis�s pour l'ordinateur. */
				if ( 2 <= nbTotalBatons && nbTotalBatons <= 7) {
					if (nbTotalBatons == 7) {
						int nbBatonsOrdi = new Random().nextInt(2)+1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}
					if (nbTotalBatons == 6) {
						int nbBatonsOrdi = 1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 5) {
						int nbBatonsOrdi = new Random().nextInt(3)+1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					} else if (nbTotalBatons == 4) {
						int nbBatonsOrdi = 3; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					} else if (nbTotalBatons == 3) {
						int nbBatonsOrdi = 2; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 2) {
						int nbBatonsOrdi = 1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}
					
				} 
				/* Les cas al�atoires pour l'ordinateur. */
				else {
					int nbBatonsOrdi = new Random().nextInt(3)+1; 
					nbTotalBatons -= nbBatonsOrdi;
					System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
				}
				
				/* Il reste un seul b�ton pour l'utilisateur. */
				if (nbTotalBatons == 1) {
					System.out.println("L'ORDINATEUR A GAGNE! ");
					break;
				}
				
				/* Affichage du nombre de b�tons qu'il reste. */
				System.out.println("---> Il reste " + nbTotalBatons + " b�ton(s).");
				
				/* Demande � l'utilisateur le nombre de b�tons qu'il veut enlever (compris entre 1 et 3). */
				int nbBatonsUtilisateur = 0;
				while ( nbBatonsUtilisateur < 1 || nbBatonsUtilisateur > 3) {
					System.out.print("Choisissez le nombre de b�tons que vous enlevez (entre 1 et 3) : ");
					Scanner saisie = new Scanner(System.in);
					nbBatonsUtilisateur= saisie.nextInt();
				}
				nbTotalBatons -= nbBatonsUtilisateur;
			
			}
		}
		
		
		if (joueur == 2) {
			while (nbTotalBatons >= 0) {
				
				/* Il reste un seul b�ton pour l'utilisateur. */
				if (nbTotalBatons == 1) {
					System.out.println("L'ORDINATEUR A GAGNE! ");
					break;
				}
				
				/* Demande � l'utilisateur le nombre de b�tons qu'il veut enlever (compris entre 1 et 3). */
				int nbBatonsUtilisateur = 0;
				while ( nbBatonsUtilisateur < 1 && nbBatonsUtilisateur > 3) {
					System.out.print("Choisissez le nombre de b�tons que vous enlevez (entre 1 et 3) : ");
					Scanner saisie = new Scanner(System.in);
					nbBatonsUtilisateur= saisie.nextInt();
				}
				nbTotalBatons -= nbBatonsUtilisateur;
			
				/* Il reste un seul b�ton pour l'ordinateur. */
				if (nbTotalBatons == 1) {
					System.out.println("VOUS AVEZ GAGNE");
					break;
				}
				
				/* Plusieurs cas optimis�s pour l'ordinateur. */
				if ( 2 <= nbTotalBatons && nbTotalBatons <= 7) {
					if (nbTotalBatons == 7) {
						int nbBatonsOrdi = new Random().nextInt(2)+1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 6) {
						int nbBatonsOrdi = 1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 5) {
						int nbBatonsOrdi = new Random().nextInt(3)+1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 4) {
						int nbBatonsOrdi = 3; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 3) {
						int nbBatonsOrdi = 2; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 2) {
						int nbBatonsOrdi = 1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
					}
					
				}
				/* Les cas al�atoires pour l'ordinateur. */
				else {
					int nbBatonsOrdi = new Random().nextInt(3)+1; 
					nbTotalBatons -= nbBatonsOrdi;
					System.out.println("\nL'ordinateur a enlev� " + nbBatonsOrdi + " baton(s).");
				}
				
				/* Affichage du nombre de b�tons qu'il reste. */
				System.out.println("---> Il reste " + nbTotalBatons + " b�ton(s).");
			
			}
		}

	}

}
