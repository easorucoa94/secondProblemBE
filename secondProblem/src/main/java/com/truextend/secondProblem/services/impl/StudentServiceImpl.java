package com.truextend.secondProblem.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.truextend.secondProblem.AppVariables;
import com.truextend.secondProblem.entities.StudentEntity;
import com.truextend.secondProblem.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<StudentEntity> findAll() {
		return AppVariables.studentList;
	}

	@Override
	public StudentEntity save(StudentEntity studentEntity) {
		if (AppVariables.studentList.add(studentEntity)) {
			return studentEntity;
		}
		return null;
	}

}
