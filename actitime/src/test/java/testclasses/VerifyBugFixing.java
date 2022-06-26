package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMClasses.BugFixing;
import POMClasses.HeaderHomePage;
import POMClasses.LoginPage;


public class VerifyBugFixing {
	WebDriver driver; WebDriverWait wait;
	LoginPage loginPage; HeaderHomePage headerHomePage;BugFixing bugfixing;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\All Browser\\Chrome versions\\chromedriver32-102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}	
	@BeforeClass
	public void pomObject() {
		loginPage = new LoginPage (driver);
		bugfixing = new BugFixing (driver);
	}
	@BeforeMethod
	public void loginToApplication() throws InterruptedException {
		driver.get("https://online.actitime.com/suraksha/login.do");
//		loginPage.sendUserName();
//		loginPage.sendPassword();
//		loginPage.sendKeepMeLogin();
//		loginPage.clickOnLoginButton();
		loginPage.loginToApplication();
		Thread.sleep(5000);
	}	 
	@Test
	public void verifybugfixing() throws InterruptedException {
		
		bugfixing.clickOntasksymbol();
		Thread.sleep(2000);
		String url =driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		bugfixing.clickOnSpaceshipTesting();
		Thread.sleep(2000);
		bugfixing.clicksbugFixing();
		Thread.sleep(3000);
		bugfixing.sendvaluebudget();
		bugfixing.sendvaluecodeCustomField();
		Thread.sleep(3000);
		bugfixing.sendvalueestimatedHrs();
		Thread.sleep(3000);
		bugfixing.sendvaluedescription();
		Thread.sleep(3000);
		bugfixing.sendvaluemrComment();
		}
	
	@AfterMethod 
	public void lougoutToApplication() {
		loginPage.clickOnLogoutButton();
	}
	@AfterClass 
	public void clearobject() {
		loginPage = null;
		bugfixing = null;
	}
	@AfterTest 
	public void closebrowser() {
		driver.close();
		driver=null;
		System.gc();
}
}
	

