package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		
		/* Demande du rang N à l'utilisateur. */
		System.out.print("Choisissez le rang N: ");
		Scanner saisie = new Scanner(System.in);
		int N = saisie.nextInt();

		/* Création du tableau qui contient la suite de Fibonacci jusqu'au rang N + initialisations. */
		int[] U = new int[N+1];
		U[0] = 0;
		/* Si le rang N = 0, le tableau est de taille 1 donc on évite une erreur avec ce if. */
		if (N != 0) {
			U[1] = 1;
		}
		
		/* Calcul des nombres de la suite de Fibonacci jusqu'au rang N. */
		int n = 2;
		while ( (n <= N) && (N != 0) && (N != 1) ) {
			U[n] = U[n-1] + U[n-2];
			++n;
		}
		
		/* Affichage du nombre de la suite de Fibonacci de rang N. */
		System.out.println("Nombre de la suite de Fibonacci de rang " + N + " : " + U[N]);
	}

}
