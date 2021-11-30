package fr.ensma.a3.ia.mvc.textfield;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class textVue extends TextField implements EventHandler<KeyEvent>{
	
	private textMdl model ;
	private textCtrl control ;
	
	
	public textVue(textMdl mdl, textCtrl ctrl) {
		super() ;
		setAlignment(Pos.TOP_CENTER) ;
		addEventFilter(KeyEvent.KEY_TYPED, this);
		addEventFilter(KeyEvent.KEY_PRESSED, this);
		
		model = mdl ;
		control = ctrl ;
	}
	
	
	@Override
	public void handle(KeyEvent event) {
		if (event.getCode() != KeyCode.BACK_SPACE) {
			control.valEntree(event.getCharacter());
		}
		else {
			control.backsapce();
		}
		event.consume();
	}

}
