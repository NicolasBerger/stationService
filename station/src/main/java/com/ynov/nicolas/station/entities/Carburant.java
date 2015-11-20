package com.ynov.nicolas.station.entities;

public class Carburant extends Produit {
	
	public Carburant(long id, double prix, String type) {
		super(id, type, prix);
	}

	public Carburant() {
		super();
	}

}
