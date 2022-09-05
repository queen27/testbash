package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class GetStaredOrder extends TestBase {
	
	@FindBy(xpath="//span[text()='Orders']") private WebElement OrdersBtn;
	@FindBy(xpath="//button[@class='button-blue']") private WebElement GetStartedBtn;
	@FindBy(xpath="//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']") private WebElement SearchBar;
	@FindBy(xpath="//span[@class='icon icon-search']") private WebElement SearchBtn;
	@FindBy(xpath="search-result-item selected isadded")private WebElement infyDropDown;
	@FindBy(xpath="//button[@data-balloon='Buy']") private WebElement buyBtn;
	@FindBy(xpath="//button[@data-balloon='Sell']") private WebElement sellBtn;
	@FindBy(xpath="//button[@data-balloon='Chart']") private WebElement chartBtn;
	@FindBy(xpath="//button[@data-balloon='Market depth widget']") private WebElement marketDepthBtn;
	@FindBy(xpath="//button[@class='button-outline']") private WebElement closeBtn;
	@FindBy(xpath="//button[@data-balloon='Added']") private WebElement AddedBtn;
	@FindBy(xpath="//span[text()='₹1,597.40']") private WebElement BseBtn ;
	@FindBy(xpath="//label[@class='su-switch-control']") private WebElement toggleBtn ;
	@FindBy(xpath="//input[@label='Qty.']") private WebElement Qunatity;
	@FindBy(xpath="//label[text()='Market']") private WebElement MarketBtn ;
	@FindBy(xpath="//span[text()='More options ']") private WebElement moreOptions;
	@FindBy(xpath="//a[@class='text-xxsmall dim']") private WebElement learnMore ;
	@FindBy(xpath="//button[@class='button-outline cancel']") private WebElement cancelBtn;
	@FindBy(xpath="//span[text()='GOLDBEES']") private WebElement  goldBees;
	//@FindBy(xpath="") private WebElement ;
	

	public GetStaredOrder() {
		PageFactory.initElements(driver, this);
	}
	public void verifyOrderBtn() throws Throwable {
		OrdersBtn.click();
		Thread.sleep(1000);
	}
	public void verifyGetStartedBtn() throws Throwable {
		GetStartedBtn.click();
		//Thread.sleep(1000);
		/*
		 * } public void verifySearchBar() throws Throwable { Thread.sleep(1000);
		 */
		  Actions act=new Actions(driver);
		 act.moveToElement(SearchBar).build().perform();
		 
		 
		//driver.getWindowHandle();
		SearchBar.click();
		//Thread.sleep(1000);
		SearchBar.sendKeys("infy");
	//	act.moveToElement(SearchBtn).build().perform();
		//SearchBtn.click();
		Thread.sleep(1000);
		infyDropDown.click();
	}
	public WebElement verifybuyBtn() throws Throwable {
		buyBtn.click();
		Thread.sleep(1000);
		return buyBtn;
		}
//	public void verifysellBtn() throws Throwable {
//		sellBtn.click();
//		Thread.sleep(1000);
//	}
	public void verifymarketDepthBtn() throws Throwable {
		marketDepthBtn.click();
		Thread.sleep(1000);
	}
	public void verifycloseBtn() throws Throwable {
		closeBtn.click();
		Thread.sleep(1000);
	}
	public void verifyAddedBtn() throws Throwable {
		AddedBtn.click();
		Thread.sleep(1000);
	}
	
	
	/*
	 * public void verifycloseBtn() { closeBtn.click(); }
	 */
}
