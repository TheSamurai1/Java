package adapter;

import model.StudentGrade;
//implements the interface
public class StudentAPIImpl implements StudentAPI {
	//containment
	private StudentGrade[] studentGrades;
	//constructor
	public StudentAPIImpl(StudentGrade[] studentGrades) {
		this.studentGrades = studentGrades;
	}

	@Override
	//prints the output required for the requirement the Student Id
	public void printStudent(int id) {
		for (int i = 0; i < studentGrades.length; i++) {
			StudentGrade g = studentGrades[i];
			if(g.getStudent().getSID() == id) {
				System.out.println(g.getStudent().printText());
				break;
			}
		}
	}

	@Override
	//prints the student lowest, highest, and average values
	public void printStatistics() {
		StudentGrade g = studentGrades[0];
		System.out.println(g.getStats().printText(4));		
	}

}


/*
Design
Variables
	studentGrades(StudentGrade array) used to store the student id and statistics
	
Input
takes input of studentgrade array object, and int id
Processing
populates studentgrade object array with student id and low, high, and avg quiz score values
Output 
populates the student array object from file
*/