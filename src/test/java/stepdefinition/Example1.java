package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example1 {
	WebDriver driver;
	@Given("user launch chrome browser And enter TestMeApp URL")
	public void user_launch_chrome_browser_And_enter_TestMeApp_URL() {
	    System.out.println("chrome browser is launched and testme app URL is entered");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Desktop\\Workspace\\Cum-Ishu\\src\\main\\resources\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com");
	}

	@When("User enter username in username field")
	public void user_enter_username_in_username_field() {
		System.out.println("username is entered");
		driver.findElement(By.name("userName")).sendKeys("ishwarya");

		
	    
	}

	@When("User enter password in password field")
	public void user_enter_password_in_password_field() {
		System.out.println("password is entered");
		driver.findElement(By.name("password")).sendKeys("1998@ishu");

	}

	@When("User clicks on OK button")
	public void user_clicks_on_OK_button() {
		System.out.println("OK button is clicked");
		driver.findElement(By.name("login")).click();

		
	}

	@Then("verify result")
	public void verify_result() {
		System.out.println("result is verified");
	}


}
