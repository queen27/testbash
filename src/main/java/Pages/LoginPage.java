package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadProperty;

public class LoginPage extends TestBase{
	@FindBy(xpath = "//input[@id='userid']") private WebElement userIdTextbox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath = "//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	@FindBy(xpath = "//input[@id='pin']") private WebElement userPin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueBtn;
	@FindBy(xpath="//div[@class='form-header text-center']") private WebElement loginLabel;
	public LoginPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	
	//login
	/*
	 * public void LoginZerodhaAppp() throws InterruptedException {
	 * userIdTextbox.sendKeys("OCV426"); passwordTextbox.sendKeys("Bhavana@27");
	 * loginBtn.click(); Thread.sleep(2000); userPin.sendKeys("271094");
	 * continueBtn.click(); }
	 */
	public void loginZerodhaApp() throws Throwable {
		userIdTextbox.sendKeys(ReadProperty.readPropertyFile("userId"));
		passwordTextbox.sendKeys(ReadProperty.readPropertyFile("password"));
		loginBtn.click();
		Thread.sleep(1000);      
		userPin.sendKeys(ReadProperty.readPropertyFile("pin"));
		continueBtn.click();
		
	}
	public String verifyTitle()
	{
	return driver.getTitle(); //Title
	}
	
	public String verifyKiteLogo()
	{
	return kiteLogo.getText();
	}
	/*
	 * public boolean verifyKiteLogo() { return kiteLogo.isDisplayed(); }
	 */
	public boolean verifyKiteLabel()
	{
		return loginLabel.isDisplayed();
	}	
	public boolean verifyzerodhaLogo() {
		return zerodhaLogo.isDisplayed();
	}
}
