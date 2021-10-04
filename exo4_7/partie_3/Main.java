package exo4_7.partie_3;

import exo4_7.partie_3.Fichier.EXTENSION;

public class Main {
	public static void main(String[] args) {
		System.out.println("\n");
		GestionnaireDeFichier gestion = new GestionnaireDeFichier();

		Dossier Image = new Dossier("Image");
		gestion.ajout(Image);

		Dossier Document = new Dossier("Document");
		gestion.ajout(Document);

		gestion.avant(Image);
		Fichier image1 = new Fichier("image1", EXTENSION.PNG);
		gestion.ajout(image1);
		
		gestion.afficherRacine();
		gestion.afficherCourant();
		
		gestion.arriere();
		// gestion.afficherRacine();
		
		gestion.avant(Document);
		Fichier document1 = new Fichier("document1", EXTENSION.ODT);
		Fichier document2 = new Fichier("document2", EXTENSION.TXT);
		gestion.ajout(document1);
		gestion.ajout(document2);
		gestion.afficherRacine();

		System.out.println(gestion.pwd() + "\n");
		gestion.arriere();
		gestion.avant(Image);
		Fichier defaut = new Fichier();
		gestion.ajout(defaut);
		gestion.arriere();
		
		Fichier defaut2 = new Fichier();
		gestion.ajout(Document, defaut2);
		// System.out.println(gestion.pwd() + "\n");

		gestion.afficherRacine();
	}
}
