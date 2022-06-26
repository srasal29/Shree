package POMClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy (xpath = "//input[@id ='username']")
private WebElement userName;

		
@FindBy (xpath = "(//input[@type='password'])[1]")
private WebElement password;

@FindBy (xpath = "//input[@type='checkbox']")
private WebElement keepMeLoggedInCheckBox;

@FindBy (xpath = "//a[@id='loginButton']")
private WebElement login;

@FindBy (xpath = "//a[@id='toPasswordRecoveryPageLink']")
private WebElement forgotYouPassword;

@FindBy (xpath = "//td[@class='logoutCell preventPanelsHiding']//a")
private WebElement logout;

public LoginPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
/*public void sendUserName() throws EncryptedDocumentException, IOException    {
	userName.click();
	//userName.sendKeys("srasal29@gmail.com");
	String path=("C:\\Users\\ADMIN\\Desktop\\Ram.xlsx");
    FileInputStream File=new FileInputStream(path);
    Workbook book=WorkbookFactory.create(File);
    Sheet sheet= book.getSheet("Shole");
    for(int i=1;i<2;i++)
    {
       Row row=sheet.getRow(i);
       for(int j=0;j<1;j++)
       {
          Cell cell=row.getCell(j);
          String v=cell.getStringCellValue();
          System.out.print(v);
          userName.sendKeys(v);
	   }
       System.out.println();
       }
	
	
}
public void sendPassword() throws EncryptedDocumentException, IOException {
	password.click();
	//password.sendKeys("8013Rasal@");
	 String path=("C:\\Users\\ADMIN\\Desktop\\Ram.xlsx");
	    FileInputStream File=new FileInputStream(path);
	    Workbook book=WorkbookFactory.create(File);
	    Sheet sheet= book.getSheet("Shole");
	 
	    for(int i=1;i<2;i++)
	    {
	       Row row=sheet.getRow(i);
	       for(int j=1;j<2;j++)
	       {
	          Cell cell=row.getCell(j);
	          String v=cell.getStringCellValue();
	          System.out.print(v);
	          password.sendKeys(v);
		   }
	       System.out.println();
	       }
}
public void sendKeepMeLogin() {
	keepMeLoggedInCheckBox.click();
}
public void clickOnLoginButton() {
	login.click();
}	
public void clickOnLogoutButton() {
	logout.click();
}
or
*/

			
public void loginToApplication() {
	userName.sendKeys("srasal29@gmail.com");
	password.sendKeys("8013Rasal@");
	keepMeLoggedInCheckBox.click();
	login.click();
	}
public void clickOnLogoutButton() {
	logout.click();
}
}
