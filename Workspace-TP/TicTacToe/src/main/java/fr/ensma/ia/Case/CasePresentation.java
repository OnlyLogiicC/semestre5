package fr.ensma.ia.Case;

import java.util.ArrayList;
import java.util.List;

public class CasePresentation {
	
	private ICaseMediateur mediateur ;
	private CaseModel model ;
	
	private List<ICaseObserver> mesAbo ;
	
	public CasePresentation() {
		mediateur = new CaseVue(this) ;
		mesAbo = new ArrayList<ICaseObserver>() ;
		model = new CaseModel() ;
	}

	public ICaseMediateur getMediateur() {
		return mediateur;
	}

	public void setMediateur(ICaseMediateur mediateur) {
		this.mediateur = mediateur;
	}

	public List<ICaseObserver> getMesAbo() {
		return mesAbo;
	}

	public void setMesAbo(List<ICaseObserver> mesAbo) {
		this.mesAbo = mesAbo;
	}
	
	public void addCaseHandler(ICaseObserver obs) {
		mesAbo.add(obs) ;
	}
	
	public void setImage() {
		mediateur.setImage(model.getImage());
		model.setEtat((model.getEtat() + 1)%3);
		
	}
	
	public CaseModel getmodel() {
		return model ;
	}
	
	public void setmodel(CaseModel mdl) {
		this.model = mdl ;
	}

}
