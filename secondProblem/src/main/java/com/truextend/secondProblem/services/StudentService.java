package com.truextend.secondProblem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.truextend.secondProblem.entities.ClassEntity;
import com.truextend.secondProblem.entities.StudentAndClassesEntity;
import com.truextend.secondProblem.entities.StudentEntity;

@Service
public interface StudentService {
	public List<StudentEntity> findAll();

	public StudentEntity save(StudentEntity studentEntity);

	public List<StudentEntity> filterStudentsInClasses(StudentAndClassesEntity studentAndClassesEntity);
	
	public List<ClassEntity> getStudentAttendingClasses(StudentEntity studentEntity, List<ClassEntity> classList);
}
