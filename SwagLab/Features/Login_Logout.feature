Feature: Login_Logout

  Background: 
    Given User launch the chrome browser
    When User open the url as "https://www.saucedemo.com/"
    Then Page Title should be "Swag Labs"

  Scenario Outline: Successful login with valid crendentials DDT
    When User enters the username as "<username>"  and password as "<password>"
    And User clicks on Login button
    Then User is directed to Swag labs home page and verify it
    Then User clicks on hamburger menu
    Then User is directed to About page and navigate back to the previous page
    Then User clicks on hamburger menu
    And User now clicks on Logout page
    Then Page Title should be "Swag Labs"

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |

  Scenario: Successful login for locked user with  error message
    When User enters the username should be as "locked_out_user"  and password needs to be entered as  "secret_sauce"
    And User clicks on Login button

  Scenario Outline: Successful not login for a unauthorized user DDT
    When User enters the username should be as "<username2>"  and password needs to be entered as  "<password2>"
    And User clicks on Login button

    Examples: 
      | username2     | password2    |
      | abc10_user    | secret_sauce |
      | standard_user | sauce_secret |
