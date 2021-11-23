package fr.insa.florianleon.soa.RestProject;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Response;

public class ClientRest {

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		Response resp = client.target("http://localhost:8080/RestProject/webapi/comparator/longueur/Toulouse").request().get();
		System.out.println(resp.readEntity(String.class));
	}

}
