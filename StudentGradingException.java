package exception;
import java.util.Arrays;
import java.io.*;
public class StudentGradingException extends Exception {
	private int errorno;
	private String errormsg;
	private String filename = "Log.txt";
	
	public StudentGradingException() {
		super();
		logExceptions();
	}
	
	public StudentGradingException(String errormsg) {
		super();
		this.errormsg = errormsg;
		logExceptions();
	}
	
	public StudentGradingException(int errorno) {
		super();
		this.errorno = errorno;
		logExceptions();
	}
	
	public StudentGradingException(int errorno, String errormsg) {
		super();
		this.errorno = errorno;
		this.errormsg = errormsg;
		logExceptions();
	}
	
	public int getErrorno() {
		return errorno;
	}
	
	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}
	
	public String getErrormsg() {
		return errormsg;
	}
	
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	public void printmyproblem() {
		System.out.println("FixProblems [errorno=" + errorno + ", errormsg=" + errormsg); 
		//for lab 6 open a text file in append mode and write a line with error # and message.
	}

	public int fix(int errorno) {
		switch(errorno){
			case 1: 
				//if score is greater than 100 return 100 
				return 100; 
			case 2: 
				//if score is less than 100 return 0
				return 0; 
			//..
		}
		return 0;
	}

	public void logExceptions() {
		try {
			FileWriter logFile = new FileWriter(filename, true); //study method to write exception information.
			BufferedWriter buff = new BufferedWriter(logFile);
			buff.write("\nError number: " + errorno + " Error message: " + errormsg);
			// for lab 6 open a text file in append mode and write a line with error # and
			// message.	
			buff.close();
		}
		catch(IOException e){
			System.out.println("Error -- " + e.toString());
		}
		
	}
}

/*
Design
Variables
	errorno(int) incremented varaible

	erorrmsg(String) stores the error msg

	filename(String) stores the file path

	
Input
takes error number,error message, and filename
Processing
logs all error messages into a txt file
Output 
prints the error messages
*/