package fr.insa.florianleon.soap;

import java.net.MalformedURLException;

import javax.xml.ws.Endpoint;

public class AnalyserChaineApplication {

	public static String host = "localhost";
	public static short port = 8089;
	
	public void demarrerservice() {
		String url = "http://" + host + ":" + port + "/";
		Endpoint.publish(url, new AnalyserChaineWS());
	}
	
	public static void main(String [] args) throws MalformedURLException {
		new AnalyserChaineApplication().demarrerservice();
		System.out.println("Service Demarré");
	}
	
	
}
