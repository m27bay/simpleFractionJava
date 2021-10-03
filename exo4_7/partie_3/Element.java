package exo4_7.partie_3;

public abstract class Element {
	
	private String nom;
	private String taille;
	private Dossier pere;

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

	public String getTaille() {
		return taille;
	}

	@Override
	public String toString() {
		return taille + "octects, " + nom;
	}
}
