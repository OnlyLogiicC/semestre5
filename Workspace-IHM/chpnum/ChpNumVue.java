package fr.ensma.a3.ia.convertisseur.mvc.chpnum;

import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ChpNumVue extends TextField implements EventHandler<KeyEvent>{

	private ChpNumMdl modelChpNum;
	private ChpNumCtrl controleurChpNum;
	
	public ChpNumVue(ChpNumCtrl ctrl, ChpNumMdl mdl) {
		super();
		controleurChpNum = ctrl;
		modelChpNum = mdl;
		addEventFilter(KeyEvent.KEY_TYPED, this);
		addEventFilter(KeyEvent.KEY_PRESSED, this);
	}

	public void update() {
		setText(modelChpNum.getValeur());
		positionCaret(getText().length());
	}
	
	public void setChpEditable(final boolean edit) {
		setEditable(edit);
	}
	
	public void setChpDisable(final boolean enable) {
		setDisable(enable);
	}

	@Override
	public void handle(KeyEvent event) {
		if (event.getCode() != KeyCode.BACK_SPACE) {
			controleurChpNum.valEntree(event.getCharacter());
			
		} else {
			controleurChpNum.backspace();
		}
		event.consume();	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
