package com.ynov.nicolas.station.database;

import java.util.HashMap;
import java.util.Map;

import com.ynov.nicolas.station.entities.Cuve;

public class Data {
	
	private static Map<Long,Cuve> cuves = new HashMap<>();

	public static Map<Long, Cuve> getCuves() {
		return cuves;
	}
}
