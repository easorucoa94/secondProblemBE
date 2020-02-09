package com.truextend.secondProblem.entities;

public class StudentEntity {

	private String sStudentName;
	private Double dStudentLatitude;
	private Double dStudentLongitude;

	protected StudentEntity() {
	}

	public StudentEntity(String sStudentName, Double dStudentLatitude, Double dStudentLongitude) {
		this.sStudentName = sStudentName;
		this.dStudentLatitude = dStudentLatitude;
		this.dStudentLongitude = dStudentLongitude;
	}

	public String getsStudentName() {
		return sStudentName;
	}

	public void setsStudentName(String sStudentName) {
		this.sStudentName = sStudentName;
	}

	public Double getdStudentLatitude() {
		return dStudentLatitude;
	}

	public void setdStudentLatitude(Double dStudentLatitude) {
		this.dStudentLatitude = dStudentLatitude;
	}

	public Double getdStudentLongitude() {
		return dStudentLongitude;
	}

	public void setdStudentLongitude(Double dStudentLongitude) {
		this.dStudentLongitude = dStudentLongitude;
	}
}
