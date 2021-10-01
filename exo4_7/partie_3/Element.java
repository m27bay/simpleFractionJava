package exo4_7.partie_3;

public abstract class Element {
	private String nom;
	private String taille;

	Element(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom + ", " + taille + "octects";
	}
}
