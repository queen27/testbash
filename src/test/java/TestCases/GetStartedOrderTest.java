package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.GetStaredOrder;
import Pages.LoginPage;
import Pages.OrderPage;

public class GetStartedOrderTest extends TestBase{
LoginPage login;
GetStaredOrder getorder;
OrderPage order;
@BeforeMethod
public void setup() throws Throwable {
	initialization();
	login=new LoginPage();
	getorder=new GetStaredOrder();
	order=new OrderPage();
	login.loginZerodhaApp();
	
}

  @Test 
  public void verifyGetStartedTest() throws Throwable {
  //driver.switchTo().alert(); 
  getorder.verifyOrderBtn();
  getorder.verifyGetStartedBtn();
  
 
 // getorder.verifySearchBar();

  getorder.verifybuyBtn();
  getorder.verifycloseBtn();
  getorder.verifymarketDepthBtn();
  
  }
 // @Test
	/*
	 * @AfterMethod public void exit() { driver.close(); }
	 */
 

}
