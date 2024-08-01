package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Add_To_Cart;
import pageObject.Login_Logout;


public class StepDefinition {
	WebDriver driver;
	Login_Logout l; 
	Add_To_Cart atc;
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		l= new Login_Logout(driver);
		atc= new Add_To_Cart(driver);
	}

	@When("User open the url as {string}")
	public void user_open_the_url_as(String url) {
		driver.get(url);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expTitle) {
		String actualTitle = driver.getTitle();
	    Assert.assertEquals(expTitle, actualTitle);
	}

	@When("User enters the username as {string}  and password as {string}")
	public void user_enters_the_username_as_and_password_as(String uname, String pwd) {
		l.EnterUserName(uname);
		l.EnterPassword(pwd);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		l.ClickOnLoginBTN();
	}

	@Then("User is directed to Swag labs home page and verify it")
	public void user_is_directed_to_swag_labs_home_page_and_verify_it() {
		l.VerifyHomeSwagLabs();
	}

	@When("User enters the username should be as {string}  and password needs to be entered as  {string}")
	public void user_enters_the_username_should_be_as_and_password_needs_to_be_entered_as(String string,
			String string2) {
		l.EnterUserName(string);
		l.EnterPassword(string2);
	}

	@Then("User clicks the product and adds to cart for Sauce Labs BackPack")
	public void user_clicks_the_product_and_adds_to_cart_for_sauce_labs_back_pack() {
	   atc.ClickonAddToCart();
	}

	@Then("User is directed to add to cart icon")
	public void user_is_directed_to_add_to_cart_icon() {
	   atc.ClickOnAddToCarticon();
	}

	@Then("User gets the click arrow on Remove cart\\(empty cart) and back page")
	public void user_gets_the_click_arrow_on_remove_cart_empty_cart_and_back_page() {
	    atc.ClickonRemoveItemCart();
	}

	@Then("User should filter the listed items by price\\(high-low)selected")
	public void user_should_filter_the_listed_items_by_price_high_low_selected() {
	    atc.SelectPricelow();
	}

	@Then("User clicks the product and adds to cart for Sauce Labs Bike Light")
	public void user_clicks_the_product_and_adds_to_cart_for_sauce_labs_bike_light() {
	    atc.ClickonAddToCartLight();
	}

	@Then("User should get the mouse on Continue Shopping")
	public void user_should_get_the_mouse_on_continue_shopping() {
	    atc.ClickonContinueShopping();
	}


	@Then("User clicks the product and adds to cart for Sauce Labs Onesie")
	public void user_clicks_the_product_and_adds_to_cart_for_sauce_labs_onesie() {
	   atc.ClickonAddToCart1();
	}

	@Then("User should click on Checkout")
	public void user_should_click_on_checkout() {
	    atc.ClickonCheckout();
	}

	@Then("User enters firstname as {string} and lastname as {string} and zip\\/postal code as {string}")
	public void user_enters_firstname_as_and_lastname_as_and_zip_postal_code_as(String fn , String ln, String pc) {
	    atc.EnterFirstname(fn);
	    atc.EnterLastname(ln);
	    atc.EnterPostalCode(pc);
	}

	@Then("User must click on continue  checkout button")
	public void user_must_click_on_continue_checkout_button() {
	    atc.ClickContinueCheckout();
	}
	
	
	@Then("user clicks on button name as cancel")
	public void user_clicks_on_button_name_as_cancel() {
	   atc.ClickonCancel();
	}

	@Then("User clicks on Finish  button to complete item checkout process")
	public void user_clicks_on_finish_button_to_complete_item_checkout_process() {
	   atc.ClickonFinish();
	}

	@Then("User is directed back to home page after clicking on Back Home")
	public void user_is_directed_back_to_home_page_after_clicking_on_back_home() {
	    atc.ClickOnBackHome();
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("User clicks on hamburger menu")
	public void user_clicks_on_hamburger_menu() {
	    l.ClickonHamburgermenu();
	}

	@Then("User is directed to About page and navigate back to the previous page")
	public void user_is_directed_to_about_page_and_navigate_back_to_the_previous_page() {
	    l.ClickOnAbout();
	}

	@Then("User now clicks on Logout page")
	public void user_now_clicks_on_logout_page() {
	    l.ClickOnLogout();
	}




}
