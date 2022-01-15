package fr.ensma.ia.enjeu.Plateau;

public class PlateauPresentation {
	
	private IPlateauMediateur med ;
	private PlateauModel model ;
	
	public PlateauPresentation(Integer nbre_cartes) {
		model = new PlateauModel(nbre_cartes) ;
		med = new PlateauVue(this) ;
	}

	public IPlateauMediateur getMed() {
		return med;
	}

	public void setMed(IPlateauMediateur med) {
		this.med = med;
	}

	public PlateauModel getModel() {
		return model;
	}

	public void setModel(PlateauModel model) {
		this.model = model;
	}
	
	

}
