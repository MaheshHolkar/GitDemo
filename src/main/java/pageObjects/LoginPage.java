package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver ;
	By Email = By.cssSelector("#user_email");
		By Password = By.cssSelector("#user_password");
	By Login = By.cssSelector("input[name='commit']");
 By forgotPassword = By.cssSelector(".link-below-button");

public ForgotPassword forgotPassword()
{
	driver.findElement(forgotPassword).click();
	return new ForgotPassword(driver);
	
}
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmail() {
		return 	driver.findElement(Email);
		}
	public WebElement getPassword() {
		return 	driver.findElement(Password);
		}
	
	public WebElement getLogin() {
		return 	driver.findElement(Login);
		}
	
}
