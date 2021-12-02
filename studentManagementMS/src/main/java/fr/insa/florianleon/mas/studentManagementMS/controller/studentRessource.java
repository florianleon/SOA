package fr.insa.florianleon.mas.studentManagementMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.florianleon.mas.studentManagementMS.model.Student;

@RestController
public class studentRessource {
	
	@GetMapping("/students")
	public int studentNumber() {
		return 200;
	}
		
	@GetMapping("/students/{id}")
	public Student infoStrudent(@PathVariable int id ) {
		Student student = new Student(id, "Florian", "Leon");
		return student;
	}

}
