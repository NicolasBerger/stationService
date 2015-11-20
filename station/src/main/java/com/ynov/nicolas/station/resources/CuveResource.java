package com.ynov.nicolas.station.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ynov.nicolas.station.entities.Cuve;
import com.ynov.nicolas.station.services.CuveService;

@Path("/cuves")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class CuveResource {
	
	private CuveService cuveService = CuveService.getInstance();
	
	@GET
	public List<Cuve> getAllCuves(){
		return cuveService.getAllCuves();
	}

	@Path("/{idCuve}")
	@GET
	public Cuve getCuve(@PathParam("idCuve") Long id){
		return cuveService.getCuve(id);
	}

	@POST
	public Cuve addCuve(Cuve cuve){
		return cuveService.addCuve(cuve);
	}
	
	@PUT
	public Cuve updateCuve(Cuve cuve) {
		return cuveService.updateCuve(cuve);
	}
	
	@Path("/{idCuve}")
	@DELETE
	public Cuve deleteCuve(@PathParam("idCuve") Long id){
		return cuveService.deleteCuve(id);
	}
	
	@Path("/{idCuve}/remplissage/{quantite}")
	@POST
	public Cuve remplirCuve(@PathParam("idCuve") Long id, @PathParam("quantite") double quantite){
		return cuveService.remplirCuve(id, quantite);
	}
}
