package fr.ensma.a3.ia.mymultichat.server.business;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.mymultichat.api.canal.ChatCanalDesc;

public class ChatCanalAdmin {

	private static ChatCanalDesc privcanal = new ChatCanalDesc(1, "Canal de chat privé ... ");
	private static ChatCanalDesc profcanal = new ChatCanalDesc(2, "Canal de chat pro ...");
	private static ChatCanalDesc amicanal = new ChatCanalDesc(3,"Canal de chat amis ...");
	
	public static List<ChatCanalDesc> getAllCanal() {
		List<ChatCanalDesc> liste = new ArrayList<ChatCanalDesc>();
		liste.add(privcanal);
		liste.add(profcanal);
		liste.add(amicanal);
		return liste;
	}
	
}
