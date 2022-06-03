package POMClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderHomePage {

		
	@FindBy (xpath = "")
	private WebElement timeTrack;
	
	@FindBy (xpath = "")
	private WebElement tasks;

	@FindBy (xpath = "")
	private WebElement reports;
	
	@FindBy (xpath = "")
	private WebElement users;
	
	@FindBy (xpath ="//div[@class='itemsContainer']")
	private WebElement itemsContainer;
	
	public HeaderHomePage (WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public void clickontimeTrack () 
	{
	timeTrack.click();
	}
	public void clickontasks () 
	{
	timeTrack.click();
	}
	public void FinditemsContainer()
	{
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true);", itemsContainer);
	}
	public void clickonreports () 
	{
	reports.click();
	}
	public void clickonusers () 
	{
	users.click();
	}
}
