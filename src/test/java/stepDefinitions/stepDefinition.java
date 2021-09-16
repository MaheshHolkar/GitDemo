package stepDefinitions;



import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


@RunWith(Cucumber.class)
public class stepDefinition extends base{ 
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver = initializeDriver();
	    }
	 @And("^navigate to Site \"([^\"]*)\"$")
	    public void navigate_to_site_something(String strArg1) throws Throwable {
		 driver.get(strArg1);
	    }


	 @Given("^click on Login link in home page to land secure sign in Page $")
	    public void click_on_login_link_in_home_page_to_land_secure_sign_in_page() throws Throwable {
		 LandingPage l = new LandingPage(driver);
		 l.getLogin();
	    }

	 @When("^User Enter \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	    public void user_enter_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
		 LoginPage lp = l.getLogin();
			
			lp.getEmail().sendKeys(strArg1);
			lp.getPassword().sendKeys(strArg2);
			lp.getLogin().click();
	    }

	    @Then("^Verify that user is successfully logged in $")
	    public void verify_that_user_is_successfully_logged_in() throws Throwable {
	     
	    }

	  

}
