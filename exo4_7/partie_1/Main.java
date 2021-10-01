package exo4_7.partie_1;

public class Main {
	static void printf(String mString) {
        System.out.println(mString);
    }
	public static void main(String[] args) {
		printf("\n");
		Document cd = new CD("Off the Wall", "Michael Jackson", 1);
		Document dvd = new DVD("Star Wars épisode 3 : La revange de Sith", "George Lucas", 2005);
		printf(cd.toString());
		printf(dvd.toString());
		
		printf("\n");
		Collection c = new Collection();
		printf(c.toString());
		
		printf("\n");
		c.ajout(cd);
		c.ajout(dvd);
		printf(c.toString());
	}
}
