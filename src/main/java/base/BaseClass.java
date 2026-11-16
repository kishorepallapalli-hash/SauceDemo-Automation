package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import util.ConfigReader;
import util.DriverFactory;
public class BaseClass {

	public static WebDriver driver;
	
	ConfigReader cr = new ConfigReader();
	DriverFactory df = new DriverFactory();
	
	@BeforeMethod
	public void setup() {
		driver = df.initializeDriver(cr.getProperty("browser"));
		driver.manage().window().maximize();
		driver.get(cr.getProperty("url"));
		
		
	}
	@AfterMethod
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
}
