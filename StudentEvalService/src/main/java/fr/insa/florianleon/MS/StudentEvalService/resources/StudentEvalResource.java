package fr.insa.florianleon.MS.StudentEvalService.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.florianleon.MS.StudentEvalService.model.Evaluation;


@RestController
@RequestMapping("/evaluation")
public class StudentEvalResource {

	@GetMapping("{idStudent}")
	public Evaluation getIDStudent(@PathVariable("idStudent") int id) {
		
		//Simulate the database with a list
		List<Evaluation> etudInfos = Arrays.asList(
				new Evaluation(0, 13F),
				new Evaluation(1, 10.65F),
				new Evaluation(2, 18F),
				new Evaluation(3, 18F)
				
		);
		//Get the student that corresponds to the id
		return etudInfos.get(id);
	}
	
}
