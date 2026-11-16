package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import utils.WaitHelper;

public class Productpage extends BaseClass{

	
		private By bikelight = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	private By tshirt = By .xpath("//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']");
	private By addtocart = By.xpath("//div[@id='shopping_cart_container']/child::a");
	WaitHelper wait = new WaitHelper(driver);
	public void SelectProducts() {
		wait.waitForVisibility(bikelight).click();
		wait.waitForVisibility(tshirt).click();
		wait.waitForVisibility(addtocart).click();
	}

}
