package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example5 {
	WebDriver driver;

	
	@Given("user launching testmeapp")
	public void user_launching_testmeapp() {
		 System.out.println("chrome browser is launched and testme app URL is entered");
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Desktop\\Workspace\\Cum-Ishu\\src\\main\\resources\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
	  
	}
	@When("user enter username as {string} And enter password as{string}")
	public void user_enter_username_as_And_enter_password_as(String un, String psd) {
		LoginPageObject lp=new LoginPageObject(driver);
		lp.un.sendKeys(un);
		lp.psd.sendKeys(psd);
	}

	@Then("click ok")
	public void click_ok() {
		LoginPageObject lp=new LoginPageObject(driver);
		lp.ok.click();
	}

	@Then("verify login result")
	public void verify_login_result() {
		System.out.println("verify login result");
	   
	}

}
