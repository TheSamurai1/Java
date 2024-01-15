
public class Add {
	protected int i;
	Add(int a) {i = a;}
	protected void addIt(int amount ) { i += amount;}
	protected int getIt() {return i;}
	Add a = new Add();
}
