package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	private By signin =By.cssSelector("a[href*='sign_in']");
	private By Title =By.cssSelector("div.pull-left>h2");
	private	By NavBar =By.cssSelector("div[class='nav-outer clearfix'] ul[class='navigation clearfix']");
	private By header =By.cssSelector("div[class*='col-md-6 text-left'] h2");
	public LandingPage(WebDriver driver) {
		this.driver =driver;
	}
	public LoginPage getLogin() {
		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	}
	public WebElement getTitle() {
		return driver.findElement(Title);
	}
	public WebElement getNavigationBar() {
	
		return driver.findElement(NavBar);
	}
	public WebElement getHeader() {
		return driver.findElement(header);
	}
	
}
