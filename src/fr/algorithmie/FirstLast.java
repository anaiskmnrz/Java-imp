package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] array = {4,3,6,1,4};
		int array_length = array.length;
		
		boolean bool = false;
		
		/* Renvoie true si le tableau a au moins 2 �l�ments et si le dernier et le premmier �l�ment sont �gaux. */
		if ( (array_length > 1) && (array[0] == array[array_length-1]) ) {
			bool = true;
		}

		System.out.println("bool = " + bool + ".");
	}

}
