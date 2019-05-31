package stepdefinition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example4 {
	WebDriver driver;
	@Given("user login to TestMe")
	public void user_login_to_TestMe() {
		
		System.out.println("chrome browser is launched and testme app URL is entered");
	   
	    
	    
	}

	@When("user selects product as headphone")
	public void user_selects_product_as_headphone() {
		System.out.println("user selects prduct asa headphone");
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		System.out.println("user clicks on add to cart");
	}

	@When("user clicks on cart link")
	public void user_clicks_on_cart_link() {
		System.out.println("user clicks on cart link");
	}

	@When("user provides quantity as {int}")
	public void user_provides_quantity_as(Integer q) {
		System.out.println("no of quantity purchased by user is"+q);
	}

	@When("user proceed checkout")
	public void user_proceed_checkout() {
		System.out.println("user clicks checkout");
	}

	@Then("verify the review and payment page")
	public void verify_the_review_and_payment_page() {
		System.out.println("review is verified and redirected to payment page");
	}

}
