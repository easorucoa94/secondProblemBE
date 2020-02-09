package com.truextend.secondProblem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.truextend.secondProblem.entities.ClassEntity;

@Service
public interface ClassService {
	public List<ClassEntity> findAll();

	public ClassEntity save(ClassEntity classEntity);
}
