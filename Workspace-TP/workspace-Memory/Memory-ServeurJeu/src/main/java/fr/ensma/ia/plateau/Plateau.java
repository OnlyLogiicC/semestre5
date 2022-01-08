package fr.ensma.ia.plateau;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.ia.elementsjeu.cartes.ICarte;

public class Plateau {
	
	private String id ;
	private Integer taille ;
	private Integer NbPaires ;
	private Integer nbcartesmyst ;
	private List<ICarte> Cartes ;
	
	public Plateau(String id, Integer taille, Integer NbPaires, Integer nb) {
		
		this.id = id ;
		this.taille = taille ;
		this.NbPaires = NbPaires ;
		this.nbcartesmyst = nb ;
		this.Cartes = generateListCartes() ;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		this.taille = taille;
	}

	public Integer getNbPaires() {
		return NbPaires;
	}

	public void setNbPaires(Integer nbPaires) {
		NbPaires = nbPaires;
	}

	public Integer getNbcartesmyst() {
		return nbcartesmyst;
	}

	public void setNbcartesmyst(Integer nbcartesmyst) {
		this.nbcartesmyst = nbcartesmyst;
	}

	public List<ICarte> getCartes() {
		return Cartes;
	}

	public void setCartes(List<ICarte> cartes) {
		Cartes = cartes;
	}
	
	private List<ICarte> generateListCartes() {
		
		List<ICarte> L = new ArrayList<ICarte>() ;
		
		// Instancier les cartes mystères
		for (int i=0 ; i<this.nbcartesmyst ; i++) {
		}
	
		//Instancier les cartes classiques en 1 exemplaire
		for (int i=0 ; i<this.NbPaires ; i++) {
			
		}
		
		//Instancier les cartes classiques en dublicat
		for (int i=0 ; i<this.taille-this.NbPaires ; i++) {
			//copier les cartes déjà instancer et faire modulo NbPaires
		}
				
		return null;
		
	}

}
