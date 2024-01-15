package calculator;

import java.util.Scanner;

public class SqrtCalculator {
	public static void main(String args[]) { 	
		//initialize variable
		long n = 0;
		//asks for a number
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		//reads the number
		n = in.nextLong();
		// pass the number to sqrt function
		//prints the result
		System.out.print(sqrtCalculator(n));
	}
	public static double sqrtCalculator(long n) {
		//initialzing variables
		long nextGuess = 0;
		long lastGuess = 1;
		//formula for the Babylonian method
		nextGuess = (lastGuess + n / lastGuess) / 2;
		//while loop 
		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;

		}
		//returns nextGuess which is the squareroot of n
		lastGuess = nextGuess;
		return nextGuess  = (lastGuess + n / lastGuess) / 2;
	}
}


/*
Output for the code after using 1 as the input
Enter a number:1
1.0


*/