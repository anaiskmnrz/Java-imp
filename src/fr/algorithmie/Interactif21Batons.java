package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		
		int joueur = new Random().nextInt(2)+1; 
		
		/* joueur = 1 -> ordi 
		   joueur = 2 -> utilisateur */
		
		int nbTotalBatons = 21;
		
		/* Sépare en deux codes pour si c'est le j1 ou j2 qui commence. */
		if (joueur == 1) {
			while (nbTotalBatons >= 1) {
			
				/* Il reste un seul bâton pour l'ordinateur. */
				if (nbTotalBatons == 1) {
					System.out.println("VOUS AVEZ GAGNE! ");
					break;
				}
				
				/* Plusieurs cas optimisés pour l'ordinateur. */
				if ( 2 <= nbTotalBatons && nbTotalBatons <= 7) {
					if (nbTotalBatons == 7) {
						int nbBatonsOrdi = new Random().nextInt(2)+1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}
					if (nbTotalBatons == 6) {
						int nbBatonsOrdi = 1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 5) {
						int nbBatonsOrdi = new Random().nextInt(3)+1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					} else if (nbTotalBatons == 4) {
						int nbBatonsOrdi = 3; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					} else if (nbTotalBatons == 3) {
						int nbBatonsOrdi = 2; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 2) {
						int nbBatonsOrdi = 1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}
					
				} 
				/* Les cas aléatoires pour l'ordinateur. */
				else {
					int nbBatonsOrdi = new Random().nextInt(3)+1; 
					nbTotalBatons -= nbBatonsOrdi;
					System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
				}
				
				/* Il reste un seul bâton pour l'utilisateur. */
				if (nbTotalBatons == 1) {
					System.out.println("L'ORDINATEUR A GAGNE! ");
					break;
				}
				
				/* Affichage du nombre de bâtons qu'il reste. */
				System.out.println("---> Il reste " + nbTotalBatons + " bâton(s).");
				
				/* Demande à l'utilisateur le nombre de bâtons qu'il veut enlever (compris entre 1 et 3). */
				int nbBatonsUtilisateur = 0;
				while ( nbBatonsUtilisateur < 1 || nbBatonsUtilisateur > 3) {
					System.out.print("Choisissez le nombre de bâtons que vous enlevez (entre 1 et 3) : ");
					Scanner saisie = new Scanner(System.in);
					nbBatonsUtilisateur= saisie.nextInt();
				}
				nbTotalBatons -= nbBatonsUtilisateur;
			
			}
		}
		
		
		if (joueur == 2) {
			while (nbTotalBatons >= 0) {
				
				/* Il reste un seul bâton pour l'utilisateur. */
				if (nbTotalBatons == 1) {
					System.out.println("L'ORDINATEUR A GAGNE! ");
					break;
				}
				
				/* Demande à l'utilisateur le nombre de bâtons qu'il veut enlever (compris entre 1 et 3). */
				int nbBatonsUtilisateur = 0;
				while ( nbBatonsUtilisateur < 1 && nbBatonsUtilisateur > 3) {
					System.out.print("Choisissez le nombre de bâtons que vous enlevez (entre 1 et 3) : ");
					Scanner saisie = new Scanner(System.in);
					nbBatonsUtilisateur= saisie.nextInt();
				}
				nbTotalBatons -= nbBatonsUtilisateur;
			
				/* Il reste un seul bâton pour l'ordinateur. */
				if (nbTotalBatons == 1) {
					System.out.println("VOUS AVEZ GAGNE");
					break;
				}
				
				/* Plusieurs cas optimisés pour l'ordinateur. */
				if ( 2 <= nbTotalBatons && nbTotalBatons <= 7) {
					if (nbTotalBatons == 7) {
						int nbBatonsOrdi = new Random().nextInt(2)+1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 6) {
						int nbBatonsOrdi = 1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 5) {
						int nbBatonsOrdi = new Random().nextInt(3)+1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 4) {
						int nbBatonsOrdi = 3; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 3) {
						int nbBatonsOrdi = 2; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}else if (nbTotalBatons == 2) {
						int nbBatonsOrdi = 1; 
						nbTotalBatons -= nbBatonsOrdi;
						System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
					}
					
				}
				/* Les cas aléatoires pour l'ordinateur. */
				else {
					int nbBatonsOrdi = new Random().nextInt(3)+1; 
					nbTotalBatons -= nbBatonsOrdi;
					System.out.println("\nL'ordinateur a enlevé " + nbBatonsOrdi + " baton(s).");
				}
				
				/* Affichage du nombre de bâtons qu'il reste. */
				System.out.println("---> Il reste " + nbTotalBatons + " bâton(s).");
			
			}
		}

	}

}
