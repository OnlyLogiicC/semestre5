package fr.ensma.ia.enjeu.Carte;

import java.util.ArrayList;
import java.util.List;

public class CartePresentation {
	
	private ICarteMediateur mediateur ;
	private CarteModel model ;
	
	private List<ICarteObserver> mesAbo ;
	
	public CartePresentation() {
		mediateur = new CarteVue(this) ;
		mesAbo = new ArrayList<ICarteObserver>() ;
		model = new CarteModel() ;
	}

	public ICarteMediateur getMediateur() {
		return mediateur;
	}

	public void setMediateur(ICarteMediateur mediateur) {
		this.mediateur = mediateur;
	}

	public List<ICarteObserver> getMesAbo() {
		return mesAbo;
	}

	public void setMesAbo(List<ICarteObserver> mesAbo) {
		this.mesAbo = mesAbo;
	}
	
	public void addCaseHandler(ICarteObserver obs) {
		mesAbo.add(obs) ;
	}
	
	public void setImage() {
		mediateur.setImage(model.getImage());
		model.setEtat((model.getEtat() + 1)%3);
		
	}
	
	public CarteModel getmodel() {
		return model ;
	}
	
	public void setmodel(CarteModel mdl) {
		this.model = mdl ;
	}

}
