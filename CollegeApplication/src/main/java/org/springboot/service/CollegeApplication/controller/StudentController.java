package org.springboot.service.CollegeApplication.controller;

import java.util.List;

import org.springboot.service.CollegeApplication.entity.StudentEntity;
import org.springboot.service.CollegeApplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Students")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/")
	public List<StudentEntity> getAllStudent() {

		//Iterable<StudentEntity> allStudent =
			return	(List<StudentEntity>) studentRepository.findAll();
//	return	(List<StudentEntity>) (allStudent != null ? allStudent :new ArrayList<StudentEntity>());
		//return
				//(List<StudentEntity>) allStudent;
	}

	@GetMapping("/Student/{id}")
	public StudentEntity findById(@PathVariable (value ="id") Long id) {
		return studentRepository.findOne(id);
	}

	@PostMapping ("/Student")
	public StudentEntity addStudent(@RequestBody StudentEntity entity) {

		return studentRepository.save(entity);
	}

	@PutMapping ("/Student/{id}")
	public StudentEntity update(@PathVariable (value ="id") Long id , @RequestBody StudentEntity entity) {

		StudentEntity studnet = studentRepository.findOne(id);

		studnet.setStudentAge(entity.getStudentAge());
		studnet.setStudentName(entity.getStudentName());
		StudentEntity updateStudent = studentRepository.save(studnet);
		return updateStudent;


	}

	@DeleteMapping("/Student/{id}")
	public void DeleteStudent(@PathVariable (value = "id") Long id) {

		 studentRepository.delete(id);
	}


}
