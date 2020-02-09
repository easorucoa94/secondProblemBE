package com.truextend.secondProblem.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.truextend.secondProblem.AppVariables;
import com.truextend.secondProblem.entities.ClassEntity;
import com.truextend.secondProblem.entities.StudentAndClassesEntity;
import com.truextend.secondProblem.entities.StudentEntity;
import com.truextend.secondProblem.services.StudentService;
import com.truextend.secondProblem.utils.AppUtils;

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

	@Override
	public List<StudentEntity> filterStudentsInClasses(StudentAndClassesEntity studentAndClassesEntity) {
		List<StudentEntity> studentList = studentAndClassesEntity.getstudentList();
		List<ClassEntity> classList = studentAndClassesEntity.getclassList();
		List<StudentEntity> studentsPresentInClasses = new ArrayList<StudentEntity>();

		for (StudentEntity studentEntity : studentList) {
			List<ClassEntity> classesAttending = getStudentAttendingClasses(studentEntity, classList);
			if (classesAttending.size() > 0) {
				studentsPresentInClasses.add(studentEntity);
			}
		}
		return studentsPresentInClasses;
	}

	@Override
	public List<ClassEntity> getStudentAttendingClasses(StudentEntity studentEntity, List<ClassEntity> classList) {
		List<ClassEntity> classesAttending = new ArrayList<ClassEntity>();
		for (ClassEntity classEntity : classList) {
			HashMap<String, HashMap<String, BigDecimal>> classPositions = AppUtils
					.getStartAndEndPositionsByCenterPosition(classEntity.getdClassLongitude(),
							classEntity.getdClassLatitude());
			HashMap<String, BigDecimal> classStartPosition = classPositions.get("startPosition");
			HashMap<String, BigDecimal> classEndPosition = classPositions.get("endPosition");
			BigDecimal classStartPositionLatitude = classStartPosition.get("dLatitudePosition").abs();
			BigDecimal classStartPositionLongitude = classStartPosition.get("dLongitudePosition").abs();
			BigDecimal classEndPositionLatitude = classEndPosition.get("dLatitudePosition").abs();
			BigDecimal classEndPositionLongitude = classEndPosition.get("dLongitudePosition").abs();

			HashMap<String, BigDecimal> studentActualPosition = AppUtils.getPositionByLatitudeAndLongitude(
					studentEntity.getdStudentLongitude(), studentEntity.getdStudentLatitude());
			BigDecimal studentPositionLatitude = studentActualPosition.get("dLatitudePosition").abs();
			BigDecimal studentPositionLongitude = studentActualPosition.get("dLongitudePosition").abs();
			if ((studentPositionLatitude.compareTo(classStartPositionLatitude) != 1
					&& studentPositionLatitude.compareTo(classEndPositionLatitude) != -1)
					&& (studentPositionLongitude.compareTo(classStartPositionLongitude) != 1
							&& studentPositionLongitude.compareTo(classEndPositionLongitude) != -1)) {
				classesAttending.add(classEntity);
				break;
			}
		}
		return classesAttending;
	}

}
