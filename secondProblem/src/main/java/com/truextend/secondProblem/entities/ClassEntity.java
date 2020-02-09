package com.truextend.secondProblem.entities;

public class ClassEntity {

	private String sClassName;
	private Double dClassLatitude;
	private Double dClassLongitude;

	protected ClassEntity() {
	}

	public ClassEntity(String sClassName, Double dClassLatitude, Double dClassLongitude) {
		this.sClassName = sClassName;
		this.dClassLatitude = dClassLatitude;
		this.dClassLongitude = dClassLongitude;
	}

	public String getsClassName() {
		return sClassName;
	}

	public void setsClassName(String sClassName) {
		this.sClassName = sClassName;
	}

	public Double getdClassLatitude() {
		return dClassLatitude;
	}

	public void setdClassLatitude(Double dClassLatitude) {
		this.dClassLatitude = dClassLatitude;
	}

	public Double getdClassLongitude() {
		return dClassLongitude;
	}

	public void setdClassLongitude(Double dClassLongitude) {
		this.dClassLongitude = dClassLongitude;
	}
}
