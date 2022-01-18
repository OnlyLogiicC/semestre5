package fr.ensma.a3.ia.carnetadressesdao;

import fr.ensma.a3.ia.carnetadressesdao.business.Adresse;
import fr.ensma.a3.ia.carnetadressesdao.business.CarnetAdresse;
import fr.ensma.a3.ia.carnetadressesdao.business.Personne;

public class Testcarnet {
	 public static void main( String[] args ){
		 
		 
		 CarnetAdresse carnet = new CarnetAdresse();
		 
		 
		 Adresse adressehich = new Adresse(10, "Claude Debussy", "Rouen", 76000);
		 Personne hichem = new Personne("MEDJADBA", "Hichem", adressehich);
		 
		 carnet.ajouterPers(hichem);
		 carnet.lister();
		 carnet.supprimerPers(hichem);
		 
		 carnet.lister();
		 
		 
		 
		 
		 
	    }

}
