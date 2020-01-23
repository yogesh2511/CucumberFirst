package CIVICA.CucumberFramework.stepDefination;

import org.openqa.selenium.By;

import CIVICA.CucumberFramework.testBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefination extends TestBase{

	@Given("^I am on the Login pahe URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_pahe_URL(String arg1) throws Throwable {
		//TestBase.intializeDriver("chrome");
	  driver.get(arg1);
	}

	@Then("^I should see Log In Page$")
	public void i_should_see_Log_In_Page() throws Throwable {
	 driver.getTitle();
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
	  driver.findElement(By.xpath("(//div[@class='input']//input)[1]")).sendKeys(arg1);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(arg1);
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		 driver.findElement(By.xpath("(//input[@value='Login'])[2]")).click();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	   
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
