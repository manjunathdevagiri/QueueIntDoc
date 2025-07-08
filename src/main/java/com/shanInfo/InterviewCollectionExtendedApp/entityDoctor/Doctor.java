package com.shanInfo.InterviewCollectionExtendedApp.entityDoctor;

public class Doctor {

	private int patientNum;
	private String patientName;
	private int patientage;
	private int patientcondition;
	
	
	public Doctor() {
		super();
	}


	public Doctor(int patientNum, String patientName, int patientage, int patientcondition) {
		super();
		this.patientNum = patientNum;
		this.patientName = patientName;
		this.patientage = patientage;
		this.patientcondition = patientcondition;
	}


	public int getPatientNum() {
		return patientNum;
	}


	public void setPatientNum(int patientNum) {
		this.patientNum = patientNum;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public int getPatientage() {
		return patientage;
	}


	public void setPatientage(int patientage) {
		this.patientage = patientage;
	}


	public int getPatientcondition() {
		return patientcondition;
	}


	public void setPatientcondition(int patientcondition) {
		this.patientcondition = patientcondition;
	}


	@Override
	public String toString() {
		return "Doctor [patientNum=" + patientNum + ", patientName=" + patientName + ", patientage=" + patientage
				+ ", patientcondition=" + patientcondition + "]";
	}
	
	
}
