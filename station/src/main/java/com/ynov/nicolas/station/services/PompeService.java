package com.ynov.nicolas.station.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

import com.ynov.nicolas.station.database.Data;
import com.ynov.nicolas.station.entities.Pompe;

@Singleton
public class PompeService {
	
	private Map<Long, Pompe> pompes = Data.getPompes();
	
	public PompeService() {
		pompes.put(10L, new Pompe(10, 10));
		pompes.put(20L, new Pompe(20, 20));
		pompes.put(30L, new Pompe(30, 30));
	}

	public List<Pompe> getAllPompes(){
		return new ArrayList<>(pompes.values());
	}
	
	public Pompe getPompe(Long id){
		return pompes.get(id);
	}
	
	public Pompe addPompe(Pompe pompe){
		pompe.setId(pompes.size() + 1);
		pompes.put(pompe.getId(), pompe);
		return pompe;
	}
	
	public Pompe updatePompe(Pompe pompe){
		if(pompe.getId() > 0){
			pompes.put(pompe.getId(), pompe);
			return pompe;
		}
		return null;
	}
	
	public Pompe deletePompe(Long id){
		return pompes.remove(id);
	}
	
	public double debiterCarburant(Long id, double quantite){
		return new CuveService().debiterCarburant(this.getPompe(id), quantite);
	}
}
