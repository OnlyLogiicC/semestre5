package fr.ensma.a3.ia.mymultichatgame.api.canal;

public class ChatCanalDesc {

	private int canalId;

	public ChatCanalDesc() {}
	
	public ChatCanalDesc(final int cid) {
		canalId = cid;
	}
	
	
	public final int getCanalId() {
		return canalId;
	}
	public final void setCanalId(final int cid) {
		canalId = cid;
	}
	
	
	@Override
	public String toString() {
		return String.valueOf(canalId) ;
	}	
}
