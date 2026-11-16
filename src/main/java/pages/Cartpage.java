package pages;

import org.openqa.selenium.By;

import utils.WaitHelper;
import base.BaseClass;
public class Cartpage extends BaseClass {

	private By checkout = By.xpath("//button[.='Checkout']");

	WaitHelper wait = new WaitHelper(driver);
	
	public void checkoutProduct() {
		wait.waitForVisibility(checkout).click();
	}

}
