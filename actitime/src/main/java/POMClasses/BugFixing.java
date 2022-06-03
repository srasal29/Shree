	package POMClasses;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class BugFixing {
	
	@FindBy (xpath="//a[@class='content tasks']")
	private WebElement tasksymbol;
	@FindBy (xpath="(//div[text()='Spaceship testing'])[1]")
	private WebElement spaceshipTesting;
	@FindBy (xpath="//div[@title='Bug fixing']")
	private WebElement bugFixing;
	
	@FindBy (xpath="(//input[@type='text'])[45]")
	private WebElement budget;
	@FindBy (xpath="(//input[@class='components-Input-input--3RF7ZcCP classicBridge-taskPanel-CFStringEditor-input--P6bx1iyk'])[2]")
	private WebElement codeCustomField;
	@FindBy (xpath="(//div[@class='value'])[13]")
	private WebElement estimatedHrs;
	@FindBy (xpath="(//div[@class='inputContainer']")
	private WebElement description;
	@FindBy (xpath="/html/body/div[37]/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div/div[2]")
	private WebElement mrComment;


	public BugFixing(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public void clickOntasksymbol() {
		tasksymbol.click();}
	public void clickOnSpaceshipTesting(){
		spaceshipTesting.click();}
	public void clicksbugFixing() {
		bugFixing.click();}
	
	public void sendvaluebudget() {
		budget.sendKeys("5000");}
	public void sendvaluecodeCustomField() {
		codeCustomField.sendKeys("ABCD");}
	
	public void sendvalueestimatedHrs() {
		estimatedHrs.sendKeys("500");}
	public void sendvaluedescription() {
		description.sendKeys("We are tester");}
	public void sendvaluemrComment() {
		mrComment.sendKeys("We are tester");}
	
	}

