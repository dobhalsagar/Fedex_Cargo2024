//POM we are using to avoid steal exception 
//when we are click on login that time web page get load thats why steal exception there

package pomPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver2; // globally declare driver as variable should be private and non static
	
	@FindBy (xpath = "//input[@id='email']")
	 private WebElement username ;
	
	@FindBy (xpath = "//input[@id='pass']")
	 private WebElement password ;
	
	@FindBy (xpath = "//button[@name='login']")
	 private WebElement loginButton ;
	
	public LoginPage(WebDriver driver1) // driver1 = driver = ChromeDriver()
	{
		this.driver2 = driver1; // we assigning driver1 as value to global variable driver
		
		PageFactory.initElements(driver1, this); //initElemnts inspect element two times when we create -
		                                         // - object, to avoid steal exception. 
	}
   
	public void sendUserName()
	{
		Alert alt = driver2.switchTo().alert(); //if we need driver in POM class Method then we need 
		   alt.accept();                                     // - to declare globally declare driver in POM class
		username.sendKeys("abc@gmail.com");
	}
	
	public void sendPassword()
	{
		password.sendKeys("199123898");
	}
	
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
	public void loginToFacebok()
	{
		username.sendKeys("abc@gmail.com");
		password.sendKeys("199123898");
		loginButton.click();
		
		
	}
}
