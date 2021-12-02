package fr.insa.florianleon.MS.StudentsListService.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fr.insa.florianleon.MS.StudentsListService.model.*;

@RestController
@RequestMapping("/students")
public class StudentListResource {

	
	@GetMapping("ids/{idSpeciality}")
	public StudentIDList getIDStudent(@PathVariable("idSpeciality") String speciality) {
		
		//Simulate the database using an object StudentIDList, which contains a list of integers
		StudentIDList studentsID = new StudentIDList();
		studentsID.saddStudentToList(0);
		studentsID.saddStudentToList(1);
		studentsID.saddStudentToList(2);
		studentsID.saddStudentToList(3);
		
		return studentsID;
	}
	
	@GetMapping("/all/{idSpeciality}")
	public List<Student> getStudents(@PathVariable("idSpeciality") String speciality) {
		
		//Simulate the database using an object StudentIDList, which contains a list of integers
		StudentIDList students = new StudentIDList();
		students.saddStudentToList(0);
		students.saddStudentToList(1);
		students.saddStudentToList(2);
		students.saddStudentToList(3);
		
		//Instanciate RestTemplate for Rest calls
		RestTemplate restTemplate = new RestTemplate();
		int i = 0;
		List<Student> listStudents = new ArrayList<Student>();
		
		while (i < students.getStudentList().size()) {
			StudentsInfos etudInfos = restTemplate.getForObject("http://localhost:8081/student/"+i, StudentsInfos.class);
			Evaluation eval = restTemplate.getForObject("http://localhost:8082/evaluation/"+i, Evaluation.class);
			listStudents.add(new Student(i, etudInfos.getFirstName(), etudInfos.getLastName(), eval.getAverage()));
			i++;
		}
		
		return listStudents;
	}
}
