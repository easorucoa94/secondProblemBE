package com.truextend.secondProblem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.truextend.secondProblem.entities.ClassEntity;
import com.truextend.secondProblem.entities.StudentAndClassesEntity;
import com.truextend.secondProblem.entities.StudentEntity;
import com.truextend.secondProblem.services.StudentService;
import com.truextend.secondProblem.services.impl.StudentServiceImpl;

@SpringBootTest
@AutoConfigureMockMvc
class SecondProblemApplicationTests {

	@Autowired
	private StudentService studentService = new StudentServiceImpl();

	@Test
	public void firstScenarioTest() {
		List<ClassEntity> classList = new ArrayList<ClassEntity>();
		ClassEntity engineeringClassroom = new ClassEntity("Principles of computational geo-location analysis",
				34.069140, -118.442689);
		ClassEntity geologyClassroom = new ClassEntity("Sedimentary Petrology", 34.069585, -118.441878);
		ClassEntity psychologyClassroom = new ClassEntity("Introductory Psychobiology", 34.069742, -118.441312);
		ClassEntity musicClassroom = new ClassEntity("Art of Listening", 34.070223, -118.440193);
		ClassEntity humanitiesClassroom = new ClassEntity("Art History", 34.071528, -118.441211);
		classList.add(engineeringClassroom);
		classList.add(geologyClassroom);
		classList.add(psychologyClassroom);
		classList.add(musicClassroom);
		classList.add(humanitiesClassroom);

		List<StudentEntity> studentList = new ArrayList<StudentEntity>();
		StudentEntity johnStudent = new StudentEntity("John Wilson", 34.069149, -118.442639);
		StudentEntity janeStudent = new StudentEntity("Jane Graham", 34.069601, -118.441862);
		StudentEntity pamStudent = new StudentEntity("Pam Bam", 34.071513, -118.441181);
		studentList.add(johnStudent);
		studentList.add(janeStudent);
		studentList.add(pamStudent);

		StudentAndClassesEntity studentAndClassesEntity = new StudentAndClassesEntity(studentList, classList);

		List<StudentEntity> studentFoundList = studentService.filterStudentsInClasses(studentAndClassesEntity);
		List<StudentEntity> studentFoundListWithCorrectData = new ArrayList<StudentEntity>();
		studentFoundListWithCorrectData.add(johnStudent);
		studentFoundListWithCorrectData.add(janeStudent);
		studentFoundListWithCorrectData.add(pamStudent);
		assertEquals(studentFoundListWithCorrectData, studentFoundList);
	}
	
	@Test
	public void secondScenarioTest() {
		List<ClassEntity> classList = new ArrayList<ClassEntity>();
		ClassEntity engineeringClassroom = new ClassEntity("Principles of computational geo-location analysis",
				34.069140, -118.442689);
		ClassEntity geologyClassroom = new ClassEntity("Sedimentary Petrology", 34.069585, -118.441878);
		ClassEntity psychologyClassroom = new ClassEntity("Introductory Psychobiology", 34.069742, -118.441312);
		ClassEntity musicClassroom = new ClassEntity("Art of Listening", 34.070223, -118.440193);
		ClassEntity humanitiesClassroom = new ClassEntity("Art History", 34.071528, -118.441211);
		classList.add(engineeringClassroom);
		classList.add(geologyClassroom);
		classList.add(psychologyClassroom);
		classList.add(musicClassroom);
		classList.add(humanitiesClassroom);

		List<StudentEntity> studentList = new ArrayList<StudentEntity>();
		StudentEntity johnStudent = new StudentEntity("John Wilson", 34.069849, -118.443539);
		StudentEntity janeStudent = new StudentEntity("Jane Graham", 34.069901, -118.441562);
		StudentEntity pamStudent = new StudentEntity("Pam Bam", 34.071523, -118.441171);
		studentList.add(johnStudent);
		studentList.add(janeStudent);
		studentList.add(pamStudent);

		StudentAndClassesEntity studentAndClassesEntity = new StudentAndClassesEntity(studentList, classList);

		List<StudentEntity> studentFoundList = studentService.filterStudentsInClasses(studentAndClassesEntity);
		List<StudentEntity> studentFoundListWithCorrectData = new ArrayList<StudentEntity>();
		studentFoundListWithCorrectData.add(pamStudent);
		assertEquals(studentFoundListWithCorrectData, studentFoundList);
	}
	
	/*
	 * Test situation:
	 * - Get studentList if more than one classroom intersect with another / have the same latitude-longitude
	 * It should not repeat data
	 * - DATA EXTRACTED FROM FIRST SCENARIO, should return all students but not duplicated
	 */
	@Test
	public void getStudentsInClassesThatIntersectTest() {
		List<ClassEntity> classList = new ArrayList<ClassEntity>();
		ClassEntity engineeringClassroom = new ClassEntity("Principles of computational geo-location analysis",
				34.069140, -118.442689);
		ClassEntity geologyClassroom = new ClassEntity("Sedimentary Petrology", 34.069585, -118.441878);
		ClassEntity psychologyClassroom = new ClassEntity("Introductory Psychobiology", 34.069742, -118.441312);
		ClassEntity musicClassroom = new ClassEntity("Art of Listening", 34.070223, -118.440193);
		ClassEntity humanitiesClassroom = new ClassEntity("Art History", 34.071528, -118.441211);
		classList.add(engineeringClassroom);
		classList.add(geologyClassroom);
		classList.add(psychologyClassroom);
		classList.add(psychologyClassroom); // Add class with same latitude and longitude to verify
		classList.add(musicClassroom);
		classList.add(humanitiesClassroom);

		List<StudentEntity> studentList = new ArrayList<StudentEntity>();
		StudentEntity johnStudent = new StudentEntity("John Wilson", 34.069149, -118.442639);
		StudentEntity janeStudent = new StudentEntity("Jane Graham", 34.069601, -118.441862);
		StudentEntity pamStudent = new StudentEntity("Pam Bam", 34.071513, -118.441181);
		studentList.add(johnStudent);
		studentList.add(janeStudent);
		studentList.add(pamStudent);

		StudentAndClassesEntity studentAndClassesEntity = new StudentAndClassesEntity(studentList, classList);

		List<StudentEntity> studentFoundList = studentService.filterStudentsInClasses(studentAndClassesEntity);
		List<StudentEntity> studentFoundListWithCorrectData = new ArrayList<StudentEntity>();
		studentFoundListWithCorrectData.add(johnStudent);
		studentFoundListWithCorrectData.add(janeStudent);
		studentFoundListWithCorrectData.add(pamStudent);
		assertEquals(studentFoundListWithCorrectData, studentFoundList);
	}

}
