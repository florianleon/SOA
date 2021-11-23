package fr.insa.florianleon.soap;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import fr.insa.soap.wsdltojava.NumberConversion;
import fr.insa.soap.wsdltojava.NumberConversionSoapType;


public class ClientOfNC {

	public static void main(String[] args) throws MalformedURLException {
		//adresse du service web
		final String adresse="https://www.dataaccess.com/webservicesserver/numberconversion.wso";
		
		//Création de l'URL
		final URL url = URI.create(adresse).toURL();
		
		//Instanciation de l'image du service
		final NumberConversion service = new NumberConversion(url);
		
		//Creation du proxy (en utilisant le portType) pour l'appel du service
		final NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
		
		BigDecimal BD = new BigDecimal(158.97);
		BigInteger BI = new BigInteger("1999");
		
		//Appel des méthodes via le port
		System.out.println(port.numberToDollars(BD));
		System.out.println(port.numberToWords(BI));

	}

}
