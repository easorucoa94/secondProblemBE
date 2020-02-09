package com.truextend.secondProblem.entities;

public class ClassEntity {

	private String sClassName;
	private Double dClassLattitude;
	private Double dClassLongitude;

	protected ClassEntity() {
	}

	public ClassEntity(String sClassName, Double dClassLattitude, Double dClassLongitude) {
		this.sClassName = sClassName;
		this.dClassLattitude = dClassLattitude;
		this.dClassLongitude = dClassLongitude;
	}

	public String getsClassName() {
		return sClassName;
	}

	public void setsClassName(String sClassName) {
		this.sClassName = sClassName;
	}

	public Double getdClassLattitude() {
		return dClassLattitude;
	}

	public void setdClassLattitude(Double dClassLattitude) {
		this.dClassLattitude = dClassLattitude;
	}

	public Double getdClassLongitude() {
		return dClassLongitude;
	}

	public void setdClassLongitude(Double dClassLongitude) {
		this.dClassLongitude = dClassLongitude;
	}
}
