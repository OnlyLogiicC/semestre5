package fr.ensma.ia.Plateau;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.ia.Case.CaseModel;
import fr.ensma.ia.Case.CasePresentation;
import fr.ensma.ia.Case.CaseVue;
import fr.ensma.ia.Case.ICaseObserver;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class PlateauVue extends GridPane implements ICaseObserver, IPlateauMediateur, EventHandler<ActionEvent> {
	
	private PlateauPresentation presentation ;
	private ArrayList<CasePresentation> casespres ;
	
	public PlateauVue(PlateauPresentation pres) {
		super() ;
		int j = 0 ;
		int k = 0 ;
		this.setAlignment(Pos.CENTER);
		this.setPresentation(pres) ;
		casespres = new ArrayList<CasePresentation>() ;
		for (int i=0 ; i<9 ; i++) {
			casespres.add(new CasePresentation()) ;
			this.add((CaseVue)casespres.get(i).getMediateur(),k,j) ;
			j += 1 ;
			if ((j)%3 == 0) {
				k += 1 ;
				j = 0 ;
			}
		}
		
		
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
		
	}

	public PlateauPresentation getPresentation() {
		return presentation;
	}

	public void setPresentation(PlateauPresentation presentation) {
		this.presentation = presentation;
	}
}
