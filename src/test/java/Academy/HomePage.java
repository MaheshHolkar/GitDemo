package Academy;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws Exception {
		driver = initializeDriver();
		log.info("Dirver is Initialized");
		
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String UserName,String password,String text) throws Exception{
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = l.getLogin();
		
		
		lp.getEmail().sendKeys(UserName);
		lp.getPassword().sendKeys(password);
		log.info(text);
	

		ForgotPassword fp= lp.forgotPassword();
		fp.getEmail().sendKeys("xxx");
		fp.sendMeInstructions().click();
		
	}
	@DataProvider
	public Object[][] getData() {
		//rows stands for how many different data types test should run
		//columns stands for how many values per each test
		Object[][] data = new Object[2][3];
		//0th row
		
		data[0][0] ="nonrestricteduser@gmaj.com";
		data[0][1]= "sd2323";
		data[0][2]="Restricted User";
		
		data[1][0] ="Invaliduser@gmaj.com";
		data[1][1]= "sd232df3";
		data[1][2]="UNRestricted User";
		
		return data;
	
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
