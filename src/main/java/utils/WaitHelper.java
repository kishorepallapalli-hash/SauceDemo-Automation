package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	WebDriver Driver;
	
	public WaitHelper(WebDriver driver) {
	    this.Driver = driver;
	}
	public WebElement waitForVisibility(By locator) {
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(15));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

	}


