package fr.insa.florianleon.soa.RestProject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("binome")
public class BinomeRessource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Binome getBinome() {
		Binome binome = new Binome();
		binome.setNom("Leon2");
		binome.setPrenom("Florian2");
		return binome;
	}
}
