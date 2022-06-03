package testclasses;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClasses.HeaderHomePage;
import POMClasses.LoginPage;
import POMClasses.Task1;

public class VerifyTasks1 {
	WebDriver driver; WebDriverWait wait;
LoginPage loginPage; HeaderHomePage headerHomePage;
@BeforeClass
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium and crome\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}	
@BeforeMethod
public void loginToApplication() {
	driver.get("https://online.actitime.com/suraksha/login.do");
	loginPage = new LoginPage (driver);
	loginPage.sendUserName();
	loginPage.sendPassword();
	loginPage.sendKeepMeLogin();
	loginPage.clickOnLoginButton();
}	 
@Test
public void verifyTask1() {
	
	Task1 task1 = new Task1 (driver);
	task1.clickOnTask();
	String url =driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	task1.FinditemsContainer();
	task1.clickrecruitingHR();
	task1.clickcvReview();
	task1.clickDeadlineDate();
	task1.clickDateSelection();
	task1.clickTypeOfWork();
	task1.clickManufacturingBillable();
	task1.clickPriority();
	task1.clickpriorityHigh();
	task1.sendSendCommentLine();
}
@AfterMethod 
public void lougoutToApplication() {
	loginPage.clickOnLogoutButton();
}
@AfterClass (enabled=false)
public void closebrowser() {
driver.close();
}
}
