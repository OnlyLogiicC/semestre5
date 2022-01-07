package fr.ensma.ia.Plateau;

public class PlateauPresentation {
	
	private IPlateauMediateur med ;
	private PlateauModel model ;
	
	public PlateauPresentation() {
		setMed(new PlateauVue(this)) ;
		setModel(new PlateauModel()) ;
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
