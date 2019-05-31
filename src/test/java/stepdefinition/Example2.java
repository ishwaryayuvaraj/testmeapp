package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example2 {
	@Given("user login")
	public void user_login() {
	   System.out.println("user has logged in to the application");
	}

	@When("user select product  by category")
	public void user_select_product_name_by_category() {
		
		System.out.println("user has selected th product using category");
	}

	@Then("verify the product and close the application")
	public void verify_the_product_and_close_the_application() {
		System.out.println("user has verified the product and closed the application");
	}

	@When("user select product  by sub-category")
	public void user_select_product_name_by_sub_category() {
		System.out.println("user has selected th product using sub-category");
	}

	@When("user select product  by productname")
	public void user_select_product_name_by_productname() {
		System.out.println("user has selected th product using productname");
	}


}
