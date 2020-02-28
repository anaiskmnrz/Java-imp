package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int array_length = array.length;
		
		/* Affichage normal de array. */
		System.out.println("Affichage normal");
		
		for (int i = 0; i < array_length; ++i) {
			System.out.println(array[i]);
		}
		
		/* Affichage inverse de array. */
		System.out.println("\nAffichage inverse");
		
		for (int i = array_length - 1; i >= 0; --i) {
			System.out.println(array[i]);
		}
		
		/* Copie des éléments de array dans arrayCopy. */
		
		System.out.println("\nVérification arrayCopy");
		
		int[] arrayCopy = new int[array_length];
		for (int i = 0; i < array_length; ++i) {
			arrayCopy[i] = array[i];
			
			/* Vérification en même temps avec l'affichage de arrayCopy. */
			System.out.println(arrayCopy[i]);
		}
		
		
	}

}
