package fr.insa.florianleon.MS.StudentInfoService.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.florianleon.MS.StudentInfoService.model.StudentsInfos;

@RestController
@RequestMapping("/student")
public class StudentInfoResource {
	
	@Value("${server.port}")
	private String serverPort;
	
	@Value("${db.name}")
	private String dbName;
	
	@Value("${db.login}")
	private String dbLogin;
	
	@Value("${db.pwd}")
	private String dbPwd;
	
	@Value("${db.uri}")
	private String dbUri;
	
	
	public String getServerPort() {
		return serverPort;
	}



	public String getDbName() {
		return dbName;
	}



	public String getDbLogin() {
		return dbLogin;
	}



	public String getDbPwd() {
		return dbPwd;
	}



	public String getDbUri() {
		return dbUri;
	}


	@GetMapping("{idStudent}")
	public StudentsInfos getIDStudent(@PathVariable("idStudent") int id) {
		
		//Simulate the database with a list
		List<StudentsInfos> etudInfos = Arrays.asList(
				new StudentsInfos(0, "Godart", "Noemie", "12/12/1992"),
				new StudentsInfos(1, "Perrin", "Ania", "10/02/1993"),
				new StudentsInfos(2, "Azi", "Sana", "22/05/1992"),
				new StudentsInfos(3, "Yala", "Nelia", "12/06/1994")
				
		);
		System.out.println("StudentInfoResource Called!");
		System.out.println("Connection to " + this.getDbName() + " à l'URI : " + this.getDbUri());
		//Get the student that corresponds to the id
		return etudInfos.get(id);
	}

}
