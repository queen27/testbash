package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Dashboard;
import Pages.LoginPage;
import Utility.TakeScreenshot;

public class dashboardPageTest extends TestBase {
	Dashboard dash;
LoginPage login;
@BeforeMethod(groups= {"Sanity","Regression","Functional"})
public void setup() throws Throwable {
	initialization();
	login=new LoginPage();
	dash=new Dashboard(); 
	login.loginZerodhaApp();
}


@Test(groups="Sanity")
public void verifyNickNameTest() throws Throwable {
	//Thread.sleep(1000);
	String value1=dash.verifyNickName();
	System.out.println(value1);
	}
@Test(groups="Sanity")
public void verifyUserIdTest() throws Throwable {
	//Thread.sleep(1000);
	String value=dash.verifyUserId();
	System.out.println(value);
	}
@Test(groups= {"Regression","Sanity"})
public void verifyUserNameTest() throws Throwable {
	String value=dash.verifyUserName();
	System.out.println(value);
}
@Test(groups="Functional")
public void verifyEmailIdTest() throws Throwable {
	//Thread.sleep(1000);
	String value=dash.verifyEmailId();
	System.out.println(value);
	}
@Test (groups= {"Regression","Sanity"})

public void verifystartInvClickTest() throws Throwable {
	String value=dash.verifystartInvClick();
	System.out.println(value);
	Assert.assertEquals(true, false);
	
}
@Test(groups= {"Functional","Sanity"})
public void verifygetStartedBtnTest() throws Throwable {
	String value=dash.verifygetStartedBtn();
	System.out.println(value);
}
@Test(groups= {"Regression","Functional"})
public void verifylogOutLinkTest() throws Throwable {
	String value=dash.verifylogOutLink();
	System.out.println(value);
}
public void verifyOrdersTest() throws Throwable {
	String value=dash.verifyOrders();
	System.out.println(value);
}
//@Test
/*
 * public void verifyGTTTest() throws Throwable { String value=dash.verifyGTT();
 * System.out.println(value);
 * 
 * }
 */
public void verifyBasketsTest() throws Throwable {
	String value=dash.verifyBaskets();
	System.out.println(value);
}
public void verifySIPTest() throws Throwable {
	String value=dash.verifySIP();
	System.out.println(value);
}
public void verifyAlertsTest() throws Throwable {
	String value=dash.verifyAlerts();
System.out.println(value);	
}
@AfterMethod
public void exit(ITestResult it) throws IOException {
	 if(ITestResult.FAILURE==it.getStatus()) {
		  TakeScreenshot.captureScrreenshotFailedTC(driver, it.getName());
		  }
	driver.close();
}

}
