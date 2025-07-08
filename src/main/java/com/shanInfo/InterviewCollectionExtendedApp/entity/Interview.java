package com.shanInfo.InterviewCollectionExtendedApp.entity;

public class Interview {

	private int id;
	private String candidateName;
	private int Score;
	private String slot;
	
	
	public Interview() {
		super();
	}


	public Interview(int id, String candidateName, int score, String slot) {
		super();
		this.id = id;
		this.candidateName = candidateName;
		Score = score;
		this.slot = slot;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCandidateName() {
		return candidateName;
	}


	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}


	public int getScore() {
		return Score;
	}


	public void setScore(int score) {
		Score = score;
	}


	public String getSlot() {
		return slot;
	}


	public void setSlot(String slot) {
		this.slot = slot;
	}


	@Override
	public String toString() {
		return "Interview [id=" + id + ", candidateName=" + candidateName + ", Score=" + Score + ", slot=" + slot + "]";
	}
	
	
}
