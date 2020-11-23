Feature: Amazon Login
 
  Scenario Outline: Login to Amazon site
    Given chrome Browser is open
    And <sitename> site is launched
    When Click on Signin button and Enter <username> and <password>
    And click on login button
    Then user is navigated to Amazon homepage
    Then Verify site name text on the home page.

    Examples: 
      | sitename | username | password  |
      | https://www.amazon.in/  | kulkarniarati396@gmail.com | xyz@2020 |