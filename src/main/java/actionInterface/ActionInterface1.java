package actionInterface;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterface1{
	
	
	public void implicityWait(WebDriver driver, int timeOut);
	public void explicityWait(WebElement element);
	public void ScrollByVisiblityOfElement(WebDriver driver, WebElement element);
	public boolean isDisplayed(WebDriver driver, WebElement element);
	public void disable_advertisement();
	public void assertTrue(boolean b);
	public void assertFalse(boolean element);

}
