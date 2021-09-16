package Academy;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//Adding Logs
//Generating Html reports
//screen shots on failure
//jenkin iNtegration

public class validateNavigationBar extends base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws Exception {
		driver = initializeDriver();
		log.info("Dirver is Initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}

	@Test
	public void basePageNavigation() throws Exception{
	
		//One is inheritance
		//creating object of thaaat class and invoke method of it
		LandingPage l = new LandingPage(driver);
	//	driver.findElement(l.NavBar); //not allowed so we declared as private not coding standard
		//compare the text from the browser with actual text - Error..
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Navigation bar is displayed");
		
	//	Assert.assertFalse(false);
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
