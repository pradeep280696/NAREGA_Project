package interfaceBody;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;
import actionInterface.ActionInterface1;

public class ActionBody1 extends BaseClass implements ActionInterface1{

	@Override
	public void implicityWait(WebDriver driver, int timeOut) {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Override
	public void ScrollByVisiblityOfElement(WebDriver driver, WebElement element) {
		
		
	}

	@Override
	public boolean isDisplayed(WebDriver driver, WebElement element) {
		
		return false;
	}

	@Override
	public void disable_advertisement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	}

	@Override
	public void explicityWait(WebElement element) {
		
		 WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wt.until(ExpectedConditions.visibilityOf(element));
	}

	@Override
	public void assertTrue(boolean element) {
		assertTrue(element);
		
	}

	@Override
	public void assertFalse(boolean element) {
		assertFalse(element);
		
	}

	

}
