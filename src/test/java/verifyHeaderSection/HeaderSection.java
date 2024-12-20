package verifyHeaderSection;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseClass;
import actionInterface.ActionInterface1;
import interfaceBody.ActionBody1;
import pageObject.PageObject_NotificationPopup;
import pageObject.PageObject_headerSection;


public class HeaderSection extends BaseClass{
	
	
	@Test
	public void Verify_Header_Section_button() throws InterruptedException
	{
		PageObject_headerSection hd = new PageObject_headerSection(driver);
		PageObject_NotificationPopup pop = new PageObject_NotificationPopup(driver);
	    ActionInterface1 act1 = new ActionBody1();

	
	    act1.explicityWait(pop.do_you_want_Receive_Notifcation_message);
		 pop.Receive_notification_message_Cancel_btn.click();
		 Thread.sleep(8000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");  
		 
		hd.Extra_lnk.isDisplayed();
		hd.Extra_lnk.click();
		
		hd.Job_drp.isDisplayed();
		hd.Job_drp.click();
		
		hd.Money_drp.isDisplayed();
		hd.Money_drp.click();
		
		hd.NAREGA_drp.isDisplayed();
		hd.NAREGA_drp.click();
		
		hd.Scheme_drp.isDisplayed();
		hd.Scheme_drp.click();
		
		hd.Socially_drp.isDisplayed();
		hd.Socially_drp.click();
		
		hd.PrivacyPolicy_lnk.isDisplayed();
		hd.PrivacyPolicy_lnk.click();
		
		hd.Terms_conditions_lnk.isDisplayed();
		hd.Terms_conditions_lnk.click();
		
		hd.Contact_us_lnk.isDisplayed();
		hd.Contact_us_lnk.click();
		
	}

}
