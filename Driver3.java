package driver;


import FileIO.util;
import adapter.StudentAPI;
import adapter.StudentAPIImpl;
import model.*;
public class Driver3 {
	//main method
	public static void main(String[] args) {
		//util obj
		util utl = new util();
		//passes the filename to read file so the file will be read and the array populated
		StudentGrade[] gradeArray = utl.readFile("/Users/samarthsridhara/eclipse-workspace/Assignment6/Student_0_Records");
		//interface
		StudentAPI st = new StudentAPIImpl(gradeArray);
		st.printStudent(4532);
		st.printStatistics();
	}

}

/*
Req 3 - Implement abstract class and Interface (add this functionality in a package called adapter)

Create an API (A programming interface) to 

Print student statistics
Print score for a given student id
You should create an Interface called StudentAPI in which two methods are declared for functionality (Req 3 - 1 and 2) stated above.

You should create a class StudentAPIImpl that would implement StudentAPI. Using methods from other classes, (Student.java, Statistics.java, StudentGrade.java, FileIO.java) implement the two methods in StudentAPI.

Create a driver demonstrating the usage of the API. Put this in a separate driver called Driver3. java.  (Put this in driver package)

Output:
Student ID:4532
Quiz1score is 11
Quiz2score is 0
Quiz3score is 81
Quiz4score is 100
Quiz5score is 77



Low Score:
11
0
45
78
34
High Score:
20
12
81
100
77
Average:
6.2
2.4
25.2
35.6
22.2

*/