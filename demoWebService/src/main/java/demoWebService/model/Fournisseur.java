package demoWebService.model;

import java.util.List;

public class Fournisseur {

	private String nom;

	public Fournisseur(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setProduits(List<Produit> produits) {
		this.setProduits(produits);
		
	}

	

	
}
