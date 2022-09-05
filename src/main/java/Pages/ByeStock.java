package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ByeStock extends TestBase {
	@FindBy(xpath="//span[text()='GOLDBEES']") private WebElement  goldBees;
	@FindBy(xpath="//button[@class='button-blue buy']") private WebElement buyBtn;
	@FindBy(xpath="//button[@class='submit']") private WebElement buysubBtn;
	@FindBy(xpath="//label[@class='su-switch-control']") private WebElement toggleSellBtn;
	@FindBy(xpath="//label[@class='su-switch-control']") private WebElement toggleBuyBtn;
	@FindBy(xpath="//input[@label='Qty.']") private WebElement labelQty;
	@FindBy(xpath="//input[@label='Price']") private WebElement labelPrice;
	@FindBy(xpath="//input[@label='Trigger price']") private WebElement labelTriggerPrice;
	@FindBy(xpath="//label[text()='Market']") private WebElement marketBtn;
	@FindBy(xpath="//button[@class='button-outline cancel']") private WebElement cancelBtn;
	
	public ByeStock() {
		PageFactory.initElements(driver, this);
	}

	public void verifyGoldBees() throws Throwable {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(goldBees).build().perform();
		buyBtn.click();
act.moveToElement(buysubBtn).build().perform();
	buysubBtn.click();
	/*
	 * for(int i=0;i<50;i++) { act.moveToElement(toggleSellBtn).build().perform();
	 * toggleSellBtn.click(); act.moveToElement(toggleBuyBtn).build().perform();
	 * toggleBuyBtn.click();}
	 */
	act.moveToElement(labelQty).build().perform();
	
	  for(int i=0;i<25;i++) 
	  { 
		  labelQty.sendKeys(Keys.ARROW_UP);
	  }
	  labelQty.sendKeys(Keys.ENTER);
	  for(int i=0;i<3;i++) {
	  labelPrice.sendKeys(Keys.ARROW_UP);
	  } 
	  labelPrice.sendKeys(Keys.ENTER);
	  for(int i=0;i<3;i++) 
	  {
		  labelPrice.sendKeys(Keys.ARROW_UP); 
	  }
	  labelPrice.sendKeys(Keys.ENTER);
	  
	  marketBtn.click(); cancelBtn.click();
	 
		}
	}

