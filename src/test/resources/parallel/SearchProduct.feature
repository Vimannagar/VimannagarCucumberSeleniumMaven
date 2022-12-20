Feature: search product
Scenario: search functionality
Given user is already logged in with "8176867662" and "123456"
When user the text "mobile phone" and search
Then mobile phone should get display