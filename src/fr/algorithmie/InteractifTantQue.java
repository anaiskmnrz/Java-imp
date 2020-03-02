package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		/* Demande à l'utilisateur un nombre entier compris entre 1 et 10 et le sauvegarde dans nb. 
		 La demande est formulée jusqu'à temps que le nombre soit entre 1 et 10.  */
		int nb = 0;
		
		while ((nb < 1) || (nb > 10)) {
			Scanner saisie = new Scanner(System.in);
			System.out.print("Saisissez un nombre entier compris entre 1 et 10 : ");
			nb = saisie.nextInt();
		}
		
		/* Affiche ce nombre entre 1 et 10. */
		System.out.println("Voici le nombre entré par l'utilisateur compris entre 1 et 10 : " + nb + ".");

	}

}
