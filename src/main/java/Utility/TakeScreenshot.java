package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class TakeScreenshot {
	public static void captureScrreenshotFailedTC(WebDriver driver,String methodName) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dect=new File("C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\Screenshot\\" + methodName + ".png");
		FileHandler.copy(src, dect);
	}
}
