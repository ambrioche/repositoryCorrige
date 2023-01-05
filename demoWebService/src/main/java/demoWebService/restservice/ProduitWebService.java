package demoWebService.restservice;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//import org.apache.http.HttpStatus;

import org.codehaus.jackson.map.annotate.JsonView;

import demoWebService.model.Fournisseur;
import demoWebService.model.Marqueur;
import demoWebService.model.Produit;

@Path("/produit")
public class ProduitWebService {
	@JsonView(Marqueur.class)
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
//	public Response getProduit() {
//		return Response.status(HttpStatus.SC_OK).entity(new Produit(1, "monProduit")).build();
//
//	}
	
	public Produit getProduit() {
		Fournisseur f = new Fournisseur("lll");
		Produit produit = new Produit(1, "mmm", f);
		List<Produit> produits = Arrays.asList(produit);
		f.setProduits(produits);
		return produit;

	}
	
	@GET
	@Path("/fournisseurAvecProduit")
	@Produces(MediaType.APPLICATION_JSON)
	public Fournisseur getFournisseur() {
		Fournisseur f = new Fournisseur("frs2");
		Produit produit = new Produit (1,"produit n",f);
		List<Produit>produits=Arrays.asList(produit);
		f.setProduits(produits);
		return f;
	}
}
