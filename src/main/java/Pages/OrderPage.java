package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase{

	@FindBy(xpath="//span[text()='Orders']") private WebElement Orders;
	
	@FindBy(xpath="//button[@class='button-blue']") private WebElement getStarted;
	@FindBy(xpath="//a[@class='inline-image-text']") private WebElement viewHistory ;
	@FindBy(xpath="//button[@class='button-outline']")private WebElement closeBtn;
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifygetStarted() {
		return getStarted.getText();
	}
	public void verifyviewHistory() {
		Orders.click();
		viewHistory.click();
	}

}
