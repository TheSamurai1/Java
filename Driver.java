
public class Driver{
	public static void main(String [] args) {
		SavingsAccount saver1 = new SavingsAccount("saver1", 2000);
		SavingsAccount saver2 = new SavingsAccount("saver2",3000);
//		saver1.modifyInterestRate(4);
//		saver1.calculateMonthlynterest();
		saver1.print();
		saver2.print();
//		saver2.modifyInterestRate(4);
//		saver2.calculateMonthlynterest();
//		saver2.print();
//		saver1.modifyInterestRate(5);
//		saver2.modifyInterestRate(5);
//		saver1.calculateMonthlynterest();
//		saver2.calculateMonthlynterest();
//		saver1.print();
//		saver2.print();
	}
}
