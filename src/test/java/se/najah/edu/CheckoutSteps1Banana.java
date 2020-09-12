package se.najah.edu;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps1Banana {

	String item;
	int price;
	int count;
	Checkout co = new Checkout();

	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		item = string;
		price = int1;
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
		// Write code here that turns the phrase above into concrete actions
		count = int1;
		co.check(count, price);
	}

	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(int1 == co.getTotal());
	}


}
