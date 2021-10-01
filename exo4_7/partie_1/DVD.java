package exo4_7.partie_1;

public class DVD extends Document {
	private int dateSortie;

	DVD(String titre, String nomArtiste, int dateSortie) {
		super(titre, nomArtiste);
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return super.toString() + dateSortie;
	}
}
