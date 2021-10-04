package exo4_7.partie_3;

public class Element {
	
	protected String nom;
	protected int taille;
	protected Dossier pere;

	Element(String nom) {
		this.nom = nom;
	}

	public Dossier getPere() {
		return pere;
	}

	public void setPere(Dossier pere) {
		this.pere = pere;
	}

	public String getNom() {
		return nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		return nom + ", " + taille +  " o";
	}
}
