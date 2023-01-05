package demoWebService.restservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;

//definition URL du service
@Path("/message")
public class MessageRestService {

	// Pour appeller la méthode il faut rajouter 2 trucs:
	// Cette annotation explique quel type de requete
	@GET
	@Path("/hello") // Ce 2ème path spécifie qu'on arrive sur cette méthode
	public Response helloMessage() {
		// Response -> la reponse qui est envoyéee
		// cette réponse doit avoir un status http
		// Cette réponse peut éventuellement avoir un contenu (ce contenu est un object)
		return Response.status(HttpStatus.SC_OK).entity("hello worl").build();

	}

	@GET
	@Path("/bye")
	public Response goodbyeMessage() {
		return Response.status(HttpStatus.SC_OK).entity("goodbye").build();
	}

}
