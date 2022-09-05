package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.TakeScreenshot;

public class CaptureScreenshot extends TestBase{
	LoginPage login;
	@BeforeMethod(groups="Sanity")
	public void setup() throws Throwable {
		initialization();
		 login = new LoginPage();
	}
	@Test
	public void test1()
	{
		//initialization();
	System.out.println("Application open sucessfully");
	//driver.close();
	}
	@Test(priority=-1,invocationCount=5,groups="Sanity")
	public void verifyTitleTest() 
	{
		
	
	String actTitle = login.verifyTitle();
	String expTitle = "1Kite - Zerodha's fast and elegant flagship trading platform";
	System.out.println(actTitle);
	Assert.assertEquals(actTitle, expTitle,"Title is wrong");
	//driver.close();
	}
	
	  @Test(/*dependsOnMethods="verifyTitleTest",*/priority=1/*,invocationCount=5*/)
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
			  TakeScreenshot takeScreenshot = new TakeScreenshot();
			takeScreenshot.captureScrreenshotFailedTC(driver, it.getName());
			  
		  }
		  driver.quit();
	  }
	
	@Test(enabled=true)
	  public void loginZerodhaAppTest() throws Throwable
	  {
		  login.loginZerodhaApp();
	  }	

}
