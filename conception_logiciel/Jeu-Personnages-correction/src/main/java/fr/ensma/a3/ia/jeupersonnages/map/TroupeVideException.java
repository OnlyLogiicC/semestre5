package fr.ensma.a3.ia.jeupersonnages.map;

public class TroupeVideException extends Exception {

	private String monMessage;
	
	public TroupeVideException() {}
	
	public TroupeVideException(final String msg) {
		monMessage = msg;
	}
	
	public final String getMonMessage() {
		return monMessage;
	}
	
	@Override
	public String getMessage() {
		return monMessage + " : " + super.getMessage();
	}
	
	private static final long serialVersionUID = 1L;

}