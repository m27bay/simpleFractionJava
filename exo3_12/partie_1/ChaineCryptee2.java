package exo3_12.partie_1;

public class ChaineCryptee2 {
	String chaine;
	int decalage;

	ChaineCryptee2() {
		this.chaine = "";
		this.decalage = 0;
	}
	
	ChaineCryptee2(String chaine, int decalage) {
		this.chaine = chaine;
		this.decalage = decalage;
	}

	String chiffrer() {
		String chiffre = "";
		if(this.chaine == "") {
			return chiffre;
		}
		for(int i = 0; i < this.chaine.length(); ++i) {
			char c = this.chaine.charAt(i);
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
		for(int i = 0; i < this.chaine.length(); ++i) {
			char c = this.chaine.charAt(i);
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
		return "chaine : " + this.chaine +
			", decalage de : " + this.decalage;
	}

	public String getChaine() {
		return chaine;
	}

	public int getDecalage() {
		return decalage;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}

	public void setDecalage(int decalage) {
		this.decalage = decalage;
	}
}