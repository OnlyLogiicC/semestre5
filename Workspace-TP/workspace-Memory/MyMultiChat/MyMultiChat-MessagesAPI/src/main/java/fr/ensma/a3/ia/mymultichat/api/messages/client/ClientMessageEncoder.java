package fr.ensma.a3.ia.mymultichat.api.messages.client;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;

public class ClientMessageEncoder implements Encoder.Text<ClientMessage>{

	private static Gson gson = new Gson();
	
	@Override
	public void init(EndpointConfig config) {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * Création d'un objet Json pour l'envoie
	 */
	@Override
	public String encode(ClientMessage mess) throws EncodeException {
		return gson.toJson(mess);		
	}

}
