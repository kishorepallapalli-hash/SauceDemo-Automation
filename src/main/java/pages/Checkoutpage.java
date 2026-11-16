package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import utils.WaitHelper;

public class Checkoutpage extends BaseClass {

	private By Firstname = By.id("first-name");
	
	private By Lastname = By.id("last-name");
	private By Postalcode = By.id("postal-code");
	private By continoue = By.name("continue");
	WaitHelper wait = new WaitHelper(driver);
	public void Details(String firstname , String lastname , String postalcode) {
		wait.waitForVisibility(Firstname).sendKeys(firstname);
		wait.waitForVisibility(Lastname).sendKeys(lastname);
		wait.waitForVisibility(Postalcode).sendKeys(postalcode);
		wait.waitForVisibility(continoue).click();
	}
	
}
