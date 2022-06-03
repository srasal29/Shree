package testclasses;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomclasses.Jspopalert;


public class ChildebrowserAndiframe {
	WebDriver driver; Jspopalert jspopalert;
@BeforeClass
public void launchbrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium and crome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	}
@BeforeMethod
public void launchapplication() throws InterruptedException{
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	jspopalert = new Jspopalert (driver);
	jspopalert.clickonjspopalert();
	Thread.sleep(1000);}

@Test
public void childbrowserandiframe() throws InterruptedException {
jspopalert = new Jspopalert (driver);
jspopalert.clickontryityourself();
ArrayList<String> addr=new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(addr.get(1));
Thread.sleep(1000);
jspopalert.focusoniframetryit(driver);
jspopalert.clickontryitchildbrowser();
Alert alt=driver.switchTo().alert();
alt.accept();
driver.switchTo().parentFrame();
jspopalert.clickongetyourwebsite();
}


@AfterMethod(enabled=false)
public void logout() {
	
}
@AfterClass(enabled=false)
public void closeapplication() {
}

}
