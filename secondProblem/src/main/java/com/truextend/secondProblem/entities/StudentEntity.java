package com.truextend.secondProblem.entities;

public class StudentEntity {

	private String sStudentName;
	private Double dStudentLattitude;
	private Double dStudentLongitude;

	protected StudentEntity() {
	}

	public StudentEntity(String sStudentName, Double dStudentLattitude, Double dStudentLongitude) {
		this.sStudentName = sStudentName;
		this.dStudentLattitude = dStudentLattitude;
		this.dStudentLongitude = dStudentLongitude;
	}

	public String getsStudentName() {
		return sStudentName;
	}

	public void setsStudentName(String sStudentName) {
		this.sStudentName = sStudentName;
	}

	public Double getdStudentLattitude() {
		return dStudentLattitude;
	}

	public void setdStudentLattitude(Double dStudentLattitude) {
		this.dStudentLattitude = dStudentLattitude;
	}

	public Double getdStudentLongitude() {
		return dStudentLongitude;
	}

	public void setdStudentLongitude(Double dStudentLongitude) {
		this.dStudentLongitude = dStudentLongitude;
	}
}
