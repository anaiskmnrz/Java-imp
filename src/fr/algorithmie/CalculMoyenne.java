package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
	
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 int array_length = array.length;
		 
		 /* Calcul de la moyenne des éléments de array. */
		 
		 double moyenne = 0;
		 
		 for (int i = 0; i < array_length; ++i) {
			 moyenne += array[i];
		 }
		 moyenne /= array_length;
		 System.out.println("La moyenne des éléments de array est "+ moyenne + ".");

	}

}
