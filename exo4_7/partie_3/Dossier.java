package exo4_7.partie_3;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends Element {

	private List<Element> fils;
	private static final int NBR_MAX_ELEM = 50;
	private static int nbrDossier = 0;

	Dossier() {
		super("dossier" + String.valueOf(nbrDossier));
		fils = new ArrayList<>(NBR_MAX_ELEM);
		nbrDossier++;
	}
	
	Dossier(String nom) {
		super(nom);
		fils = new ArrayList<>(NBR_MAX_ELEM);
		nbrDossier++;
	}

	public List<Element> getfils() {
		return fils;
	}

	void ajoutFils(Element e) {
		fils.add(e);
		e.setPere(this);
		if(e instanceof Fichier) {
			taille += e.taille;

			Dossier courant = this;
			Dossier pere = courant.getPere();
			while(pere != null) {
				pere.setTaille(pere.getTaille() + courant.getTaille());
				courant = pere;
				pere = pere.getPere();
			}
		}
	}

	public void afficher(int nbrEspace, Dossier d) {
		if(!d.getfils().isEmpty()) {
			for(Element e : d.getfils()) {
				if(e instanceof Fichier) {
					Fichier eConvert = (Fichier)e;
					for(int i = 0; i < nbrEspace; ++i) {
						System.out.print("    ");
					}
					System.out.print(eConvert.toString());
					// System.out.print(eConvert.getNom() + "\n");
				}
				else {
					Dossier eConvert = (Dossier)e;
					for(int i = 0; i < nbrEspace; ++i) {
						System.out.print("    ");
					}
					System.out.print(eConvert.toString() + "\n");
					// System.out.print(eConvert.getNom() + "\n");
					afficher(nbrEspace + 1, eConvert);
				}
			}
		}
	}
}
