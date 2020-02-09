package com.truextend.secondProblem.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.truextend.secondProblem.AppVariables;
import com.truextend.secondProblem.entities.ClassEntity;
import com.truextend.secondProblem.services.ClassService;

@Service
public class ClassServiceImpl implements ClassService {

	@Override
	public List<ClassEntity> findAll() {
		return AppVariables.classList;
	}

	@Override
	public ClassEntity save(ClassEntity classEntity) {
		if (AppVariables.classList.add(classEntity)) {
			return classEntity;
		}
		return null;
	}

}
