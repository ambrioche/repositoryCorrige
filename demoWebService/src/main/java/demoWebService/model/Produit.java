package demoWebService.model;

import javax.xml.bind.annotation.XmlElement;


import org.codehaus.jackson.map.annotate.JsonView;


//Va permettre d'utiliser des annotations qui definissent quelles
//sont les infos de l'objet à remonter
//@XmlRootElement(name = "produit")
//@XmlAccessorType()



public class Produit {
	@JsonView(Marqueur.class)
	private int numero;
	private String nom;
	private Fournisseur fournisseur;

	public Produit() {

	}

	public Produit(int numero, String nom) {
		super();
		this.numero = numero;
		this.nom = nom;
	}
	
	public Produit(int numero, String nom, Fournisseur fournisseur) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.fournisseur= fournisseur;
	}

	@XmlElement(name="id")
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@XmlElement
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	

}
