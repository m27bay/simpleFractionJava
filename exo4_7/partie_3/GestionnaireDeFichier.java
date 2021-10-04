package exo4_7.partie_3;

public class GestionnaireDeFichier {
	private Dossier racine;
	private Dossier courant;

	GestionnaireDeFichier() {
		racine = new Dossier("DATA");
		racine.setPere(null);
		courant = racine;
	}

	void avant(Dossier d) {
		for(Element suivant : courant.getfils()) {
			if(suivant instanceof Dossier) {
				Dossier dSuivant = (Dossier)suivant;
				if(dSuivant == d) {
					courant = dSuivant;
				}
			}
		}
	}

	void arriere() {
		courant = courant.getPere();
	}
	
	void ajout(Element e) {
		courant.ajoutFils(e);
	}

	void ajout(Dossier d, Element e) {
		if(d == courant) {
			ajout(e);
		}
		else {
			ajout(racine, d, e);
		}
	}

	private void ajout(Dossier courant, Dossier objectif, Element e) {
		if(courant == objectif) {
			courant.ajoutFils(e);
		}
		else {
			for(Element cible : courant.getfils()) {
				if(cible instanceof Dossier) {
					ajout((Dossier)cible, objectif, e);
				}
			}
			
		}
	}

	public String pwd() {
		Dossier tmp = courant;
		String pwdChaine = "";
		pwdChaine += racine.getNom();
		while(tmp != null && tmp != racine) {
			pwdChaine += ("\\" + tmp.getNom());
			tmp = tmp.getPere();			
		}
		return pwdChaine;
	}

	public Dossier getRacine() {
		return racine;
	}

	public Dossier getCourant() {
		return courant;
	}

	public void afficherRacine() {
		System.out.print(racine.getNom() + "\n");
		racine.afficher(1, racine);
		System.out.print("\n");
	}

	public void afficherCourant() {
		System.out.print(courant.getNom() + "\n");
		courant.afficher(1, courant);
		System.out.print("\n");
	}
}
