package exo4_7.partie_1;

public class CD extends Document {
	private int nbrTitre;

	CD(String titre, String nomArtiste, int nbrTitre) {
		super(titre, nomArtiste);
		this.nbrTitre = nbrTitre;
	}

	@Override
	public String toString() {
		return super.toString() + nbrTitre;
	}
}
