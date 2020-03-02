package fr.algorithmie;
import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		
		/* Demande à l'utilisateur un nombre entier et le sauvegarde dans nb. */
		Scanner saisie = new Scanner(System.in);
		System.out.print("Saisissez un nombre entier : ");
		int nb = saisie.nextInt();
		
		/* Affiche les 10 nombres qui suivent nb. */
		System.out.print("\nVoici les 10 nombres suivants: ");
		
		for (int nbsuivants = nb + 1; nbsuivants < nb + 11; ++nbsuivants) {
			System.out.print(" " + nbsuivants);
		}
	}

}



