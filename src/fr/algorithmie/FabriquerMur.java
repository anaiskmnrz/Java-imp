package fr.algorithmie;

public class FabriquerMur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tests de vérification   
		verifier(3, 1, 8, true);   
		verifier(3, 1, 9, false);   
		verifier(3, 2, 10, true);   
		verifier(3, 2, 8, true);   
		verifier(3, 2, 9, false);   
		verifier(6, 1, 11, true);   
		verifier(6, 0, 11, false);   
		verifier(1, 4, 11, true);   
		verifier(0, 3, 10, true);   
		verifier(1, 4, 12, false);   
		verifier(3, 1, 7, true);   
		verifier(1, 1, 7, false);
	}
	
	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		boolean resultat = false;
		
		/* Calcul du total en mètres pour les briques de 1m et pour celles de 5m. */
		int nbTotalSmall = nbSmall;
		int nbTotalBig = 5*nbBig;
		
		/* Nombre total de mètres disponibles. */
		int nbTotal = nbTotalSmall + nbTotalBig;
		
		/* Calcul si le mur de la longueur demandée est constructible. */
		if (nbTotal >= longueur) {
			
			int tmp = longueur % 5;
			if (tmp <= nbTotalSmall) {
				resultat = true;
			}
		}
		/* Retourne true si oui, false si non. */
		return resultat;
	}
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}

}
