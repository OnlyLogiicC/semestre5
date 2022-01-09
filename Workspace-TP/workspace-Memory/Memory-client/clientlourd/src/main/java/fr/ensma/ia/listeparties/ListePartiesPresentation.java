package fr.ensma.ia.listeparties;

import java.util.ArrayList;
import java.util.List;

public class ListePartiesPresentation {
	
	private IListePartiesMediateur mediateur ;
	private ListePartiesModel model ;
	
	private List<IListePartiesObserver> mesAbos ;
	
	public ListePartiesPresentation() {
		model = new ListePartiesModel() ;
		mediateur = new ListePartiesVue(this, model.getListeParties()) ;
		mesAbos = new ArrayList<IListePartiesObserver>() ;
	}
	
	
	public IListePartiesMediateur getMediateur() {
		return mediateur;
	}

	public void setMediateur(IListePartiesMediateur mediateur) {
		this.mediateur = mediateur;
	}

	public ListePartiesModel getModel() {
		return model;
	}

	public void setModel(ListePartiesModel model) {
		this.model = model;
	}

	public List<IListePartiesObserver> getMesAbos() {
		return mesAbos;
	}

	public void setMesAbos(List<IListePartiesObserver> mesAbos) {
		this.mesAbos = mesAbos;
	}
	
	public void addExistantHandler(IListePartiesObserver obs) {
		mesAbos.add(obs) ;
	}
	
	public void connexionFired() {
		for (IListePartiesObserver obs : this.mesAbos) {
			obs.connexionfired();
		}
	}
	public void HallofFameFired() {
		for (IListePartiesObserver obs : this.mesAbos) {
			obs.HallofFamefired();
		}
	}



	public void connexion() {
		// TODO Auto-generated method stub
		
	}



	public void halloffame() {
		// TODO Auto-generated method stub
		this.HallofFameFired();
	}
	
	

}
