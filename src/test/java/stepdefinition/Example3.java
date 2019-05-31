package stepdefinition;

import static stepdefinition.LoginPageObject.un;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example3 {
	WebDriver driver;
	@Given("Login")
	public void login() {
		 System.out.println("chrome browser is launched and testme app URL is entered");
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Desktop\\Workspace\\Cum-Ishu\\src\\main\\resources\\chromedriver.exe");
		     driver = new ChromeDriver();
		    driver.get("http://newtours.demoaut.com");
	}

	@When("enter username")
	public void enter_username() {
		LoginPageObject lp=new LoginPageObject(driver);
		lp.un.sendKeys("ishwarya");
	    
	}

	@When("enter password")
	public void enter_password() {
		LoginPageObject lp=new LoginPageObject(driver);
		lp.psd.sendKeys("1998@ishu");
		}

	@When("click login")
	public void click_login() {
		LoginPageObject lp=new LoginPageObject(driver);
		lp.ok.click();
	}

	@Then("close the application")
	public void close_the_application() {
	   driver.close();
	}


}
