package org.springboot.service.CollegeApplication.controller;

import java.util.List;

import org.springboot.service.CollegeApplication.entity.CollegeEntity;
import org.springboot.service.CollegeApplication.repository.CollaegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Irfan
 *
 *
 */
@RestController
@RequestMapping("/collages")
public class CollegeController {

	@Autowired
	CollaegeRepository collaegeRepository;

	@GetMapping("/")
	public List<CollegeEntity> allCollege(){
		return (List<CollegeEntity>) collaegeRepository.findAll();
	}

	@GetMapping("/collage/{id}")
	public CollegeEntity getById(@PathVariable (value = "id") Long id) {
		return collaegeRepository.findOne(id);
	}
	@DeleteMapping("/collage/{id}")
	public void deleteById(@PathVariable (value = "id") Long id) {
		//return collaegeRepository.findOne(id);
		collaegeRepository.delete(id);

	}
	@PostMapping("/collage")
	public CollegeEntity createCollege(@RequestBody CollegeEntity entity) {
		return collaegeRepository.save(entity);
	}
	@PutMapping ("/collage/{id}")
	public CollegeEntity updeateCollege(@PathVariable (value = "id") Long id ,@RequestBody CollegeEntity entity) {


	CollegeEntity college = collaegeRepository.findOne(id);
	college.setCollegeCity(entity.getCollegeCity());
	college.setCollegeName(entity.getCollegeName());
	CollegeEntity updatetcollege = collaegeRepository.save(college);
	return updatetcollege;


	}

}
