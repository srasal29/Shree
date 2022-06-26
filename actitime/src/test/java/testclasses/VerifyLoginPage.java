package testclasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClasses.LoginPage;

public class VerifyLoginPage {
WebDriver driver;
LoginPage loginPage;
	@BeforeClass
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium and crome\\chrome 102\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
}
@BeforeMethod
public void loginToApplication() throws EncryptedDocumentException, IOException {
	driver.get("https://online.actitime.com/suraksha/login.do");
	loginPage = new LoginPage (driver);
	loginPage.loginToApplication(); 
}
@Test
public void test() {
	String url =driver.getCurrentUrl();
	System.out.println(url);
	String title =driver.getTitle();
	System.out.println(title);
	System.out.println("We are best");
}
@AfterMethod
public void logoutToApplication() {
loginPage.clickOnLogoutButton();
}
@AfterClass
public void afterClass() {
	driver.close();
}

}
