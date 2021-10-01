package exo3_12.partie_2;

public class Serveur {
	private Client[] listeClient;
	private int nbrClient;
	private static final int NBR_MAX_CLIENT = 50;

	Serveur() {
		listeClient = new Client[NBR_MAX_CLIENT];
		nbrClient = 0;
	}

	int estConnectee(Client c) {
		if(c == null) {
			System.out.println("Serveur : Aucun client à cette adresse.");
			return -1;
		}

		for(int i = 0; i < listeClient.length; ++i) {
			if(c == listeClient[i]) {
				return i;
			}
		}

		return -1;
	}

	boolean demanderConnexion(Client c) {
		if(c == null) {
			System.out.println("Serveur : Aucun client à cette adresse.");
			return false;
		}
		else if(nbrClient + 1 < NBR_MAX_CLIENT) {
			listeClient[nbrClient] = c;
			nbrClient += 1;
			return true;
		}

		return false;
	}

	boolean deconnexion(Client c) {
		if(c == null) {
			System.out.println("Serveur : Aucun client à cette adresse.");
			return false;
		}
		else if(nbrClient == 0) {
			System.out.println("Serveur : Aucun client sur ce serveur.");
			return false;
		}
		int posClient = estConnectee(c);
		if(posClient != -1) {
			if(posClient == nbrClient - 1) {
				listeClient[nbrClient - 1] = null;
			}
			else {
				listeClient[posClient] = listeClient[nbrClient - 1];
				listeClient[nbrClient - 1] = null;
			}
			nbrClient -= 1;
			
			return true;
		}
		
		return false;
	}
	
	void diffuser(String message) {
		if(message == null) {
			System.out.println("Serveur : Le message ne peut être diffusé,le message est nul.");
		}
		else if(nbrClient == 1) {
			System.out.println("Serveur : Le message ne peut être diffusé, aucun client sur ce serveur.");
		}
		else {
			for(Client ci : listeClient) {
				if(ci == null) {
					continue;
				}
				else {
					ci.recevoir(message);
				}
			}
		}
	}

	@Override
	public String toString() {
		String chaine = "Etat du serveur : \n";
		if(nbrClient == 0) {
			return chaine + "Serveur vide... *bruit de corbeaux*";
		}
		else {
			for(Client c : listeClient) {
				if(c == null) {
					continue;
				}
				else {
					chaine += c.toString() + "\n";
				}
			}
			return chaine;
		}
	}
}
