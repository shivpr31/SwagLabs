package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_To_Cart {

	WebDriver driver;
	public Add_To_Cart(WebDriver idriver) {
		driver= idriver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy (xpath="//div[@class='inventory_list']/child::div[1]/child::div[2]/child::div[2]/descendant::button") WebElement addtocart;
@FindBy (xpath="//div[@id='shopping_cart_container']/child::a") WebElement carticon;
@FindBy (xpath="//div[@class='cart_item_label']/child::div[2]/descendant::button") WebElement removeitemcart;

@FindBy (xpath="//div[@class='inventory_list']/child::div[2]/child::div[2]/child::div[2]/descendant::button") WebElement addtocartlight;

@FindBy (className="product_sort_container") WebElement filterprice;
@FindBy (xpath="//button[@id='continue-shopping']") WebElement continueshopping;

@FindBy (xpath="//div[@class='inventory_list']/child::div[5]/child::div[2]/child::div[2]/descendant::button") WebElement addtocart1;


@FindBy (xpath="//button[@id='checkout']") WebElement checkout;

@FindBy (id="first-name") WebElement fname;
@FindBy (id="last-name") WebElement lname;
@FindBy (id="postal-code") WebElement pcode;

@FindBy (id="continue") WebElement continuecheckout;
@FindBy (id="cancel") WebElement cancel;

@FindBy (xpath="//button[@id='finish']") WebElement finish;
@FindBy (xpath="//button[@id='back-to-products']") WebElement backhome;


public void ClickonAddToCart() {
	
	addtocart.click();
}

public void ClickOnAddToCarticon() {
	carticon.click();
}
	
	
	public void ClickonRemoveItemCart() {
		removeitemcart.click();
		driver.navigate().back();
	}
	
	
	
	public void SelectPricelow() {
	
	Select scPrice = new Select(filterprice);
	scPrice.selectByVisibleText("Price (low to high)");
	}
	
  public void ClickonAddToCartLight() {
		
		addtocartlight.click();
	}
	
	public void ClickonContinueShopping() {
		continueshopping.click();
	}
	
	public void ClickonAddToCart1() {
		
		addtocart1.click();
	}
	
	public void ClickonCheckout() {
       checkout.click();
	}
	
	public void EnterFirstname(String fn) {
		fname.sendKeys(fn);
	}
	
	public void EnterLastname(String ln) {
		lname.sendKeys(ln);
	}
	public void EnterPostalCode(String pc) {
		pcode.sendKeys(pc);
	}
	public void ClickContinueCheckout() {
		continuecheckout.click();
	}
	
	public void ClickonCancel() {
		cancel.click();
	}
	
	public void ClickonFinish() {
		finish.click();
	}
	
	
	public void ClickOnBackHome() {
		backhome.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

