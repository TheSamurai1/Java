package model;

import java.io.*;

public class Student implements Serializable {
	
//	SID(int) stores the student id
//
//	scores(nt Array) used to store the quiz values 
//
//
//	count(int) count of students
	private int SID;
	private int scores[];
	public static int count = 0;
	public Student() {
		
	}
	//constructor
	public Student(int SID, int[] scores ) {
		count++;
		this.SID = SID;
		this.scores = new int[scores.length];
		setScores(scores);
	}
	//getter and setter methods
	public void setSID(int SID) {
		this.SID = SID;
	}
	public int getSID() {
		return this.SID;
	}
	public void  setScores(int[] scoresInput) {
		for (int i = 0; i < 5; i ++) {
			this.scores[i] = scoresInput[i];
		}
	}

	public int[] getScores() {
		return scores;
	}
	public int getScore(int a) {
		return scores[a];
	}
	//print method
	public void print() {
		System.out.printf("Student ID:%10s\n", this.SID);
		for (int k = 0; k < 5; k++) {
			System.out.printf("Quiz %-10d Scores: %10d\n",(k + 1), this.scores[k]);
		}
	}
	public String printText() {
		String var;
		String var1;
		var = "Student ID:" + this.SID;
		for (int k = 0; k < 5; k++) {
			var1 = ""+(this.scores[k]);
			var = var +  "\nQuiz" + "" + (k + 1) + "" +  "score is "  +  var1;
			
		}
		return var;
	}
}



/*
Design
Variables
	SID(int) stores the student id

	scores(nt Array) used to store the quiz values 


	count(int) count of students

	
Input
student id and scores
Processing
getter and setter methods for the properties
has a print method
Output 
*/