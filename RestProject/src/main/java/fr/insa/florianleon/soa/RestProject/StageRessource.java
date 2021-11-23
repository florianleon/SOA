package fr.insa.florianleon.soa.RestProject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("stage")
public class StageRessource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Stage getStage() {
		Stage stage = new Stage();
		stage.setEvaluation(16);
		stage.setCompetences("SOA, Rest");
		stage.setAnnee(2021);
		return stage;
	}
}
