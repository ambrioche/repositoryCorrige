package demoWebService;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import demoWebService.restservice.MessageRestService;
import demoWebService.restservice.ProduitWebService;

public class WebServiceApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public WebServiceApplication() {
		singletons.add(new MessageRestService());
		singletons.add(new ProduitWebService());
	}

	// Singleton est un pattern qui dit qu'on a qu'une seule representation d'un
	// objet
	// Cette méthode est fourni par la classe Application
	// On va mettre dans cette objet une instance de la classe MessageRestService

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
