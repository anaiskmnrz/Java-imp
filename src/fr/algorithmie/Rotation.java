package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		int[] array = {0,1,2,3};
		int array_length = array.length;
		
		int tmp = array[0];
		int tmp2 = 0;
		
		/* Rotation des �l�ments du tableau array vers la droite. */
		for (int i = 0; i < array_length; ++i) {
			tmp2 = array[(i+1)%array_length];
			array[(i+1)%array_length] = tmp;
			tmp = tmp2;
		}
		
		/* Affichage du tableau apr�s rotation. */
		System.out.print("tableau apr�s rotation � droite: ");
		for (int i = 0; i < array_length; ++i) {
			System.out.print(array[i] + " " );
		}
	}
		

}
