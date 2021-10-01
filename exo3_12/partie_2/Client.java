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
		}
		else if(s == sConnectee) {
			System.out.println(this.toString() + " => Déjà connectée au serveur.");
		}
		else {
			System.out.println(this.toString() + " => Connexion au serveur en cours...");
			if(s.demanderConnexion(this)) {
				System.out.println(this.toString() + " => Connectée.");
				sConnectee = s;
			}
			else {
				System.out.println(this.toString() + " => Connexion impossible.");
				sConnectee = null;
			}
		}
	}
	
	void seDeconnecter() {
		if(sConnectee == null) {
			System.out.println(this.toString() + " => Vous n'êtes pas connectée.");
		}
		else if(sConnectee.deconnexion(this)) {
			System.out.println(this.toString() + " => Vous êtes désormais déconnectée.");
		}
		else {
			System.out.println(this.toString() + " => Erreur lors de la déconnexion.");
		}
	}
	
	void envoyer(String message) {
		if(message == null) {
			System.out.println(this.toString() + " => Erreur lors de l'envoie, message nul.");
		}
		else if(sConnectee == null) {
			System.out.println(this.toString() + " => Erreur lors de l'envoie, vous n'êtes connectee à aucun serveur.");
		}
		else {
			System.out.println(this.toString() + " => Message envoyé au serveur.");
			sConnectee.diffuser(message);
		}
	}
	
	void recevoir(String message) {
		if(message == null) {
			System.out.println(this.toString() + " => Erreur lors de l'envoie, message nul.");
		}
		else {
			System.out.println(this.toString() + " => Nouveau message recu : " + message);
		}
	}

	@Override
	public String toString() {
		return "client : " + nom + ", id : " + id;
	}
}
