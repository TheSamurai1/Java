import java.util.Scanner;

public class CustomerBill {
	public static void main(String[] args) {
		//common variables for all products
		final float tax = 8.25f/100;
		Scanner in = new Scanner(System.in);

		//variables for Product tv
		final float uptv ;
		float tptv = 0;
		uptv = 400.0f;
		float tvtotal;
		
		// Input for tv
		System.out.println("How many TV's were sold?"); 
		int qtytv = in.nextInt();
		tvtotal = uptv * qtytv;
		
		//varibales for vcr
		final float upvcr ;
		float tpvcr = 0;
		upvcr = 220.0f;
		float vcrtotal;
		
		// Input for vcr
		System.out.println("How many VCRs were sold?"); 
		int qtyvcr = in.nextInt();
		vcrtotal = upvcr * qtyvcr;
		
		//varibales for Remote Controller
		final float uprc ;
		float tprc = 0;
		uprc = 35.20f;
		float rctotal;
		
		// Input for Remote Controller
		System.out.println("How many Remote Controllers were sold?"); 
		int qtyrc = in.nextInt();
		rctotal = uprc * qtyrc;
		
		
		//varibales for CD Player
		final float upCD ;
		float tpCD= 0;
		upCD = 300.0f;
		float CDtotal;
		
		// Input for CD Player
		System.out.println("How many CD Players were sold?"); 
		int qtyCD = in.nextInt();
		CDtotal = upCD * qtyCD;
		
		
		//varibales for Tape Recorder
		final float uptr ;
		float tptr= 0;
		uptr = 150.0f;
		float trtotal;
		
		// Input for Tape Recorder
		System.out.println("How many Tape Recorder were sold?"); 
		int qtytr = in.nextInt();
		trtotal = uptr * qtytr;
		//Subtotal
		float subtotal = (tvtotal + vcrtotal + rctotal + CDtotal + trtotal);
		float subtax = subtotal * tax;
		//Final Bill Output
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","QTY","DESCRIPTION", "UNIT PRICE", "TOTAL PRICE");
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n",qtytv,"Television", uptv, tvtotal);
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n",qtyvcr,"VCR", upvcr, vcrtotal);
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n",qtyrc,"Remote Controller", uprc, rctotal);
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n",qtyCD,"CD Player", upCD, CDtotal);
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n",qtytr,"Tape Recorder", uptr, trtotal);
		System.out.println("");
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","","SUBTOTAL", "", tvtotal + vcrtotal + rctotal + CDtotal + trtotal);
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","","TAX", "", subtax);
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","","TOTAL", "", subtotal + subtax);



		




	}
}
