package driver;
import model.*;
import FileIO.util;
public class Driver {
	//main method
	public static void main(String [] args) {

		try {
		//array of objects
		Student[] quizList = new Student[40];

		util abc = new util();
		//calls readfile in the util class
		abc.readFile("/Users/samarthsridhara/eclipse-workspace/Assignment5/src/driver/Student_42_Records",quizList);
		Statistics stat = new Statistics();
		//functions of the statistic file which shows the data for quiz scores
		stat.findlow(quizList);
		stat.findhigh(quizList);
		stat.findavg(quizList);
		stat.print(4);


		}
		//in the case the file has no value it prints this
		catch(NullPointerException e) {
			System.out.println("Empty File with Header");
		}
	}

	
}


//Output for Driver Class
//Student 0 Output
//Empty File with Header

//Student 15 Output
//Low Score:	 0          7          0          32         10        
//High Score:	100       100       100       90        80        
//Average:	138.60    127.00    211.40    227.00    149.20  

//Student 40 Output
//Low Score:	 0          7          0          32         10        
//High Score:	100       100       100       90        80        
//Average:	138.60    127.00    211.40    227.00    149.20  

//Student 42 Output
//Low Score:	 1          7          0          32         10        
//High Score:	100       100       100       90        80        
//Average:	385.20    325.20    558.40    603.00    398.20  