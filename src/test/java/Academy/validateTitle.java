package Academy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;


import org.testng.Assert;
public class validateTitle extends base{
	public WebDriver driver;
	LandingPage l;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws Exception {
		driver = initializeDriver();
		log.info("Dirver is Initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}

	@Test
	public void ValidateAppTitle() throws Exception{
		
		
		 l = new LandingPage(driver);
	
		Assert.assertEquals(l.getTitle().getText(),"Featured Courses123");
		log.info("Successfully validated Text Message ");
		System.out.println("Test completed");
		//Assert.Asserttr
		
		
	}
	@Test
	public void ValidateHeader() throws Exception{
		
		
	 l = new LandingPage(driver);
	
		Assert.assertEquals(l.getHeader().getText(),"An Academy to Learn Earn & Shine  in your QA Career");
		log.info("Successfully validated Text Message ");
		System.out.println("Test completed");
		//Assert.Asserttr
		
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
