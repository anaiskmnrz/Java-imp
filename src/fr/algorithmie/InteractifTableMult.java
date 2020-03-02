package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		
		/* Demande à l'utilisateur un nombre entier compris entre 1 et 10 et le sauvegarde dans nb. 
		 La demande est formulée jusqu'à temps que le nombre soit entre 1 et 10.  */
		int nb = 0;
		
		while ((nb < 1) || (nb > 10)) {
			Scanner saisie = new Scanner(System.in);
			System.out.print("Saisissez un nombre entier compris entre 1 et 10 : ");
			nb = saisie.nextInt();
		}
		
		/* Affiche la table de multiplication de ce nombre. */
		System.out.println("\nVoici la table de multiplication de " + nb + " : ");
		System.out.println(nb + " * 1 = " + nb*1);
		System.out.println(nb + " * 2 = " + nb*2);
		System.out.println(nb + " * 3 = " + nb*3);
		System.out.println(nb + " * 4 = " + nb*4);
		System.out.println(nb + " * 5 = " + nb*5);
		System.out.println(nb + " * 6 = " + nb*6);
		System.out.println(nb + " * 7 = " + nb*7);
		System.out.println(nb + " * 8 = " + nb*8);
		System.out.println(nb + " * 9 = " + nb*9);
		System.out.println(nb + " * 10 = " + nb*10);

	}

}
