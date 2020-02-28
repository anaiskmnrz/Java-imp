package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/* Recherche du plus grand élément de array et affichage de celui-ci. */
		int max = -20; // je prends un nombre pas dans array et plus petit que tous.
		
		for (int i = 0; i < array.length; ++i) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max = " + max);

	}

}
