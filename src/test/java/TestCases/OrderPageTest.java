package TestCases;

import java.util.Iterator;
import java.util.Set;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.OrderPage;

public class OrderPageTest extends TestBase{
LoginPage login;
Dashboard dash;
OrderPage order;
@BeforeMethod
public void setup() throws Throwable {
	initialization();
	login=new LoginPage();
	 dash = new Dashboard();
	 order=new OrderPage();
	login.loginZerodhaApp();
}
@Test
public void verifyviewHistoryTest() throws InterruptedException {
	order.verifyviewHistory();
	Set<String> win = driver.getWindowHandles();
	 Iterator<String> itr = win.iterator();
	String windows[]=new String[5];
	for(int i=0;i<win.size();i++) {
		windows[i]=itr.next();
	}
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(windows[1]);
	Thread.sleep(1000);
	driver.close();
	
} 
/*
 * @Test public void exit() { driver.close(); }
 */


}
