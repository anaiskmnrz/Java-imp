package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 3;
		double d = 3456648486.2;
		float f = 5897.12f;
		short s = 129;
		byte b = 127;
		char c = 'a';
		boolean B = true;
		long l = 15684166554865465L;
	
		System.out.println("int = " + i);
		System.out.println("double = "+ d);
		System.out.println("float = " + f);
		System.out.println("short = " + s);
		System.out.println("byte = " + b);
		System.out.println("char = " + c);
		System.out.println("boolean = " + B);
		System.out.println("long = " + l + "\n");
		
		String randomString = "Voici le résultat d'un calcul:\n1+5=6";
		
		System.out.println(randomString);
		for (int j = 0; j < 10; ++j) {
			System.out.println(j);
		}
	}

	
}
