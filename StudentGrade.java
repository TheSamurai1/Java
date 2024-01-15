package model;

import java.io.Serializable;
//implements serializable
public class StudentGrade  implements Serializable {
	//properties that use containment
    private Student student;
    private Statistics stats;
	/**
	 * @return the student
	 */
    //setter and getter methods
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @return the stats
	 */
	public Statistics getStats() {
		return stats;
	}
	/**
	 * @param stats the stats to set
	 */
	public void setStats(Statistics stats) {
		this.stats = stats;
	}
	//constructor
	public StudentGrade() {
		// TODO Auto-generated constructor stub
	}

}

/*
Design
Variables
	quizArray(int Array) used to store the quizArray val

	quizNumber(int) incremented val

	studentNumber(int) line from the file

	eof(bool) end of file indicator

	counter(int) used as a counter
	
	linumm(int) line numbers in the file
	
Input
Variables
	student (Student) using containment makes a student object
	stats(statistics) using containment makes a statistics object
takes input of Student student object and statistics stats object
Processing
setter and getter methods for the properties
Output 
returns the stats and student objects
*/