package exo4_7.partie_1;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	private List<Document> listeDocument;
	private static final int NBR_MAX_DOC = 50;

	Collection() {
		listeDocument = new ArrayList<Document>(NBR_MAX_DOC);
	}

	void ajout(Document d) {
		if(d == null) {
			System.out.println("Erreur ajout : document vide.");
		}
		else {
			listeDocument.add(d);
		}
	}
	
	void suppression(Document d) {
		if(d == null) {
			System.out.println("Erreur ajout : document vide.");
		}
		else if(listeDocument.isEmpty()) {
			System.out.println("Erreur suppression : liste vide.");
		}
		else {
			listeDocument.add(d);
		}
	}

	@Override
	public String toString() {
		if(listeDocument.isEmpty()) {
			return "Collection vide";
		}
		else {
			String chaine = "";
			for(Document d : listeDocument) {
				chaine += d.toString() + "\n";
			}
			return chaine;
		}
	}
}
