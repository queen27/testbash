package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

@Test
public void openFB() {
	
	System.setProperty("webdriver.driver.chrome", "C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.close();
}	
@Test
public void openKite() {
	System.setProperty("webdriver.driver.chrome", "C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
driver.close();
}	
@Test
public void openGoogle() {
	System.setProperty("webdriver.driver.chrome", "C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.close();
}	
@Test
public void openLinkedIn() {
	System.setProperty("webdriver.driver.chrome", "C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
driver.manage().window().maximize();
driver.get("https://www.linkedin.com/signup");
driver.close();
}	
}
