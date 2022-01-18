package fr.ensma.a3.ia.mymultichat.api.messages.client;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;

public class ClientMessageDecoder implements Decoder.Text<ClientMessage> {

	private static Gson gson = new Gson();
	
	@Override
	public void init(EndpointConfig config) {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public ClientMessage decode(String mess) throws DecodeException {
		return gson.fromJson(mess, ClientMessage.class);
	}

	@Override
	public boolean willDecode(String mess) {
		// TODO Auto-generated method stub
		return true;
	}

}
