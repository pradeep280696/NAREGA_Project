package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class PageObject_NotificationPopup extends BaseClass{
	
	@FindBy(xpath = "//div[@class='perfecty-push-dialog-title']/font/font")
	public WebElement do_you_want_Receive_Notifcation_message;
	
	@FindBy(id="perfecty-push-dialog-cancel")
	public WebElement Receive_notification_message_Cancel_btn;
	
	@FindBy(id="perfecty-push-dialog-subscribe")
	public WebElement Receive_notification_message_Accept_btn;
	
	public PageObject_NotificationPopup(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
