package driver;
import exception.*;

import model.*;
import FileIO.util;
public class Driver1 {
	//main method
	public static void main(String [] args) throws StudentGradingException, Exception {

		try {
		//array of objects
		Student[] quizList = new Student[2];

		util abc = new util();
		//calls readfile in the util class
		abc.readFile("/Users/samarthsridhara/eclipse-workspace/Assignment6/Student_0_Records",quizList);
		Statistics stat = new Statistics(quizList);
		//functions of the statistic file which shows the data for quiz scores
		stat.findlow(quizList);
		stat.findhigh(quizList);
		stat.findavg(quizList);
		stat.print(4);


		}
		//in the case the file has no value it prints this
		catch(NullPointerException e) {
			try {
				throw new StudentGradingException(100, "Empty File with Header");
			}
			catch(Exception f) {
				System.out.println("Empty File with Header");
			}
		}
		finally {
			System.out.println("Process completed");

		}
	}

	
}

/*
 * Req 1 - Create a custom exception handler class called StudentGradingException that can (add this functionality in a package called exception)

Centralize capture of all exceptions
Logs exceptions in a text file.
Fix at least one exception.
Demonstrate the usage of exception handler in a driver, throwing, logging and fixing the exception. Put this in a separate driver called Driver1. java.  (Put this in driver package)

 *
 *output:
 *Low Score:	 11         0          45         78         34        
High Score:	20        12        81        100       77        
Average:	6.20      2.40      25.20     35.60     22.20     Process completed
 */
