package pages;
import org.openqa.selenium.By;

import base.BaseClass;
import utils.WaitHelper;
public class Paymentpage extends BaseClass{

	private By finish = By.xpath("//button[.='Finish']");
	
	WaitHelper wait = new WaitHelper(driver);
	
	public void orderconfirm() {
		wait.waitForVisibility(finish).click();
		String title =driver.getTitle();
		System.out.println("Title:"+title);
	}
	
}
