package model;

import java.io.Serializable;

//
public class Statistics implements Serializable {
	private int[] lowscores = new int[5]; 
	private int[] highscores = new int[5];
	private float[] avgscores = new float[5];
	public String var;
	public String var1;
	public Statistics() {
		
	}
	/* This method will find the lowest score and store it in an   array names lowscores. */
	public void findlow(Student [] quizList) {
		int low = 2000;
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < quizList.length; k++) {
				if (quizList[k].getScore(i) < low) {
					low = quizList[k].getScore(i);
				}
			}
			lowscores[i] = low;
			low = 2000;
		}
		
	}
	/* This method will find the highest score and store it in an     array names highscores. */
	public void findhigh(Student [] quizList) {
		int high = 0;
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < quizList.length; k++) {
				if (quizList[k].getScore(i) > high) {
					high = quizList[k].getScore(i);
				}
			}
			highscores[i] = high;
			high = 0;
		}
		

	}
	
	/* This method will find avg score for each quiz and store it in an array names avgscores. */
	public void findavg(Student [] quizList) {
		float avg = 0.0f;
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < quizList.length; k++) {
				avg += (quizList[k].getScore(i));
				
			}
			avgscores[i] = avg/5;
			avg = 0.0f;
		}
		

	}
	
	//add methods to print values of instance variables.

	public void print(int option) {
		//1 - print low scores, 2 - print high scores, 3 - print avg - 4 print all.
		switch(option) {
			case 4:
			case 1:
				System.out.printf("Low Score:\t");
				for (int j = 0; j < lowscores.length; j++) {
					System.out.printf(" %-10d", lowscores[j]);
				}
				if (option != 4) {
					break;
				}
				else {
					System.out.print("\n");
				}
			case 2:
				System.out.printf("High Score:\t");
				for (int j = 0; j < highscores.length; j++) {
					System.out.printf("%-10d", highscores[j]);
				}
				if (option != 4) {
					break;
				}
				else {
					System.out.print("\n");
				}
			case 3:
				System.out.printf("Average:\t");
				for (int j = 0; j < avgscores.length; j++) {
					System.out.printf("%-10.2f", avgscores[j]);
				}
				if (option != 4) {
					break;
				}
		}		

	}
	
	public String printText(int option) {
		//1 - print low scores, 2 - print high scores, 3 - print avg - 4 print all.

		switch(option) {
			case 4:
			case 1:
				var = "\nLow Score:";
				
				for (int j = 0; j < lowscores.length; j++) {
					var1 = "\n"+lowscores[j];
					var += var1;
				}
				if (option != 4) {
					break;
				}
				else {
					System.out.print("\n");
				}
			case 2:
				var += "\nHigh Score:";
				for (int j = 0; j < highscores.length; j++) {
					var1 = "\n"+highscores[j];
					var += var1;
				}
				if (option != 4) {
					break;
				}
				else {
					System.out.print("\n");
				}
			case 3:
				var += "\nAverage:";
				for (int j = 0; j < avgscores.length; j++) {
					var1 = "\n"+avgscores[j];
					var += var1;
				}
				if (option != 4) {
					break;
				}
		}
		return var;

	}
}


/*
Design
Variables
	lowscares(int Array) used to store the lowest val quiz scores

	highscores(nt Array) used to store the highest val quiz scores


	avgscores(nt Array) used to store the average val quiz scores

	
Input
takes input of student array object 
Processing
iterates through the quiz array for all students and calculates the lowest or highest or average values based on user input
Output 
iterates through the quiz array for all students and outputs lowest or highest or average values based on user input
*/
