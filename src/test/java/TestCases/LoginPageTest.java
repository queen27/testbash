package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.TakeScreenshot;

public class LoginPageTest extends TestBase{
	//LoginPage login = new LoginPage();
	LoginPage login;
	@BeforeMethod(groups="Sanity")
	public void setup() throws Throwable {
		initialization();
		 login = new LoginPage();
	}
	 @Test(enabled=true)      
	  public void loginZerodhaAppTest() throws Throwable
	  {
		  login.loginZerodhaApp();
	  }	
	 
	@Test
	public void test1()
	{
		//initialization();
	System.out.println("Application open sucessfully");
	//driver.close();
	}
	//@Test(priority=-1,invocationCount=5,groups="Sanity")
	@Test
	public void verifyTitleTest() 
	{
		
	
	String actTitle = login.verifyTitle();
	String expTitle = "1Kite - Zerodha's fast and elegant flagship trading platform";
	System.out.println(actTitle);
	Assert.assertEquals(true, false);
	//driver.close();
	}
	
	  //@Test(/*dependsOnMethods="verifyTitleTest",*/priority=1/*,invocationCount=5*/)
	@Test
	  public void verifyKiteLogoTest() 
	  { 
		
	  String result=login.verifyKiteLogo(); 
	  System.out.println(result); 
	  //driver.close();
	  }
	  @Test(enabled=true,priority=3)
	  public void verifyZerodhaLogoTest() {
		  boolean result=login.verifyzerodhaLogo();
		Assert.assertEquals(result, true);  
	  }
	  @AfterMethod
	  public void exit(ITestResult it) throws IOException
	  {
		
		  if(ITestResult.FAILURE==it.getStatus()) {
		  TakeScreenshot.captureScrreenshotFailedTC(driver, it.getName());
		  }
		  driver.close();
	  }
		
	
	  

}
	  