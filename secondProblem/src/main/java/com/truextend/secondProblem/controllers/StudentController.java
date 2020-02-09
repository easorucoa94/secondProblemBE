package com.truextend.secondProblem.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truextend.secondProblem.entities.StudentEntity;
import com.truextend.secondProblem.services.StudentService;
import com.truextend.secondProblem.services.impl.StudentServiceImpl;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

	@Autowired
	StudentService studentService = new StudentServiceImpl();

	@GetMapping
	public List<StudentEntity> findAll() {
		return studentService.findAll();
	}

	@PostMapping
	public ResponseEntity<StudentEntity> save(@Valid @RequestBody StudentEntity studentEntity) {
		return ResponseEntity.ok(studentService.save(studentEntity));
	}

}
