package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		
		/* Demande � l'utilisateur un nombre entier strictement positif et le sauvegarde dans nb. 
		 La demande est formul�e jusqu'� temps que le nombre soit strictement positif.  */
		int nb = 0;
		
		while (nb <= 0) {
			Scanner saisie = new Scanner(System.in);
			System.out.print("Saisissez un nombre entier strictement positif : ");
			nb = saisie.nextInt();
		}
		
		/* Calcule et affiche la somme arith�mtique de nb. */
		int somme = 0;
		
		for (int i = 1; i < nb + 1; ++i) {
			somme += i;
		}
		 System.out.print("Somme arithm�tique de "+nb+" = " + somme + ".");
	}

}
