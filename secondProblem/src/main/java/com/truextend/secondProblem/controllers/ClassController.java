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

import com.truextend.secondProblem.entities.ClassEntity;
import com.truextend.secondProblem.services.ClassService;
import com.truextend.secondProblem.services.impl.ClassServiceImpl;

@RestController
@RequestMapping(path = "/class")
public class ClassController {
	@Autowired
	ClassService classService = new ClassServiceImpl();

	@GetMapping
	public List<ClassEntity> findAll() {
		return classService.findAll();
	}

	@PostMapping
	public ResponseEntity<ClassEntity> save(@Valid @RequestBody ClassEntity classEntity) {
		return ResponseEntity.ok(classService.save(classEntity));
	}
}
