package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Logout {
	
	WebDriver driver;
	public Login_Logout(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy (id="user-name") WebElement username;
@FindBy (id="password") WebElement password;

@FindBy (name="login-button") WebElement login;
@FindBy (xpath="//div[@id='page_wrapper']/child::div/child::div[1]/child::div[1]/child::div[2]/child::div") WebElement swaglabs;

@FindBy (xpath="//div[@class='bm-burger-button']/child::button") WebElement hamburgermenu;
@FindBy (xpath="//div[@class='bm-menu']/child::nav/child::a[2]") WebElement about;
@FindBy (xpath="//div[@class='bm-menu']/child::nav/child::a[3]") WebElement logout;

public void EnterUserName(String un) {
	username.sendKeys(un);
}

public void EnterPassword(String pw) {
	password.sendKeys(pw);
}


public void ClickOnLoginBTN() {
	login.click();
}

public void VerifyHomeSwagLabs() {
	if(swaglabs.isDisplayed())
	   {
		 String SL=  swaglabs.getText();
		 System.out.println(SL);
		 
		 }
	   }

public void ClickonHamburgermenu() {
	hamburgermenu.click();
}
public void ClickOnAbout() {
	about.click();
	driver.navigate().back();	
}


public void ClickOnLogout() {
	logout.click();
}
}











