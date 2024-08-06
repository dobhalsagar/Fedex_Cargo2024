package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	 
	
	public static WebDriver openChromeBrowser() {
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        return driver;
	}
	
     public static WebDriver openFirefoxBrowser() {
		
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
        return driver;
	}
	

}
