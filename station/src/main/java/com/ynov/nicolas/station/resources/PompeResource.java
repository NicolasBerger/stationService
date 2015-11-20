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
import javax.ws.rs.core.Response;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.ynov.nicolas.station.entities.Pompe;
import com.ynov.nicolas.station.services.PompeService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PompeResource {
	
	private PompeService pompeService = new PompeService();

	@GET
	public List<Pompe> getAllPompes(){
		return pompeService.getAllPompes();
	}

	@Path("/{idPompe}")
	@GET
	public Pompe getPompe(@PathParam("idPompe") Long id){
		return pompeService.getPompe(id);
	}

	@POST
	public Pompe addPompe(Pompe pompe){
		return pompeService.addPompe(pompe);
	}
	
	@PUT
	public Pompe updatePompe(Pompe pompe) {
		return pompeService.updatePompe(pompe);
	}
	
	@Path("/{idPompe}")
	@DELETE
	public Pompe deletePompe(@PathParam("idPompe") Long id){
		return pompeService.deletePompe(id);
	}
	
	@Path("/{idPompe}/debit/{quantite}")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public double debiterCarburant(@PathParam("idPompe") Long id, @PathParam("quantite") double quantite){
		return pompeService.debiterCarburant(id, quantite);
	}
	
}
