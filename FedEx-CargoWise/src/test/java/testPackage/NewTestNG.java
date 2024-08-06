package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.Base;

public class NewTestNG extends Base {
	
	private WebDriver driver;
	
	
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println(" Before Suit");
	}
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser)
	{
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = openChromeBrowser();
		}
		else
		{
			driver = openFirefoxBrowser();
		}
	}
	
	@BeforeClass
	public void beforeClass()
	{	
		System.out.println(" Before Class");	
	}
	
	@BeforeMethod
	public void beforemethod()
	{	
		System.out.println(" Before Method");	
	}
	
	@Test 
	public void testMethodA()
	{
		System.out.println(" Test Method A ");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println(" After Method");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println(" After Class");
	}
	

	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	
	@AfterSuite
	public void afterSuit()
	{
		System.out.println(" After Suit");
	}
	

}
