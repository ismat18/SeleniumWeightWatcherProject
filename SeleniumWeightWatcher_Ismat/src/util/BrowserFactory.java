package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url){
		
		
		 if(browserName.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:/Auto/chromedriver.exe");
			 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Me\\git\\Selenium_pageobject12\\Copy of WordpressDemo\\drivers\\chromedriver.exe");

			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

			 
			 driver = new ChromeDriver();
		}
		
		driver.get(url);
		
		return driver;
	}
	
	

}
