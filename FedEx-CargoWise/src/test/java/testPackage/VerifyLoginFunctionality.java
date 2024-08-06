package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pomPackage.LoginPage;


public class VerifyLoginFunctionality {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.webdriver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
	
		LoginPage loginpage = new LoginPage(driver);
		
//		loginpage.sendUserName(); // Navigational Steps called TestClass
//		loginpage.sendPassword();
//		loginpage.clickOnLogin();
		
		// OR
		
		loginpage.loginToFacebok(); // Navigational Steps called TestClass
		
	}

}
