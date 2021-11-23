package fr.insa.florianleon.soa.RestProject;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("etudiant")
public class EtudiantRessource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant getEtudiant(@Context UriInfo uriInfo) {
		Etudiant etudiant = new Etudiant();
		etudiant.setNom("Leon");
		etudiant.setPrenom("Florian");
		etudiant.setId(1);
		etudiant.addLink(getURIforSelf(uriInfo, etudiant), "self", "GET");
		etudiant.addLink(getURIforStage(uriInfo), "Stage", "GET");
		etudiant.addLink(getURIforBinome(uriInfo, etudiant), "Binome", "GET");
		return etudiant;
	}
	
	private String getURIforBinome(UriInfo uriInfo, Etudiant etudiant) {
		String url = uriInfo.getBaseUriBuilder()
				.path(BinomeRessource.class)
				.build()
				.toString();
				return url;
	}

	private String getURIforStage(UriInfo uriInfo) {
		String url = uriInfo.getBaseUriBuilder()
				.path(StageRessource.class)
				.build()
				.toString();
		return url;
	}

	private String getURIforSelf(UriInfo uriInfo, Etudiant etudiant) {
		String url = uriInfo.getBaseUriBuilder()
				.path(EtudiantRessource.class)
				.path(Long.toString(etudiant.getId()))
				.build()
				.toString();
				return url;
	}

	@GET
	@Path("/{idEtudiant}")
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant getEtudiant(@PathParam("idEtudiant") int id) {
		Etudiant etudiant = new Etudiant();
		etudiant.setNom("Leon2");
		etudiant.setPrenom("Florian2");
		etudiant.setId(2);
		return etudiant;
	}
	
	@POST
	@Path("/{idEtudiant}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addEtudiant(Etudiant newEtud) {
		System.out.println("Ajout de l'étudiant " + newEtud.getNom() + " " + newEtud.getPrenom() + " réussi !");
		System.out.println("Son binome est " + newEtud.getBinome().getNom() + " " + newEtud.getBinome().getPrenom());
		
	}
}
