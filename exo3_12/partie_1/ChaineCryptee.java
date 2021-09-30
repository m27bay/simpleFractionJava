package exo3_12.partie_1;

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
		this.chaineChiffre = "";
		this.decalage = decalage;
	}

	String chiffrer() {
		String chiffre = "";
		if(this.chaineClair == "") {
			return chiffre;
		}
		for(int i = 0; i < this.chaineClair.length(); ++i) {
			char c = this.chaineClair.charAt(i);
			if((int)c + this.decalage > (int)'z') {
				int cpyDecalage = this.decalage;
				cpyDecalage -= (int)c - (int)'z' + 1;
				c = 'a';
				c += cpyDecalage;
				chiffre += c;
			}
			else {
				chiffre += (char)((int)c + this.decalage);
			}
		}

		return chiffre;
	}
	
	String dechiffer() {
		String clair = "";
		for(int i = 0; i < this.chaineChiffre.length(); ++i) {
			char c = this.chaineChiffre.charAt(i);
			if((int)c - this.decalage < (int)'a') {
				int cpyDecalage = this.decalage;
				cpyDecalage += (int)'a' - (int)c - 1;
				c = 'z';
				c -= cpyDecalage;
				clair += c;
			}
			else {
				clair += (char)((int)c - this.decalage);
			}
		}

		return clair;
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

	public void setChaineChiffre(String chaineChiffre) {
		this.chaineChiffre = chaineChiffre;
	}

	public void setChaineClair(String chaineClair) {
		this.chaineClair = chaineClair;
	}

	public void setDecalage(int decalage) {
		this.decalage = decalage;
	}
}
