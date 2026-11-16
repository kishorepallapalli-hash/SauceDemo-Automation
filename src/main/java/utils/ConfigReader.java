package utils;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop = new Properties();
	public  ConfigReader() {
		
		try {
			FileInputStream file = new FileInputStream("src/main/resources/Config.properties");
		prop.load(file);
		
		}catch(Exception e) {
			e.fillInStackTrace();
		}
	
	}
	
	public String getproperty(String key) {
		return prop.getProperty(key);
	}
	
}
