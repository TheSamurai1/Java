package driver;
import model.*;
import FileIO.util;


import java.io.*;
public class Driver2 {
	//main method
	public static void main(String[] args) {
		//util obj
		util utl = new util();
		//passing the file name so it can populate studen tarray
		StudentGrade[] gradeArray = utl.readFile("/Users/samarthsridhara/eclipse-workspace/Assignment6/Student_0_Records");
		//serializng : archiving the object to hardisk
		for (int i = 0; i < gradeArray.length; i++) {
			try {
				OutputStream file = new FileOutputStream("result-" + gradeArray[i].getStudent().getSID() + ".ser");
				OutputStream buffer = new BufferedOutputStream(file);
				ObjectOutput output = new ObjectOutputStream(buffer);
				output.writeObject(gradeArray[i]);
				output.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//deserializing: turning the serialized file into a txt fi;e
		for (int k = 0; k < gradeArray.length; k++) {
			try {
				InputStream file = new FileInputStream("result-" + gradeArray[k].getStudent().getSID() + ".ser");
				ObjectInput input = new ObjectInputStream(file);
				StudentGrade temp = (StudentGrade) (input.readObject());
				input.close();
			     FileWriter myWriter = new FileWriter("result-"  + gradeArray[k].getStudent().getSID() +  ".txt");
			    myWriter.write(temp.getStudent().printText());
			    myWriter.write(temp.getStats().printText(4));
			    myWriter.close();
//				System.out.println(temp.printText());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
	
}

/*
 * Req 2 - Deliver the grade for each student in a serialized file. ((add this functionality in a package called util and place the FileIO class in util package)

Imagine you are getting your grade report in a serialized file. This will contain your id, lab scores and high, low and avg for each quiz. 

You should create a new class called StudentGrade (that contains Student and Statistics), then write a method to serialize StudentGrade in FileIO class.

Demonstrate serializing StudentGrade object in a separate driver called Driver2. java.  (Put this in driver package)
 */

