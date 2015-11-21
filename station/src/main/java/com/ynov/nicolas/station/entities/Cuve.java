package com.ynov.nicolas.station.entities;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cuve {
	
	private final double capaciteMax = 1000;
	private final double seuilAlerte = 200;
	
	private long id;
	private Pompe pompe;
	private Carburant carburant;
	private double capaciteActuelle;
	
	public Cuve(long id, Pompe pompe, Carburant carburant) {
		this.id = id;
		this.pompe = pompe;
		this.carburant = carburant;
		this.capaciteActuelle = 0;
	}

	public Cuve() {
	}

	@GET
	public Cuve getThis(){
		return this;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Path("/pompes/{idPompe}")
	public Pompe getPompe(@PathParam("idPompe") Long idPompe) {
		return pompe.getId()==idPompe?pompe:null;
	}
	
	@Path("/pompes")
	@GET
	public List<Pompe> getAllPompes() {
		List<Pompe> liste = new ArrayList<>();
		liste.add(pompe);
		return liste;
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
	public double getCapaciteMax() {
		return capaciteMax;
	}
	public double getSeuilAlerte() {
		return seuilAlerte;
	}

	public void setCapaciteMax(double capaciteMax) {
	}

	public void setSeuilAlerte(double seuilAlerte) {
	}

	public double getCapaciteActuelle() {
		return capaciteActuelle;
	}

	public void setCapaciteActuelle(double capaciteActuelle) {
		this.capaciteActuelle = capaciteActuelle;
	}

}
