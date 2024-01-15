import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {
		double F;
		double C = 0;
		//Centigrade > Farenheit 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter enter a temperature reading in Centigrade:");
		C = in.nextDouble();
		F = 32 + (C*(180.0/100.0));
		System.out.println("Equivalent Fahrenheit value is: " + F);
		
		//Farenheit > Centigrade 
		System.out.println("Enter enter a temperature reading in Farenheit:");
		F = in.nextDouble();
		C = (F-32)/(180.0/100.0);
		System.out.println("Equivalent Centigrade value is: " + C);

		
	}
}
