package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pomPackage.SignupPage;

public class VerifySignupFunctionality {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.webdriver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		SignupPage signup = new SignupPage(driver);
		signup.signupToFacebook(); // Navigational Steps called TestClass
		
			
	}	
}
