package fr.insa.florianleon.soap;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import fr.insa.soap.wsdltojava.Analyser;
import fr.insa.soap.wsdltojava.AnalyserChaineWS;

public class ClientOfAnalyser {

	public static void main(String[] args) throws MalformedURLException {
		//adresse du service web
		final String adresse="http://localhost:8089/analyzer";
		
		//Création de l'URL
		final URL url = URI.create(adresse).toURL();
		
		//Instanciation de l'image du service
		final Analyser service = new Analyser(url);
		
		//Creation du proxy (en utilisant le portType) pour l'appel du service
		final AnalyserChaineWS port = service.getPort(AnalyserChaineWS.class);
		
		String chaine = "Florian";
		int yearOfBirth = 1999;
		
		//Appel des méthodes via le port
		System.out.println(port.saluer(chaine));
		System.out.println(port.age(yearOfBirth));
		
	}

}
