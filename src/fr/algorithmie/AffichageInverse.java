package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("Affichage normal");
		
		for (int i = 0; i < array.length; ++i) {
			System.out.println(array[i]);
		}
		
		System.out.println("\nAffichage inverse");
		
		for (int i = array.length - 1; i >= 0; --i) {
			System.out.println(array[i]);
		}
		
		/*Copie des �l�ments de array dans arrayCopie*/
		
		System.out.println("\nV�rification arrayCopy");
		
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; ++i) {
			arrayCopy[i] = array[i];
			
			/*V�rification en m�me temps*/
			System.out.println(arrayCopy[i]);
		}
		
		
	}

}
