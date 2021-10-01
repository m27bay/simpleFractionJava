package exo3_12.partie_2;

public class Main {
	static void printf(String mString) {
        System.out.println(mString);
    }
	public static void main(String[] args) {
		printf("\n");
		Client c = new Client("Pierre");
		Client c2 = new Client("Paul");
		printf(c.toString());
		printf(c2.toString());
		
		printf("\n");
		Serveur s = new Serveur();
		c.seConnecter(s);
		c2.seConnecter(s);
		
		printf("\n");
		c.seDeconnecter();
		c2.seDeconnecter();
		
		printf("\n");
		c.seDeconnecter();
		
		printf("\n");
		Client c3 = new Client("Jacques");
		c3.seDeconnecter();
		c3.seConnecter(null);

		printf(s.toString());
	}
}