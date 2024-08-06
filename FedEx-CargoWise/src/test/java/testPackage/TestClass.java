package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	
	@BeforeClass
	public void beforeclass(){
		
		System.out.println(" Before Class");
		
	}
	
	@BeforeMethod
	public void beforemethod(){
		
		System.out.println(" Before Method");
		
	}
	
	@Test (priority = 1) //Execute 3rd
	public void testA(){
		
		System.out.println(" Test Method A");
		
	}
	
	@Test (priority = 0)//Execute 2nd 
	public void testB(){
		
		System.out.println(" Test Method B");
		
	}
	
	@Test (invocationCount = 2,priority = -1) //Execute 1st with invocation count Execute 2 times
	

	public void testC(){
		
		System.out.println(" Test Method C");
		
	}
	
	@Test (invocationCount = -1) //if we give invocationCount = -1 so it will skip that test
	public void testD(){
		
		System.out.println(" Test Method D");
		
	}
	
	@Test (dependsOnMethods = {"testB"}) //this testE method depends on testB so it will execute last
	public void testE(){
		
		System.out.println(" Test Method E");
		
	}
	
	@Test (enabled = false) // this will not count this method at the time of compilation (out of execution)
	public void testF(){
		
		System.out.println(" Test Method F");
		
	}
	
	@Test (timeOut = 3000) // If this test method not execute within 3 second then it will timeout and failed
	public void testG(){
		
		System.out.println(" Test Method G");
		
	}

	@AfterMethod
	public void aftermethod(){
		
		System.out.println(" After Method");
		
	}

	@AfterClass
	public void afterclass(){
		
		System.out.println(" After Class");
		
	}
	
}



