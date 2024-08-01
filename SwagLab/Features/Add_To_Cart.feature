Feature: Add_To_Cart

  Background: 
    Given User launch the chrome browser
    When User open the url as "https://www.saucedemo.com/"
    Then Page Title should be "Swag Labs"

  Scenario: Add a product to cart and then remove the product from cart(empty cart)
    When User enters the username as "standard_user"  and password as "secret_sauce"
    And User clicks on Login button
    Then User is directed to Swag labs home page and verify it
    Then User clicks the product and adds to cart for Sauce Labs BackPack
    Then User is directed to add to cart icon
    Then User gets the click arrow on Remove cart(empty cart) and back page
    Then User clicks on hamburger menu
    And User now clicks on Logout page
    Then Page Title should be "Swag Labs"

  Scenario: Add a product to cart by "filter" (price:high-low) and "Continue Shopping"
    When User enters the username as "problem_user"  and password as "secret_sauce"
    And User clicks on Login button
    Then User is directed to Swag labs home page and verify it
    Then User should filter the listed items by price(high-low)selected
    Then User clicks the product and adds to cart for Sauce Labs Bike Light
    Then User is directed to add to cart icon
    Then User should get the mouse on Continue Shopping
    Then User clicks on hamburger menu
    And User now clicks on Logout page
    Then Page Title should be "Swag Labs"

  Scenario: Add a product to cart- Sauce labs Onesie and  cancel checkout process after filling details
    When User enters the username as "error_user"  and password as "secret_sauce"
    And User clicks on Login button
    Then User is directed to Swag labs home page and verify it
    Then User clicks the product and adds to cart for Sauce Labs Onesie
    Then User is directed to add to cart icon
    Then User should click on Checkout
    And User enters firstname as "Shivam" and lastname as "P" and zip/postal code as "400007"
    Then user clicks on button name as cancel
    Then User should get the mouse on Continue Shopping
    Then User clicks on hamburger menu
    And User now clicks on Logout page
    Then Page Title should be "Swag Labs"

  Scenario: Add a product to cart- Sauce labs Onesie and successfully complete checkout process and product is shipped
    When User enters the username as "visual_user"  and password as "secret_sauce"
    And User clicks on Login button
    Then User is directed to Swag labs home page and verify it
    Then User clicks the product and adds to cart for Sauce Labs Onesie
    Then User is directed to add to cart icon
    Then User should click on Checkout
    And User enters firstname as "Shivam" and lastname as "P" and zip/postal code as "400007"
    Then User must click on continue  checkout button
    Then User clicks on Finish  button to complete item checkout process
    Then User is directed back to home page after clicking on Back Home
    Then User clicks on hamburger menu
    And User now clicks on Logout page
    Then Page Title should be "Swag Labs"
