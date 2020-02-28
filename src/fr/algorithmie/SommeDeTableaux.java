package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
	
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		
		int array1_length = array1.length;
		int array2_length = array2.length;
		
		
		/* Les deux tableaux ne sont pas de la même longueur. */
		if (array1_length != array2_length) {
			System.out.println("Les deux tableaux sont de tailles différentes.");
		} 
		/* Somme des deux tableaux dans un nouveau tableau arraySomme + affichage de celui-ci. */
		else {
			int[] arraySomme = new int[array1_length];
			System.out.print("Somme des deux tableaux dans un nouveau tableau: ");
			for (int i = 0; i < array1_length; ++i) {
				arraySomme[i] = array1[i] + array2[i];
				System.out.print(arraySomme[i] + " ");
			}
			
		}
	}

}
