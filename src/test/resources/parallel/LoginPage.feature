Feature: Login page feature
@smoke
Scenario: Login page title
Given user is at the landing page
When user gets the title of page
Then page title should be "Shopping"

@regression
Scenario: verify cart section display
Given user is at the landing page
Then cart icon should get display

@functional
Scenario: login to app
Given user is at the landing page
When user enters the username as "8176867662"
And user enters the password as "123456"
And user confirm the signin
