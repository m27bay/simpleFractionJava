package exo4_7.partie_1;

public abstract class Document {
	private String titre;
	private String nom;

	Document(String titre, String nom) {
		this.titre = titre;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return titre + ", " + nom + ", ";
	}
}
