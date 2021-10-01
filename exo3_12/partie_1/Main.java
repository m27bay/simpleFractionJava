package exo3_12.partie_1;

// Dans la root du repertoire (simpleFractionJava) /
// javac exo3_12/partie_1/*.java && java exo3_12.partie_1.Main

public class Main {
	static void printf(String mString) {
        System.out.println(mString);
    }
	public static void main(String[] args) {
		// Character c = 'a';
		// System.out.println(c);
		// System.out.println((char)(c+1));
		// ####################################################### //
		// ChaineCryptee cc = new ChaineCryptee("bonjourz", 3);
		// printf(cc.toString());
		
		// printf("chiffre = " + cc.chiffrer());
		// cc.setChaineChiffre(cc.chiffrer());
		
		// printf("clair = " + cc.dechiffer());
		// ####################################################### //
		ChaineCryptee2 cc2 = new ChaineCryptee2("bonjouz", 3);
		printf("\nChiffree = " + cc2.chiffrer());
	}
}
