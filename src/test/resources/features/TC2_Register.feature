Feature: To verify and validate Registration Page

  Scenario: The user is presented with error message for empty fields below Username textbox
    Given User opens Register Page
    When User clicks Register button with all fields empty
    Then It should display an error "Please fill out this field." below Username textbox

  Scenario: The user is presented with error message for empty fields below Password textbox
    Given User opens Register Page
    When User clicks Register button after entering username as "Numpy@sdet84_1" with other fields empty
    Then It should display an error "Please fill out this field" below Password textbox

  Scenario: The user is presented with error message for empty fields below Password Confirmation textbox
    Given User opens Register Page
    When User clicks Register button after entering "Numpy@sdet84_1" and "testpassword" with Password Confirmation field empty
    Then It should display an error "Please fill out this field." below Password Confirmation textbox

  Scenario Outline: The user is presented with error message for invalid credentials and successs message for Valid Credentials
    Given User opens Register Page
    When User enters "<username>" ,"<password>" and "<password_confirmation>"
    Then User clicks Register and  validate  "<Message>"

    Examples: 
      | username       | password     | password_confirmation |  Message                                                     |
      | Numpy          | testpassword | testpassword          | Please enter a valid username                                     |
      | Numpy@sdet84_1 | RT56YUabc    | RT56YUabc             | Username already exists                                           |
      | Numpy@sdet84_1 | testpassword | testpassword1         | password_mismatch:The two password fields didn’t match.           |
      | Numpy@sdet84_1 | a1b2c3       | a1b2c3                | Password should contain at least 8 characters                     |
      | Numpy@sdet84_1 |     12345678 |              12345678 | Password can’t be entirely numeric.                               |
      | Numpy@sdet84_1 | testsdet84   | testsdet84            | password can’t be too similar to your other personal information. |
      | kalpana_dsalgo@gmail.com      |      ninja_32823      | ninja_32823     | New account created|
      
  Scenario Outline: Read data from Excel for Register page and verify Message
    Given User opens Register Page
    When  User enters "<Sheetname>" and <Rownum> 
    And   Clicks on Register buttton 
    Then It should display "<Message>"
    Examples: 
      | Sheetname | Rownum |   Message																		   			 |
      | Register  |   1    |password_mismatch:The two password fields didn’t match.|
      | Register  |   2    |password_mismatch:The two password fields didn’t match.|
      | Register  |   3    |password_mismatch:The two password fields didn’t match.|
      | Register  |   4    |New account created                                    |
      
  