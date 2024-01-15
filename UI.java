import java.util.Scanner;

public class UI {
	//initiates a scanner object
	Scanner in  = new Scanner(System.in);
	//prints choices then asks and reads the input from user and returns selected choice
	public int getSelection() {
		int choice = -1;
		//exits loop when user entered value changes to 1-7 if it changes to number greater or less than that range loop will keep running until condition is satisfied
		while (choice == -1) {
			System.out.println("\n\nSelect operation enter 1-7");
			System.out.println("1. Enter 1 for total sales for each week");
			System.out.println("2. Enter 2 for average daily sales for each week");
			System.out.println("3. Enter 3 for total sales for all weeks");
			System.out.println("4. Enter 4 for average weekly sales");
			System.out.println("5. Enter 5 for week with the highest amount in sales."); 
			System.out.println("6. Enter 6 for week with the lowest amount in sales."); 
			System.out.println("7. Enter 7 for all analytical data. (1 through 6))");
			choice = in.nextInt();
			if (choice > 7 || choice < 0) {
				System.out.println("Error, enter again");
				choice = -1;
			}
		}
		return choice;

	}
	//returns store number after getting user input, cannot print values greater than 6 or less than 1 
	public int getStoreNmbr() {
		int storeNmbr = 0;
		//exits loop when user entered value changes to 1-6 if it changes to number greater or less than that range loop will keep running until condition is satisfied
		while (storeNmbr == 0) {
			System.out.println("Welcome to Franchise App");
			System.out.println("We have data for 6 stores for last 5 weeks.");
			System.out.println("\nSelect a store # you want to see analytics for - enter <1 through 6> and 0 to exit");
			storeNmbr = in.nextInt();
			if (storeNmbr > 6 || storeNmbr < 1) {
				System.out.println("Error, enter again");

			}
		}
		return storeNmbr;
	}
}

