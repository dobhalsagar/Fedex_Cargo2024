package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	
	
	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement crateaccount;
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy (xpath = "//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@name='reg_passwd__']")
	private WebElement password;
	
	@FindBy (xpath = "//select[@id='day']")
	private WebElement day;
	
	@FindBy (xpath = "//select[@id='month']")
	private WebElement month;
	
	@FindBy (xpath = "//select[@id='year']")
	private WebElement year;
	
	@FindBy (xpath = "(//input[@name='sex'])[2]")
	private WebElement radiomale;
	
	@FindBy (xpath = "(//button[text() = 'Sign Up'])[1]")
	private WebElement signupbut;
	
	public SignupPage(WebDriver driver1) // driver1 = driver = ChromeDriver()
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void signupToFacebook()
	{
		crateaccount.click();
		firstname.sendKeys("Shree");
		lastname.sendKeys("Ram");
		email.sendKeys("ramlalla@srjbts.com");
		password.sendKeys("214214214");
		
		Select a = new Select(day);
		 a.selectByIndex(21);
		Select b = new Select(month); 
		 b.selectByValue("1");
		Select c = new Select(year);
		 c.selectByVisibleText("2024");
		
		radiomale.click();
		signupbut.click();
		
	}

}
