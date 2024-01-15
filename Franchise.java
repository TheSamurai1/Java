//FileIO and franchise are associated with each other
public class Franchise {
	//properties for Franchise object
	//store contains a one dimensional array
	private Store stores[];
	//constructor initiates number of store objects 
	public Franchise(int num) {
			stores = new Store[num];
	}
	//returns store object for a given number
	public Store getStores(int i) {
		return stores[i];
	}
	//populates the store object
	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	//returns length of store array
	public int numberofstores()
	{
		return stores.length;
	}
	//calls calc function in store class, for every store in store object
	public void calculate() {
		for (int i =0; i<stores.length; i++) {
			stores[i].calc();
		}
	}
}
