package fr.ensma.ia.connexion.nouveau;

import java.util.ArrayList;
import java.util.List;

public class NouveauPresentation {
	
	private INouveauMediateur mediateur ;
	private NouveauModel model ;
	
	private List<INouveauObserver> mesAbos ;
	
	public NouveauPresentation() {
		mediateur = new NouveauVue(this) ;
		mesAbos = new ArrayList<INouveauObserver>() ;
		model = new NouveauModel() ;
	}
	
	

	public void validation() {
		
		if (!(this.mediateur.estvide())) {
			// TODO Appel à la méthode du model
			
		}
		
	}

	public INouveauMediateur getMediateur() {
		return mediateur;
	}

	public void setMediateur(INouveauMediateur mediateur) {
		this.mediateur = mediateur;
	}

	public NouveauModel getModel() {
		return model;
	}

	public void setModel(NouveauModel model) {
		this.model = model;
	}

	public List<INouveauObserver> getMesAbos() {
		return mesAbos;
	}

	public void setMesAbos(List<INouveauObserver> mesAbos) {
		this.mesAbos = mesAbos;
	}
	
	public void addExistantHandler(INouveauObserver obs) {
		mesAbos.add(obs) ;
	}
	
	public void validationFired() {
		for (INouveauObserver obs : this.mesAbos) {
			obs.validationfired();
		}
	}
	
	
	
	

}
