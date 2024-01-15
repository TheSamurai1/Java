package calculator;

import java.util.Scanner;

public class LoanCalculator {
	public static void main(String args[]) { 
		//declare variables
		double loanAmount = 0;
		int numberOfYear = 0;
		double annualInterestRate = 0;
		double monthlyInterestRate = 0;
		double monthlyPayment = 0;
		double totalPayment = 0;
		//prompts the user for loan amount, number of years, and annual interest rate
		//reads the user values into variables
		Scanner in = new Scanner(System.in);
		System.out.print("Loan Amount:");
		loanAmount = in.nextDouble();
		System.out.print("Number of Years:");
		numberOfYear = in.nextInt();
		System.out.print("Annual Interest Rate:");
		annualInterestRate = in.nextFloat();
		in.close();
		
		
		annualInterestRate = annualInterestRate / 100;
		monthlyInterestRate = annualInterestRate / 12;
		//gets the monthlyPay variable by calling the calculateMonthlyPay method
		monthlyPayment = calculateMonthlyPay(annualInterestRate, numberOfYear, loanAmount);
		totalPayment = monthlyPayment * 12;
		// prints the monthly payment and total payment
		System.out.printf("Monthly Payment:%10.2f\n", monthlyPayment);
		System.out.printf("Total Payment:%10.2f\n", totalPayment);
		//calls the print method to print the amortization schedule
		printLoanSchedule(numberOfYear, monthlyInterestRate, monthlyPayment, loanAmount);
	

	}
	public static double calculateMonthlyPay(double annualInterestRate, int numberOfYear, double loanAmount) {
		//initializing variables
		double monthlyPay = 0;
		double i = 0;
		double n = 0;
		//calculates the values for i and n
		i = annualInterestRate / 12;
		n = numberOfYear * 12;
		//using the math power function to get monthly pay
		monthlyPay = (loanAmount * i * Math.pow(i + 1, n)) / (Math.pow(i + 1, n) - 1);
		//returns monthlyPay to be used in printLoanSchedule method
		return monthlyPay;
	}
	 public static void printLoanSchedule(int numberOfYear, double monthlyInterestRate, double monthlyPayment, double loanAmount){
		 //initialzies variables
		double principal = 0;
		double balance = 0;
		balance = loanAmount;
		double interest = 0;
	
		 //utilizes a for loop to print each months interest, principal, and balance amounts
		 for (int month = 1; month <= numberOfYear * 12; month++) {
				interest = monthlyInterestRate * balance;
				principal = monthlyPayment - interest;
				balance = balance - principal;
				System.out.printf("%3d\t\t%20.2f\t\t%20.2f\t\t%20.2f\n", month, interest, principal, balance);
			} 
		
	}

}

/*

Output for the Amortization Schedule Program
Loan Amount:10000
Number of Years:1
Annual Interest Rate:7
Monthly Payment:    865.27
Total Payment:  10383.21
  1		               58.33		              806.93		             9193.07
  2		               53.63		              811.64		             8381.42
  3		               48.89		              816.38		             7565.05
  4		               44.13		              821.14		             6743.91
  5		               39.34		              825.93		             5917.98
  6		               34.52		              830.75		             5087.24
  7		               29.68		              835.59		             4251.65
  8		               24.80		              840.47		             3411.18
  9		               19.90		              845.37		             2565.81
 10		               14.97		              850.30		             1715.51
 11		               10.01		              855.26		              860.25
 12		                5.02		              860.25		                0.00
 */

