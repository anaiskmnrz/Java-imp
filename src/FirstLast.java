
public class FirstLast {

	public static void main(String[] args) {
		
		int[] array = {4,3,6,1,4};
		int array_length = array.length;
		
		boolean bool = false;
		
		/* Renvoie true si le tableau a au moins 2 éléments et si le dernier et le premmier élément sont égaux. */
		if ( (array_length > 1) && (array[0] == array[array_length-1]) ) {
			bool = true;
		}

		System.out.println("bool = " + bool + ".");
	}

}
