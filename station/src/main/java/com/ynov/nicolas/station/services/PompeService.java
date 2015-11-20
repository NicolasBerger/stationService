package com.ynov.nicolas.station.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ynov.nicolas.station.database.Data;
import com.ynov.nicolas.station.entities.Carburant;
import com.ynov.nicolas.station.entities.Cuve;
import com.ynov.nicolas.station.entities.Pompe;

public class PompeService {
	
	private static PompeService pompeService = null;
	private Map<Long, Pompe> pompes = Data.getPompes();
	
	public static PompeService getInstance(){
		if(null == pompeService){
			pompeService = new PompeService();
		}
		return pompeService;
	}
	
	public PompeService() {
		pompes.put(1L, new Pompe(1, 1));
		pompes.put(2L, new Pompe(2, 2));
		pompes.put(3L, new Pompe(3, 3));
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
		return CuveService.getInstance().debiterCarburant(this.getPompe(id), quantite);
	}
}
