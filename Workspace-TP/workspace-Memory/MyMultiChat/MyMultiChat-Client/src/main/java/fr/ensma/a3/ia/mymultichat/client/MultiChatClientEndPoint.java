package fr.ensma.a3.ia.mymultichat.client;


import javax.websocket.ClientEndpoint;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import fr.ensma.a3.ia.mymultichat.api.messages.client.ClientMessage;
import fr.ensma.a3.ia.mymultichat.api.messages.client.ClientMessageDecoder;
import fr.ensma.a3.ia.mymultichat.api.messages.client.ClientMessageEncoder;

@ClientEndpoint(encoders = ClientMessageEncoder.class, decoders = ClientMessageDecoder.class)
public class MultiChatClientEndPoint {

	@OnOpen
	public void onOpen(Session sess) {
		System.out.println("Connexion établie !!");
	}
	
	@OnMessage
	public void onMessage(ClientMessage mess) {
		System.out.println(mess.getLePseudo() + " dit : " + mess.getLeContenu());
	}
	
	@OnError
    public void processError(Throwable t) {
        t.printStackTrace();
    }
	
}
