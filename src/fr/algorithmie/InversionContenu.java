package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;  
		int[] arrayCopy = new int[array.length];
		
		int array_length = array.length;
		
		/* Inversion du contenu de array dans arrayCopy + affichage array. */
		System.out.print("array = { ");
		for (int i = 0; i < array_length; ++i) {
			arrayCopy[i] = array [array_length-i-1];
			System.out.print(array[i] +" ");
		}
		System.out.print("}\n");
		
		/* Affichage arrayCopy. */
		System.out.print("arrayCopy = { ");
		for (int i = 0; i < array_length; ++i) {
			System.out.print(arrayCopy[i] +" ");
		}
		System.out.print("}");
	}

}
