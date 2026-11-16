package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;
import drivers.DriverFactory;
public class BaseClass {

	public static WebDriver driver;
	
	ConfigReader cr = new ConfigReader();
	DriverFactory df = new DriverFactory();
	
	@BeforeMethod
	public void setup() {
		driver = df.Instalizedriver(cr.getproperty("browser"));
		driver.manage().window().maximize();
		driver.get(cr.getproperty("url"));
		
		
	}
	@AfterMethod
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
}
