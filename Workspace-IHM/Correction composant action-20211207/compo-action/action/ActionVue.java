package fr.ensma.a3.ia.convertisseur.mvc.action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class ActionVue extends VBox implements EventHandler<ActionEvent>{

	private ActionCtrl ctrlAction;
	private ActionMdl modelAction;
	
	private Button actConvert;
	private ComboBox<String> choixSens;
	
	public ActionVue(ActionCtrl ctrl, ActionMdl mdl) {
		super(20);
		setAlignment(Pos.TOP_CENTER);
		choixSens = new ComboBox<>();	
		choixSens.getItems().addAll("Dollars->Euros","Euros->Dollars");
		choixSens.getSelectionModel().select(0);
		actConvert = new Button("Conversion !!!");
		getChildren().addAll(choixSens,actConvert);
		choixSens.addEventHandler(ActionEvent.ACTION, this);
		actConvert.addEventHandler(ActionEvent.ACTION, this);
		
		ctrlAction = ctrl;
		modelAction = mdl;
	}
	
	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == choixSens ) {
			ctrlAction.choixSens();
		} 
		if (event.getSource() == actConvert ) {
			ctrlAction.action();
		}
	}
	
	public void setComboAcces(boolean enable) {
		choixSens.setDisable(!enable);
	}
	public void setButtonAcces(boolean enable) {
		actConvert.setDisable(!enable);
	}
	

}
