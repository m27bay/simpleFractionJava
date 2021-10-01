package exo3_12.partie_2;

public class Client {
	private String nom;
	private int id;

	private Serveur sConnectee;
	
	private static int nbrInstance = 0;

	Client() {
		nbrInstance++;
		nom = "null";
		id = -1;
	}

	Client(String _nom) {
		nbrInstance++;
		nom = _nom;
		id = nbrInstance;
	}

	void seConnecter(Serveur s) {
		if(s == null) {
			System.out.println(this.toString() + " => Aucun serveur à cette adresse.");
			return;
		}
		if(s == sConnectee) {
			System.out.println(this.toString() + " => Déjà connectée au serveur.");
			return;
		}
		System.out.println(this.toString() + " => Connexion au serveur en cours...");
		if(s.demanderConnexion(this)) {
			System.out.println(this.toString() + " => Connectée.");
			sConnectee = s;
			return;
		}

		System.out.println(this.toString() + " => Connexion impossible.");
		sConnectee = null;
	}
	
	void seDeconnecter() {
		if(sConnectee == null) {
			System.out.println(this.toString() + " => Vous n'êtes pas connectée.");
			return;
		}
		if(sConnectee.deconnexion(this)) {
			System.out.println(this.toString() + " => Vous êtes désormais déconnectée.");
			return;
		}

		System.out.println(this.toString() + " => Erreur lors de la déconnexion.");
		return;
	}

	void envoyer(String message) {
		if(message == null || sConnectee == null) {
			return;
		}
		
		sConnectee.diffuser(message);
	}

	void recevoir(String message) {
		System.out.println(message);
	}

	@Override
	public String toString() {
		return "client : " + nom + ", id : " + id;
	}
}
