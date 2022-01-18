package fr.ensma.a3.ia.mymultichat.server.business;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.mymultichatgame.api.canal.ChatCanalDesc;

public class ChatCanalAdmin {
	
	private static List<ChatCanalDesc> canaux = new ArrayList<ChatCanalDesc>() ;
	
	
	public static List<ChatCanalDesc> getCanaux() {
		return canaux;
	}
	
	public void setCanaux(List<ChatCanalDesc> canaux) {
		ChatCanalAdmin.canaux = canaux;
	}
	
	public void createCanal() {
		ChatCanalAdmin.canaux.add(new ChatCanalDesc(canaux.size())) ;
	}
	
	public static ChatCanalDesc getCanal(int id) {
		return ChatCanalAdmin.canaux.get(id) ;
	}
	
	public static void removeCanal(int id) {
		ChatCanalAdmin.canaux.remove(id) ;
	}
	
	
	
}
