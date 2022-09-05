package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Dashboard extends TestBase {
	@FindBy(xpath="//span[@class='nickname']") private WebElement nickNameLabel;
	@FindBy(xpath="//span[@class='user-id']") private WebElement userIdLabel;
	@FindBy(xpath="//div[@class='avatar']") private WebElement bvBtn;
	@FindBy(xpath="//h4[@class='username']") private WebElement userNameLabel;
	@FindBy(xpath="//div[@class='email']") private WebElement eamilidLabel;
	
	@FindBy(xpath="//span[@class='icon icon-exit']") private WebElement logOutLink;
	@FindBy(xpath="//button[text()='Start investing ']")private WebElement startInvClick;
	@FindBy(xpath="//button[text()='Get started ']") private WebElement getStartedBtn;
	@FindBy(xpath="//a[@class='router-link-exact-active router-link-active']") private WebElement Orders;
	@FindBy(xpath="//a//span[text()='GTT']") private WebElement GTT;
	@FindBy(xpath="//a//span[text()='Baskets']") private WebElement Baskets;
	@FindBy(xpath="//a//span[text()='SIP']") private WebElement SIP;
	@FindBy(xpath="//a//span[text()='Alerts']") private WebElement Alerts;
	@FindBy(xpath="//a//span[text()='IPO']") private WebElement IPO;
	public Dashboard() {
		PageFactory.initElements(driver,this);
	}
	
		public String verifyNickName() throws InterruptedException {
			Thread.sleep(1000);
			return nickNameLabel.getText();
		
		
		}	
			
		
			
		
		public String verifyUserId() throws InterruptedException {
			Thread.sleep(1000);
			return userIdLabel.getText();
		
		
		}	
		

		public String verifyUserName() throws InterruptedException {
			// TODO Auto-generated method stub
			
			
			Thread.sleep(1000);
			bvBtn.click();
			return userNameLabel.getText();
		}	
			
		
		public String verifyEmailId() throws InterruptedException {
		Thread.sleep(1000);
		bvBtn.click();
			return eamilidLabel.getText();
		
		
		}	

			public String verifystartInvClick() throws InterruptedException {
				// TODO Auto-generated method stub
				Thread.sleep(1000);
				return startInvClick.getText();
			}

			public String verifygetStartedBtn() throws InterruptedException {
				// TODO Auto-generated method stub
				Thread.sleep(1000);
				return getStartedBtn.getText();
			}

			
			public String verifylogOutLink() throws InterruptedException {
				Thread.sleep(1000);
				bvBtn.click();
				return logOutLink.getText();
			}
			

			public String verifyOrders() throws InterruptedException {
				Thread.sleep(1000);
				return Orders.getText();
	
			}

			/*
			 * public String verifyGTT() throws InterruptedException { Thread.sleep(1000);
			 * return GTT.getText(); }
			 */
			public String verifyBaskets() throws InterruptedException {
				Thread.sleep(1000);
				return Baskets.getText();
			}
			public String verifySIP() throws InterruptedException {
				Thread.sleep(1000);
				return SIP.getText();
			}
			public String verifyAlerts() throws InterruptedException {
				Thread.sleep(1000);
				return Alerts.getText();
			}
						
}
