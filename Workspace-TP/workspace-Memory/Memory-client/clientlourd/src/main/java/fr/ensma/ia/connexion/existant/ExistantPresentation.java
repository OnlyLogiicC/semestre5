package fr.ensma.ia.connexion.existant;

import java.util.ArrayList;
import java.util.List;

public class ExistantPresentation {
	
	private IExistantMediateur mediateur ;
	private ExistantModel model ;
	
	private List<IExistantObserver> mesAbos ;
	
	public ExistantPresentation() {
		mediateur = new ExistantVue(this) ;
		mesAbos = new ArrayList<IExistantObserver>() ;
		model = new ExistantModel() ;
	}
	
	

	public void validation() {
		
		if (!(this.mediateur.estvide())) {
			// TODO Appel à la méthode du model
			if (this.model.isPresent()) {
				this.validationFired();
			}else {
				this.nouveauUtilisateurFired();
			}
		}
		
	}

	public IExistantMediateur getMediateur() {
		return mediateur;
	}

	public void setMediateur(IExistantMediateur mediateur) {
		this.mediateur = mediateur;
	}

	public ExistantModel getModel() {
		return model;
	}

	public void setModel(ExistantModel model) {
		this.model = model;
	}

	public List<IExistantObserver> getMesAbos() {
		return mesAbos;
	}

	public void setMesAbos(List<IExistantObserver> mesAbos) {
		this.mesAbos = mesAbos;
	}
	
	public void addExistantHandler(IExistantObserver obs) {
		mesAbos.add(obs) ;
	}
	
	public void validationFired() {
		for (IExistantObserver obs : this.mesAbos) {
			obs.validationfired();
		}
	}
	public void nouveauUtilisateurFired() {
		for (IExistantObserver obs : this.mesAbos) {
			obs.nouveauUtilisateurfired();
		}
	}
	
	

}
