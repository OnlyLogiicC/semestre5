package fr.ensma.ia.enjeu.Plateau;

import java.util.ArrayList;
import fr.ensma.ia.enjeu.Carte.CartePresentation;
import fr.ensma.ia.enjeu.Carte.CarteVue;
import fr.ensma.ia.enjeu.Carte.ICarteObserver;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class PlateauVue extends GridPane implements ICarteObserver, IPlateauMediateur, EventHandler<ActionEvent> {
	
	private PlateauPresentation presentation ;
	private ArrayList<CartePresentation> cartespres ;
	private Integer nbrcartes ;
	
	public PlateauVue(PlateauPresentation pres) {
		super() ;
		int j = 0 ;
		int k = 0 ;
		this.setAlignment(Pos.CENTER);
		this.setPresentation(pres) ;
		setNbrcartes(pres.getModel().getNbre_cartes()) ;
		cartespres = new ArrayList<CartePresentation>() ;
		for (int i=0 ; i<nbrcartes ; i++) {
			cartespres.add(new CartePresentation()) ;
			this.add((CarteVue)cartespres.get(i).getMediateur(),j,k) ;
			j += 1 ;
			if ((j)%5 == 0) {
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

	public Integer getNbrcartes() {
		return nbrcartes;
	}

	public void setNbrcartes(Integer nbrcartes) {
		this.nbrcartes = nbrcartes;
	}
}
