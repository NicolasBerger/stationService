package com.ynov.nicolas.station.database;

import java.util.HashMap;
import java.util.Map;

import com.ynov.nicolas.station.entities.Cuve;
import com.ynov.nicolas.station.entities.Pompe;

public class Data {
	
	private static Map<Long,Cuve> cuves = new HashMap<>();
	private static Map<Long,Pompe> pompes = new HashMap<>();

	public static Map<Long, Cuve> getCuves() {
		return cuves;
	}

	public static Map<Long, Pompe> getPompes() {
		return pompes;
	}
}
