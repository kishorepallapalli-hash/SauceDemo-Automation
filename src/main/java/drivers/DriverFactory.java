package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	
		public WebDriver Instalizedriver(String browser) {
			WebDriver driver = null;
		
		try {
			switch(browser.toLowerCase()){
			case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver();
			break;
			case "firebox":
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options1 = new FirefoxOptions();
				options1.addArguments("--disable-notifications");
				driver = new FirefoxDriver();
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				EdgeOptions options2 = new EdgeOptions();
				options2.addArguments("--disable-notifications");
				driver = new EdgeDriver();
				break;
				
				default:
					throw new RuntimeException("browser not supported:"+ browser);
			}
		}
				
			
				
			catch(Exception e) {
				System.out.println("failed browser excpection:"+ browser);
				e.printStackTrace();
			}
				
			
			return driver;
			
		}

	}


