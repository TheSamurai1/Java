
public class Driver {

	public static void main(String[] args) {
		//initializes variables used for counters and the store number inputted
		int storeNmbr = 0; 
		int option = 0;
		//wklyData will stores the sales data by week its a one dimensional array
		float wklyData[] = new float[5];
		//FileIO object is loaded with Salesdat.txt directory
		FileIO a1 = new FileIO("/Users/samarthsridhara/eclipse-workspace/Assignment 3/src/Salesdat.txt");
		//the franchise object is populated from readData()
		Franchise f = a1.readData();
		//instantiates a UI object
		UI input = new UI();
		 //this method call will do all the calculations for all stores 
		f.calculate();
		// ask user to input store number and reads the store number and assigns it to the variable
		storeNmbr = input.getStoreNmbr();
		//for a given store number loads the store object into optStore
		Store optStore = f.getStores(storeNmbr-1);
		//do while loop that loops through input of user and outputs data that user selected the loop while exit option is equal to 0
		do {
			option = input.getSelection();
			if (option == 0) {
				System.out.println("Thanks for using the Franchise App.");
				break;
			}
			switch(option) {
			case 7:
			case 1: wklyData = optStore.getotalsalesforweek();
				System.out.printf("\n\nTotal Sales for week 1: %-10.2f,for week 2: %-10.2f for week 3: %-10.2f, for week 4: %-10.2f, for week 5: %-10.2f", 
						wklyData[0], wklyData[1], wklyData[2], wklyData[3], wklyData[4]);
				if (option != 7) {
					break;
				}
			case 2: wklyData = optStore.getavgsalesforeachweek(); 
			System.out.printf("\n\nTotal Avg Sales for week 1: %-10.2f,for week 2: %-10.2f for week 3: %-10.2f, for week 4: %-10.2f, for week 5: %-10.2f", 
					wklyData[0], wklyData[1], wklyData[2], wklyData[3], wklyData[4]);
			if (option != 7) {
				break;
			}
			
				case 3: 
					System.out.printf("\n\n Total sales for all weeks is: %-11.2f", optStore.gettotalsalesforallweeks());
					if (option != 7) {
						break;
					}
				case 4: 
					System.out.printf("\n average weekly: %-10.2f", optStore.getavgsalesforallweeks()); 
					if (option != 7) {
						break;
					}
			
				case 5: 
					System.out.printf("\n Highest sales: %-10.2f", optStore.gethighestweeklysales());
					if (option != 7) {
						break;
					}			
				case 6:
					System.out.printf("\n Lowest sales: %-10.2f", optStore.getlowestweeklysales());
					if (option != 7) {
						break;
					}
			}
		}while(option != 0);
	}
}



/*

Output for Driver class:
Welcome to Franchise App
We have data for 6 stores for last 5 weeks.

Select a store # you want to see analytics for - enter <1 through 6> and 0 to exit
6


Select operation enter 1-7
1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with the highest amount in sales.
6. Enter 6 for week with the lowest amount in sales.
7. Enter 7 for all analytical data. (1 through 6))
7


Total Sales for week 1: 26912.45  ,for week 2: 31107.93   for week 3: 35370.93  , for week 4: 39633.93  , for week 5: 43896.93  

Total Avg Sales for week 1: 3844.64   ,for week 2: 4443.99    for week 3: 5052.99   , for week 4: 5661.99   , for week 5: 6270.99   

 Total sales for all weeks is: 43896.93   
 average weekly: 6270.99   
 Highest sales: 43896.93  
 Lowest sales: 26912.45  

Select operation enter 1-7
1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with the highest amount in sales.
6. Enter 6 for week with the lowest amount in sales.
7. Enter 7 for all analytical data. (1 through 6))
2


Total Avg Sales for week 1: 3844.64   ,for week 2: 4443.99    for week 3: 5052.99   , for week 4: 5661.99   , for week 5: 6270.99   

Select operation enter 1-7
1. Enter 1 for total sales for each week
2. Enter 2 for average daily sales for each week
3. Enter 3 for total sales for all weeks
4. Enter 4 for average weekly sales
5. Enter 5 for week with the highest amount in sales.
6. Enter 6 for week with the lowest amount in sales.
7. Enter 7 for all analytical data. (1 through 6))
0
Thanks for using the Franchise App.

 */

