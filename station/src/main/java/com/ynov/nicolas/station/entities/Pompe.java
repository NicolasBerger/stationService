package com.ynov.nicolas.station.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pompe {

	private long id;
	private int numero;

	public Pompe(long id, int numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	public Pompe() {
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
