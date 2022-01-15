package fr.ensma.ia;

import fr.ensma.ia.enjeu.Carte.ICarteObserver;
import fr.ensma.ia.enjeu.Plateau.PlateauPresentation;
import fr.ensma.ia.enjeu.Plateau.PlateauVue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Test extends Application implements ICarteObserver{
		
		private FlowPane root ;
		private PlateauPresentation pres ;
		

	    @Override
	    public void start(Stage stage) {
	    	Integer nbre_cartes = 10 ;
	        pres = new PlateauPresentation(nbre_cartes) ;
	        stage.setTitle("Plateau Memory") ;
	        root = new FlowPane() ;
	        root.getChildren().add((PlateauVue)pres.getMed()) ;
	        Scene scene = new Scene(root) ;
	        stage.setScene(scene);
	        stage.show();
	    }

	    public static void main(String[] args) {
	        launch();
	    }

	}
