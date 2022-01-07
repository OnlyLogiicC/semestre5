package fr.ensma.ia;

import fr.ensma.ia.Case.CaseModel;
import fr.ensma.ia.Case.CasePresentation;
import fr.ensma.ia.Case.CaseVue;
import fr.ensma.ia.Case.ICaseObserver;
import fr.ensma.ia.Plateau.PlateauModel;
import fr.ensma.ia.Plateau.PlateauPresentation;
import fr.ensma.ia.Plateau.PlateauVue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application implements ICaseObserver {
	
	private FlowPane root ;
	private PlateauPresentation pres ;
	

    @Override
    public void start(Stage stage) {
        pres = new PlateauPresentation() ;
        stage.setTitle("Bouton XO") ;
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