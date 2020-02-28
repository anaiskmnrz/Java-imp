package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 int array_length = array.length;
		 
		 /* Affiche que les entiers > 3 contenus dans array. */
		 
		 System.out.print("Nombres > 3 dans array : ");
		 for (int i = 0; i < array_length; ++i) {
			 if (array[i] > 3) {
				 System.out.print(array[i] + " ");
			 }
		 }
		 
		 /* Affiche que les entiers pairs contenus dans array. */
		 
		 System.out.print("\nNombres pairs dans array : ");
		 for (int i = 0; i < array_length; ++i) {
			 if (array[i] % 2 == 0) {
				 System.out.print(array[i] + " ");
			 }
		 }
		 
		 /* Affiche que les entiers d'index pairs contenus dans array. */
		 
		 System.out.print("\nNombres d'index pairs dans array : ");
		 for (int i = 0; i < array_length; ++i) {
			 if (i % 2 == 0) {
				 System.out.print(array[i] + " ");
			 }
		 }
		 
		 /* Affiche que les entiers impairs contenus dans array. */
		 
		 System.out.print("\nNombres impairs dans array : ");
		 for (int i = 0; i < array_length; ++i) {
			 if ((array[i] % 2 == 1) || (array[i] % 2 == -1) ) {
				 System.out.print(array[i] + " ");
			 }
		 }

	}

}
