public class Driver2 {
	public static void main(String[] args) {
		Test2 a1 = new Test2(); 
		Test3 a2 = new Test3(); 
		a1.restful(15);
		a2.restful(20);
		Test3 a3[] = new Test3[5]; 
		for (int i = 0; i < a3.length; i++) {
			if (i % 2 == 0)
				a3[i] = new Test3(); 
			a3[i] = new Test3(); 
		}
		for (int i = 0; i < a3.length; i++) {
			a3[i].restful(1); 
		}
	}
}
