package se.najah.edu;

public class Checkout {
	private int total;

	public void check(int count, int price) {
		total += (count*price);
	}
	
	public int getTotal() {
		return total;
		
	}
}
