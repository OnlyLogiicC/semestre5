package fr.ensma.a3.ia.mymultichat.client;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Scanner;

import javax.websocket.DeploymentException;
import javax.websocket.Session;
import org.glassfish.tyrus.client.ClientManager;
import com.google.gson.Gson;

import fr.ensma.a3.ia.mymultichat.api.canal.ChatCanalDesc;
import fr.ensma.a3.ia.mymultichat.api.messages.client.ClientMessage;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;

public class MyMultiChatClient {
	
	private static final String SERVER = "ws://localhost:8080/ws/multichat";
	private static final String REST_URI = "http://localhost:8080/services/multichat/";

	private static Gson gson = new Gson();

	public static void main(String[] args) {
		//Appel du service pour recupérer un canal depuis un ID
		Client restclient = ClientBuilder.newClient();
		//ChatCanalDesc rep = restclient.target(REST_URI).path(String.valueOf(1)).request(MediaType.APPLICATION_JSON).get(ChatCanalDesc.class);
		//System.out.println(rep);
		List<ChatCanalDesc> allcanal = restclient.target(REST_URI).path("all").request(MediaType.APPLICATION_JSON).get(new GenericType<List<ChatCanalDesc>>() {}) ;
		System.out.println(allcanal) ;
		
		ClientManager client = ClientManager.createClient();
		String blabla;
		
		//Connexion au serveur :
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu sur MultiChat !!");
		System.out.println("Donne ton pseudo : ");
		String pseudo = scan.nextLine();
		System.out.println("Choisis ton canal : ") ;
		String canal = scan.nextLine() ;
		try {
			Session sess = client.connectToServer(MultiChatClientEndPoint.class, URI.create(SERVER+"/" + canal + ":" + pseudo));
			sess.getUserProperties().put("Pseudo", pseudo);
			sess.getUserProperties().put("canal", canal) ;
			do {
				blabla = scan.nextLine();
				sess.getBasicRemote().sendText(formatMessage(pseudo, blabla));
			} while(!blabla.equalsIgnoreCase("quit"));
			
		} catch (DeploymentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scan.close();
		}	
	}
	
	private static String formatMessage(String pseu, String bla) {
		ClientMessage m = new ClientMessage();
        m.setCanalId(0);
        m.setLePseudo(pseu);
        m.setLeContenu(bla);
        return gson.toJson(m);
    }

}
