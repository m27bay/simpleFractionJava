package exo3_12.1;

public class ChaineCryptee {
	String chaineClair, chaineChiffre;
	int decalage;

	ChaineCryptee() {
		this.chaineClair = "";
		this.chaineChiffre = "";
		this.decalage = 0;
	}

	ChaineCryptee(String chaineClair, int decalage) {
		this.chaineClair = chaineClair;
		chiffrer();
		this.decalage = decalage;
	}

	void chiffrer() {
		this.chaineChiffre = this.chaineClair;
		for(int i = 0; i < this.chaineClair.length(); ++i) {
			this.chaineChiffre.charAt(i) = this.chaineClair.charAt(i) + ;
		}
	}

	@Override
	public String toString() {
		return "chaine en clair : " + this.chaineClair +
			", decalage de : " + this.decalage + 
			", chaine chiffre : " + this.chaineChiffre;
	}

	public String getChaineChiffre() {
		return chaineChiffre;
	}

	public String getChaineClair() {
		return chaineClair;
	}

	public int getDecalage() {
		return decalage;
	}


}
