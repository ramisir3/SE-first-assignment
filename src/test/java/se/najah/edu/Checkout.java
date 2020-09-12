package se.najah.edu;

import java.util.ArrayList;

public class Checkout {
	private int total=0;
	//public static ArrayList<fruit> fruits=new ArrayList<fruit>();
	
	public void check(int count, int price ) {
		
		total += (count*price);
	}
	
	public int getTotal() {
		return total;
		
	}
}
