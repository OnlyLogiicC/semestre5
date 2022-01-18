package fr.ensma.a3.ia.mymultichat.server.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.ensma.a3.ia.mymultichatgame.api.canal.ChatCanalDesc;
import fr.ensma.a3.ia.mymultichat.server.business.ChatCanalAdmin;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("multichat")
public class MultiChatServices {
	
	@GET
	@Path("all")
	public Response getAllCanal() {
		return Response.ok(ChatCanalAdmin.getCanaux()).build();
	}
	
	@GET
	@Path("{canalId}")
	public Response getCanal(@PathParam("canalId") int canalId) {	
        try {
        	ChatCanalDesc cc = ChatCanalAdmin.getCanal(canalId) ;
    		return Response.ok(cc).build();
        } catch (IndexOutOfBoundsException ex) {
        	return Response.noContent().build();
        }
	}
	
}
