public class Store {
	//properties for Store object
	//salesbyweek is a two dimensional array to store weeks and days
	private float salesbyweek[][];
	//one dimensional which stores 5 weeks of total sales data
	private float totalsalesforweek [] = new float[5];
	//one dimensional which stores 5 weeks of avg sales data
	private float avgsalesforeachweek [] = new float[5];
	//below are the other properties 
	private float totalsalesforallweeks;
	private float avgsalesforallweeks;
	private float highestweeklysales;
	private float lowestweeklysales;
	// defualt constructor which creates a two dimensional array which will have 5 weeks and 7 days in each week
	Store() {
		salesbyweek = new float[5][7]; 
	}

	// getter and setters
	//populates salesbyweek two dimensional array
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}
	//prints the data after using nested for loops to iterate through salesbyweek
	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	//populates total sales by week after adding all the days in the week using an salesbyweek array
	public void totalsalesforweek() {
		//populate totalsalesforweek
		for (int i = 0; i < 5; i++)
		{
			totalsalesforweek[i] = 0;
			for (int j = 0; j < 7; j++)
			{
				totalsalesforweek[i] += salesbyweek[i][j];
			}
		}
	}
	//populates avg sales by week after adding all the days in the week using an totalsalesforallweeks array
	public void avgsalesforeachweek() {
		//populate avgsalesforeachweek
		for (int i = 0; i < 5; i++)
		{
			avgsalesforeachweek[i] = totalsalesforweek[i]/7;
		}
	}
	//populates total sales for all weeks after adding all the days in the week using an totalsalesforallweeks array
	public void totalsalesforallweeks() {
		// populat - totalsalesforallweeks
		totalsalesforallweeks = 0;
		for (int i = 0; i < 5; i++)
		{
			totalsalesforallweeks = totalsalesforweek[i];
		}
	}
	//populates avg sales for all weeks after adding all the days in the week using an totalsalesforallweeks array
	public void avgsalesforallweeks() {
		//populate-avgsalesforallweeks
		avgsalesforallweeks = totalsalesforallweeks/7;
	}
	//populates highest sale with the largest sale value  using an totalsalesforallweeks array

	public void highestsales() {
		//populate highestweeklysales
		highestweeklysales = 0;
		for (int i = 0; i < 5; i++)
		{
			if (totalsalesforweek[i] > highestweeklysales) {
				highestweeklysales = totalsalesforweek[i];
			}
		}
	}
//populates lowest sale with the smallest sale value  using an totalsalesforallweeks array
	public void lowestsales() {
		//populate lowestweeklysales
		lowestweeklysales = totalsalesforweek[0];
		for (int i = 0; i < 5; i++)
		{
			if (totalsalesforweek[i] > lowestweeklysales) {
				lowestweeklysales = totalsalesforweek[0];
			}
		}
	}
	//calls all the methods above
	public void calc() {
		totalsalesforweek();
		avgsalesforeachweek();
		totalsalesforallweeks();
		avgsalesforallweeks();
		highestsales();
		lowestsales();
		//calls all methods above and prints
	}
	//getter methods to return the values from the above calculation methods
	public float[] getotalsalesforweek() {
		return totalsalesforweek;
	}
	public float[] getavgsalesforeachweek() {
		return avgsalesforeachweek;
	}
	public float gettotalsalesforallweeks() {
		return totalsalesforallweeks;
	}
	public float getavgsalesforallweeks() {
		return avgsalesforallweeks;
	}
	public float gethighestweeklysales() {
		return highestweeklysales;
	}
	public float getlowestweeklysales() {
		return lowestweeklysales;
	}
	

}
