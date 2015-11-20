package com.ynov.nicolas.station.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ynov.nicolas.station.database.Data;
import com.ynov.nicolas.station.entities.Carburant;
import com.ynov.nicolas.station.entities.Cuve;
import com.ynov.nicolas.station.entities.Pompe;

public class CuveService {
	
	private Map<Long, Cuve> cuves = Data.getCuves();
	
	public CuveService() {
		cuves.put(1L, new Cuve(1, new Pompe(1, 1), new Carburant(1, 1.95, "SP-95")));
		cuves.put(2L, new Cuve(2, new Pompe(2, 2), new Carburant(2, 1.80, "SP-98")));
		cuves.put(3L, new Cuve(3, new Pompe(3, 2), new Carburant(2, 1.70, "Diesel")));
	}

	public List<Cuve> getAllCuves(){
		return new ArrayList<>(cuves.values());
	}
	
	public Cuve getCuve(Long id){
		return cuves.get(id);
	}
	
	public Cuve addCuve(Cuve cuve){
		cuve.setId(cuves.size() + 1);
		cuves.put(cuve.getId(), cuve);
		return cuve;
	}
	
	public Cuve updateCuve(Cuve cuve){
		if(cuve.getId() > 0){
			cuves.put(cuve.getId(), cuve);
			return cuve;
		}
		return null;
	}
	
	public Cuve deleteCuve(Long id){
		return cuves.remove(id);
	}
}