package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jspopalert {
	@FindBy (xpath = "//a[text()='JS Popup Alert']")
	private WebElement jspopalert;
	
	@FindBy (xpath = "(//a[text()='Try it Yourself »'])[1]")
	private WebElement tryityourself;
	
	@FindBy (xpath = "//iframe[@id='iframeResult']")
	private WebElement iframetryit;
	
	@FindBy (xpath = "//button[text()='Try it']")
	private WebElement tryit;
	
	@FindBy (xpath = "//a[@id='getwebsitebtn']")
	private WebElement getyourwebsite;

public Jspopalert (WebDriver driver) 
{
PageFactory.initElements(driver, this);	
}

public void clickonjspopalert() {
	jspopalert.click();
}
public void clickontryityourself() {
	tryityourself.click();
}
public void focusoniframetryit(WebDriver driver) {
	driver.switchTo().frame(iframetryit);
}

public void clickontryitchildbrowser() {
	tryit.click();
}
public void clickongetyourwebsite() {
getyourwebsite.click();
}
}
