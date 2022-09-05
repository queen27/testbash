package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import Utility.ReadExcel;
import Utility.ReadProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	// TODO Auto-generated method stub
	public static WebDriver driver;
	/*
	 * public void initialization() { System.setProperty("webdriver.chrome.driver",
	 * "C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\chromedriver.exe"
	 * ); driver=new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://kite.zerodha.com/"); }
	 */
	public void initialization() throws Throwable {
		//String browserValue=readPropertyFile("browser");
		String browserValue=ReadProperty.readPropertyFile("browser");
		
		if(browserValue.equals("chrome")) {
			System.setProperty("webdriver.driver.chrome", "C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browserValue.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserValue.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(ReadProperty.readPropertyFile("url"));
		driver.get(ReadExcel.readExcelFile(0,0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
	
	
}
