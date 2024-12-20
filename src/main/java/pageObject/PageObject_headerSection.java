package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class PageObject_headerSection extends BaseClass{
	
	@FindBy(xpath = "//li[@id='menu-item-278']/a")
	public WebElement Blog_drp;
	
	@FindBy(xpath = "//li[@id='menu-item-2612']/a")
	public WebElement Extra_lnk;
	
	@FindBy(xpath = "//li[@id='menu-item-2615']/a")
	public WebElement Job_drp;
	
	@FindBy(xpath = "//li[@id='menu-item-2622']/a")
	public WebElement Money_drp;
	
	@FindBy(xpath = "//li[@id='menu-item-2628']/a")
	public WebElement NAREGA_drp;
	
	@FindBy(xpath = "//li[@id='menu-item-2634']/a")
	public WebElement Socially_drp;
	
	@FindBy(xpath = "//li[@id='menu-item-2639']/a")
	public WebElement Scheme_drp;
	
	@FindBy(xpath = "//li[@id='menu-item-2647']/a")
	public WebElement PrivacyPolicy_lnk;
	
	@FindBy(xpath = "//li[@id='menu-item-2651']/a")
	public WebElement Terms_conditions_lnk;
	
	@FindBy(xpath = "//li[@id='menu-item-2650']/a")
	public WebElement Disclaimer_lnk;
	
	@FindBy(xpath = "//li[@id='menu-item-2648']/a")
	public WebElement About_us_lnk;
	
	@FindBy(xpath = "//li[@id='menu-item-2649']/a")
	public WebElement Contact_us_lnk;
	
	@FindBy(xpath = "//li[@id='menu-item-2656']/a")
	public WebElement Categories_lnk;
	
	@FindBy(xpath = "//li[@id='menu-item-2661']/a")
	public WebElement NAREGA_panchayat_lnk;
	
	public PageObject_headerSection(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
