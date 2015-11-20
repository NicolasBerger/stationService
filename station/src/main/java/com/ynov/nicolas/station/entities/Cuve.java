package com.ynov.nicolas.station.entities;

public class Cuve {
	
	private final int capaciteMax = 1000;
	private final int seuilAlerte = 200;
	
	private long id;
	private Pompe pompe;
	private Carburant carburant;
	
	public Cuve(long id, Pompe pompe, Carburant carburant) {
		super();
		this.id = id;
		this.pompe = pompe;
		this.carburant = carburant;
	}

	public Cuve() {
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Pompe getPompe() {
		return pompe;
	}
	public void setPompe(Pompe pompe) {
		this.pompe = pompe;
	}
	public Carburant getCarburant() {
		return carburant;
	}
	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}
	public int getCapaciteMax() {
		return capaciteMax;
	}
	public int getSeuilAlerte() {
		return seuilAlerte;
	}

}
