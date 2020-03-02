package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ; 
		
		int array1_length = array1.length;
		int array2_length = array2.length;
		
		int diff_array = array1_length-array2_length;
		
		
		/* Si le plus grand tableau est le array1. */
		if (diff_array >= 0) {
			int[] arraySomme = new int[array1_length];
			
			/* Addition des deux jusqu'à la taille de array2. */
			for (int i = 0; i < array2_length; ++i) {
				arraySomme[i] = array1[i] + array2[i];
			}
			
			/* Ajout des nombres en plus de array1. */
			for (int i = array2_length; i < array1_length; ++i) {
				arraySomme[i] = array1[i];
			}
			
			/* Affichage de la somme des deux tableaux. */
			System.out.print("Somme des deux tableaux dans un nouveau tableau: ");
			for (int i = 0; i < array1_length; ++i) {
				System.out.print(arraySomme[i] + " ");
			}
			
		/* Si le plus grand tableau est le array2. */	
		} else {
			int[] arraySomme = new int[array2_length];
			
			/* Addition des deux jusqu'à la taille de array1. */
			for (int i = 0; i < array1_length; ++i) {
				arraySomme[i] = array1[i] + array2[i];
			}
			
			/* Ajout des nombres en plus de array2. */
			for (int i = array1_length; i < array2_length; ++i) {
				arraySomme[i] = array2[i];
			}
			
			/* Affichage de la somme des deux tableaux. */
			System.out.print("Somme des deux tableaux dans un nouveau tableau: ");
			for (int i = 0; i < array2_length; ++i) {
				System.out.print(arraySomme[i] + " ");
			}
		}
		
		
		
	}

}
