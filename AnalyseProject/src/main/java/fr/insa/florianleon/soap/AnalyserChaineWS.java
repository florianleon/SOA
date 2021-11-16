package fr.insa.florianleon.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="Analyser")
public class AnalyserChaineWS {
	@WebMethod(operationName="saluer")
	public String sayHello(@WebParam(name="chain") String chaine) {
		return "Hello " + chaine;
	}
	@WebMethod(operationName="age")
	public int getAge(@WebParam(name="year") int birthYear) {
		return 2021 - birthYear;
	}

}
