package FileIO;

import java.io.*;
import java.util.StringTokenizer;
import model.*;

public class util {

	public util() {

	}

	// This should be an instance method

	// Reads the file and builds student array.
	public void readFile(String filename, Student[] stu) {
		try {
			int[] quizArray = new int[5];
			int quizNumber = 0;
			int studentNumber = 0;
			// Open the file using FileReader Object.
			FileReader in = new FileReader(filename);
			BufferedReader bufferIn = new BufferedReader(in);
			boolean eof = false;
			int counter = 0;
			int linnum = 0;
			String file_42 = "/Users/samarthsridhara/eclipse-workspace/Assignment5/src/driver/Student_42_Records";
			// In a loop read a line using readLine method.

			while (!eof) {
				String line = bufferIn.readLine();

					if (line == null) {
						eof = true;
						break;
					}
				if ((linnum != 0 && filename != file_42) || ((linnum != 0 && linnum != 41 && linnum != 42) && (filename == file_42))) {
					
						
					// Tokenize each line using StringTokenizer Object
					StringTokenizer st = new StringTokenizer(line);
					while (st.hasMoreTokens()) {
						// Each token is converted from String to Integer using parseInt method
						int x = Integer.parseInt(st.nextToken());
//				    System.out.println(x);
						if (counter == 0) {
							studentNumber = x;
							counter++;
						} else {
							// Value is then saved in the right property of Student Object.
							quizArray[quizNumber] = x;
							quizNumber++;

						}

					}
					stu[linnum - 1] = new Student(studentNumber, quizArray);
					quizNumber = 0;
					counter = 0;
				}
				linnum++;
			}
			bufferIn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
takes input of student array object and file name
Processing
reads file line by line
populates students object array with values from the file
Output 
populates the student array object from file
*/