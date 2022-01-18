package fr.ensma.a3.ia.mymultichat.api.messages.client;


/**
 * Message envoyé par les clients
 * @author michaelrichard
 */
public class ClientMessage {

	private int canalId;
	private String lePseudo;
	private String leContenu;
	
	public final int getCanalId() {
		return canalId;
	}
	public final void setCanalId(final int cid) {
		canalId = cid;
	}
	
	public final String getLePseudo() {
		return lePseudo;
	}
	public final void setLePseudo(final String pseu) {
		lePseudo = pseu;
	}
	
	public final String getLeContenu() {
		return leContenu;
	}
	public final void setLeContenu(final String m) {
		leContenu = m;
	}
	
}
