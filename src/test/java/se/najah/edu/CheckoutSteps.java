package se.najah.edu;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

	//String item;
	//int price;
	int count=0;
	Checkout co = new Checkout();
	public static ArrayList<product> products=new ArrayList<product>();

	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer int1) {
		// Write code here that turns the phrase above into concrete actions
			product A;
			A = new product();//make new obj;
			A.setitem(string);
			A.setprice(int1);
			A.setcount(0);
			products.add(A);
		
		//item = string;
		//price = int1;
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
		// Write code here that turns the phrase above into concrete actions
		count = int1;
		for(int i=0;i<products.size();i++) {
			if(string.equalsIgnoreCase(products.get(i).getitem())) {
				products.get(i).setcount((products.get(i).getcount())+count);
				
			}
		//co.check(fruits.get(i).getcount(), fruits.get(i).getprice());
		}
		
	}

	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		for(int i=0;i<products.size();i++) {
		co.check(products.get(i).getcount(), products.get(i).getprice());
		}
		assertTrue(int1 == co.getTotal());
		products.removeAll(products);
	}


}
