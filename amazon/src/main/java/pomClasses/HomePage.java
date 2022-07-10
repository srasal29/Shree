package pomClasses;	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage {
		@FindBy (xpath = "//a[@id='nav-hamburger-menu']")
		private WebElement menu;
		
		@FindBy (xpath = "(//a[@class='hmenu-item'])[4]")
		private WebElement electronics;
		
		@FindBy (xpath = "//a[text()='Headphones']")
		private WebElement Headphones;
		
		@FindBy (xpath = "(//a[text()='Mobiles'])[2]")
		private WebElement Mobiles;
		
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void menuclick()
		{
			menu.click();
		}
		public void electronicsclick()
		{
			electronics.click();
		}
		public void Headphonesclick()
		{
			Headphones.click();
		}
		public void Mobilesclick()
		{
			Mobiles.click();
		}
		public void SearchHeadphones() throws InterruptedException
		{
			menu.click();
			Thread.sleep(2000);
			electronics.click();
			Thread.sleep(2000);
			Headphones.click();
		}
	}


}
