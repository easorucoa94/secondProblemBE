package com.truextend.secondProblem;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.truextend.secondProblem.entities.ClassEntity;
import com.truextend.secondProblem.entities.StudentEntity;

@SpringBootApplication
public class SecondProblemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondProblemApplication.class, args);
	}

	@PostConstruct
	private void init() {
		StudentEntity john_student = new StudentEntity("John Wilson", 34.069149, -118.442639);
		AppVariables.studentList.add(john_student);

		StudentEntity jane_student = new StudentEntity("Jane Graham", 34.069601, -118.441862);
		AppVariables.studentList.add(jane_student);

		StudentEntity pam_student = new StudentEntity("Pam Bam", 34.071513, -118.441181);
		AppVariables.studentList.add(pam_student);

		ClassEntity engineering_classroom = new ClassEntity("Principles of computational geo-location analysis",
				34.069140, -118.442689);
		AppVariables.classList.add(engineering_classroom);

		ClassEntity geology_classroom = new ClassEntity("Sedimentary Petrology", 34.069585, -118.441878);
		AppVariables.classList.add(geology_classroom);

		ClassEntity psychology_classroom = new ClassEntity("Introductory Psychobiology", 34.069742, -118.441312);
		AppVariables.classList.add(psychology_classroom);

		ClassEntity music_classroom = new ClassEntity("Art of Listening", 34.070223, -118.440193);
		AppVariables.classList.add(music_classroom);

		ClassEntity humanities_classroom = new ClassEntity("Art Hitory", 34.071528, -118.441211);
		AppVariables.classList.add(humanities_classroom);

	}

}
