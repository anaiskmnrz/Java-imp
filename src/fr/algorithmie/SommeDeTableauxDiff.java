package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ; 
		
		int array1_length = array1.length;
		int array2_length = array2.length;
		int somme_length = 0;
		
		if (array1_length > array2_length) {
			somme_length = array2_length;
		} else {
			somme_length = array1_length;
		}
		
		int[] arraySomme = new int[somme_length];
		for (int i = 0; i < somme_length; ++i) {
			//ajoute la somme jusquà plus petite longueur
		}
//complète avec somme avecdes 0 à finir lundi.
	}

}
