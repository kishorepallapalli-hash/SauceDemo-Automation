package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import base.BaseClass;
//import utils.ConfigReader;
import utils.WaitHelper;

public class Loginpage extends BaseClass {
	
	private By enterusername = By.id("user-name");
	private By enterpassword = By.xpath("//input[@id='password']");
	private By loginbutton = By . xpath("//input[@id='login-button']");
	
	WaitHelper wait = new WaitHelper(driver);
	
	public void loginsetup(String username , String password) {
		
		wait.waitForVisibility(enterusername).sendKeys(username);
		
		wait.waitForVisibility(enterpassword).sendKeys(password);
		wait.waitForVisibility(loginbutton).click();
		
	}

}
