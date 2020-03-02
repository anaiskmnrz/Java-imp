package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		
		/* Demande à l'utilisateur un nombre entier et le sauvegarde dans nb. */
		Scanner saisie = new Scanner(System.in);
		System.out.print("Saisissez dix nombres entiers : ");
		int[] nb = new int[10];
		for (int i = 0; i < 10; ++i) {
			nb[i] = saisie.nextInt();
		}

		/* Affichage du tableau entré par l'utilisateur : */
		System.out.print("Affichage du tableau entré par l'utilisateur : [");
		for (int i = 0; i < 10; ++i) {
			System.out.print(" " + nb[i]);
		}
		System.out.print(" ]. ");
		
		/* Recherche du plus grand élément de nb et affichage de celui-ci. */
		int max = nb[0]; // Je prends un élément du tableau au hasard, j'ai choisi le 1er.
		
		for (int i = 0; i < 10; ++i) {
			if (nb[i] > max) {
				max = nb[i];
			}
		}
		System.out.println("\nmax = " + max +".");
		
	}

}
