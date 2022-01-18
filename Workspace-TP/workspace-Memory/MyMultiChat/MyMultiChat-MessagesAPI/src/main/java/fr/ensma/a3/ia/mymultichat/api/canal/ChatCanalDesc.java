package fr.ensma.a3.ia.mymultichat.api.canal;

public class ChatCanalDesc {

	private int canalId;
	private String canalName;

	public ChatCanalDesc() {}
	
	public ChatCanalDesc(final int cid, final String name) {
		canalId = cid;
		canalName = name;
	}
	
	
	public final int getCanalId() {
		return canalId;
	}
	public final void setCanalId(final int cid) {
		canalId = cid;
	}
	
	public final String getcanalName() {
		return canalName;
	}
	public final void setCanalName(final String name) {
		canalName = name;
	}
	
	@Override
	public String toString() {
		return canalId + " : -> " + canalName;
	}	
}
