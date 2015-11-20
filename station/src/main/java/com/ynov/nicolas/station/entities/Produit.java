package com.ynov.nicolas.station.entities;

public class Produit {
	
	private long id;
	private String name;
	private double prix;

	public Produit(long id, String name, double prix) {
		super();
		this.id = id;
		this.name = name;
		this.prix = prix;
	}

	public Produit() {
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
