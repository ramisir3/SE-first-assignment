package se.najah.edu;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps1Banana {

	//String item;
	//int price;
	int count=0;
	Checkout co = new Checkout();
	public static ArrayList<fruit> fruits=new ArrayList<fruit>();

	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer int1) {
		// Write code here that turns the phrase above into concrete actions
			fruit A;
			A = new fruit();//make new obj;
			A.setitem(string);
			A.setprice(int1);
			A.setcount(0);
			fruits.add(A);
		
		//item = string;
		//price = int1;
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
		// Write code here that turns the phrase above into concrete actions
		count = int1;
		for(int i=0;i<fruits.size();i++) {
			if(string.equalsIgnoreCase(fruits.get(i).getitem())) {
				fruits.get(i).setcount((fruits.get(i).getcount())+count);
				
			}
		//co.check(fruits.get(i).getcount(), fruits.get(i).getprice());
		}
		
	}

	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		for(int i=0;i<fruits.size();i++) {
		co.check(fruits.get(i).getcount(), fruits.get(i).getprice());
		}
		assertTrue(int1 == co.getTotal());
		fruits.removeAll(fruits);
	}


}
