package com.truextend.secondProblem.entities;

import java.util.List;

public class StudentAndClassesEntity {

	private List<StudentEntity> studentList;
	private List<ClassEntity> classList;

	protected StudentAndClassesEntity() {
	}

	public StudentAndClassesEntity(List<StudentEntity> studentList, List<ClassEntity> classList) {
		this.studentList = studentList;
		this.classList = classList;
	}

	public List<StudentEntity> getstudentList() {
		return this.studentList;
	}

	public void setstudentList(List<StudentEntity> studentList) {
		this.studentList = studentList;
	}

	public List<ClassEntity> getclassList() {
		return this.classList;
	}

	public void setclassList(List<ClassEntity> classList) {
		this.classList = classList;
	}
}
