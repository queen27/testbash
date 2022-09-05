package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ByeStock;
import Pages.LoginPage;

public class ByeStocktest extends TestBase {
LoginPage login;
ByeStock stock;
@BeforeMethod
public void setup() throws Throwable {
	initialization();
	login=new LoginPage();
	stock=new ByeStock();
	login.loginZerodhaApp();
}
@Test
public void verifyGoldBeesTest() throws Throwable  {
stock.verifyGoldBees();
}
/*
 * @AfterMethod public void exit() { driver.close(); }
 */
}
