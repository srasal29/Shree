package POMClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
@FindBy (xpath="//td[@class='navItem preventPanelsHiding navCell relative selected withBottomBorder']//a")
private WebElement task;

@FindBy (xpath ="//div[@class='itemsContainer']")
private WebElement itemsContainer;
@FindBy (xpath ="(//div[text()='All Customers'])[1]")
private WebElement AllCustomers;

@FindBy (xpath ="(//div[@class='iScrollIndicator'])[1]")
private WebElement scrollIndicator;

@FindBy (xpath= "(//div[text()='Recruiting & HR'])[1]")
private WebElement recruitingHR;

@FindBy	(xpath="//div[@title='CV review']")
private WebElement cvReview;

@FindBy	(xpath="(//div[@class='classicBridge-taskPanel-DeadlineSelector-date--2CIg3dTt'])[1]")
private WebElement deadlineDate;

@FindBy (xpath = "(//div[@class='rc-calendar-date selected-day'])[1]")
private WebElement dateSelection;

@FindBy (xpath = "(//div[@class='classicBridge-taskPanel-TypesOfWorkSelector-trigger--1TDARRNl'])[1]")
private WebElement typeOfWork;

@FindBy (xpath = "(//div[text()='manufacturing'])[2]")
private WebElement manufacturingBillable ;

@FindBy (xpath = "(//div[@class='classicBridge-taskPanel-DetailWrapper-element--2CGzLncm'])[3]")
private WebElement priority;

@FindBy (xpath = "//div[@title='High']")
private WebElement priorityHigh;

@FindBy (xpath = "(//div[@class='sendCommentLine'])[3]")
private WebElement sendCommentLine;

public Task1(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
public void clickOnTask() {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(AllCustomers));
	task.click();}

public void FinditemsContainer()
{
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("argument[0].scrollIntoView(true);", itemsContainer);
}

public void clickscrollIndicator() {
scrollIndicator.click();}

public void clickrecruitingHR() {
recruitingHR.click();}

public void clickcvReview() {
cvReview.click();}

public void clickDeadlineDate() {
deadlineDate.click();}

public void clickDateSelection() {
dateSelection.click();}

public void clickTypeOfWork() {
typeOfWork.click();}

public void clickManufacturingBillable() {
manufacturingBillable.click();}

public void clickPriority() {
priority.click();}

public void clickpriorityHigh() {
priorityHigh.click();}

public void sendSendCommentLine() {
sendCommentLine.sendKeys("Total Emlpoyee = 100");;}



}
