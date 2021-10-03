package exo4_7.partie_3;

import java.util.Random;

public class Fichier extends Element {
	enum EXTENSION {
		NONE, PNG, AVI, TXT, ODT
	}
	
	private EXTENSION ext;
	private static int nbrFichier = 0;

	Fichier() {
		super("fichier" + String.valueOf(nbrFichier));
		this.ext = EXTENSION.NONE;
		Random r = new Random();
		taille = r.nextInt(400) + 100;
		nbrFichier++;
	}

	Fichier(String nom, EXTENSION ext) {
		super(nom);
		this.ext = ext;
		Random r = new Random();
		taille = r.nextInt(400) + 100;
		nbrFichier++;
	}

	@Override
	public String toString() {
		return super.toString() + ", (." + ext + ")\n";
	}
}
