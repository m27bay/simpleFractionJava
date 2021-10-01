package exo4_7.partie_3;

public class Fichier extends Element {
	enum EXTENSION {
		PNG, AVI, TXT, ODT
	}
	
	private EXTENSION ext;

	Fichier(String nom, EXTENSION ext) {
		super(nom);
		this.ext = ext;
	}

	@Override
	public String toString() {
		return super.toString() + "." + ext;
	}
}
