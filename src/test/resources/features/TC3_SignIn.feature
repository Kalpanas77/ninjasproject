Feature: Verifying credentials for Sign in Page

Scenario: Verifying account and redirected to Register page
Given User is on SignIn Page
When  User Clicks on Register link
Then  User is redirected to Register Page 

Scenario: To Verify SignIn page with empty fields
Given User is on SignIn Page
When  User clicks on Login button with all fields empty
Then  User is presented with errormessage at username as "Please fill out the field"

Scenario: To Verify SignIn page with username only.
Given User is on SignIn Page
When  User enters username as  "kalpana_77@gmail.com" and Clicks on Login button
Then  User is presented with errormessage at Password as "Please fill out this field"

Scenario:  To Verify SignIn page with Password only.
Given User is on SignIn Page
When  User enters "sdet_32823" only and Clicks on Login button
Then User is presented with error message "Please fill out this field"

Scenario Outline: To Verify Signin Page with invalid credentials
Given  User is on SignIn Page 
When   User enters "<username>" and "<password>"
And    Clicks on Login button
Then   It displays error message "Invalid Username and Password"
 
Examples:
|username              |password  |
|Sirisha               | 1344343  |
|Radha                 | rd_0900  |
|Ninja_boomers         | dsalgo_100|


#Scenario Outline: The user is presented with error message for invalid input
#Given User is on SignIn  page
#When  User enters "<Sheetname>" and <rowno>
#And   Clicks on Login Button
#Then  Displays Sigin "Invalid Username and Password"
#
#Examples:
#|Sheetname|rowno|
#|SignIn   |  1  |
#|SignIn   |  2  |
#|SignIn   |  3  |





