
public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] array = {5,5656,44,58,6};
		int array_length = array.length;
	
		boolean bool = false;
		/* Renvoie true si le tableau a au moins 1 élément et si le dernier ou premier élément vaut 6. */
		
		if ((array_length >= 1) && ((array[0] == 6) || (array[array_length-1] == 6)) ) {
			bool = true;
		}

		System.out.println("bool = " + bool + ".");
	}

}
