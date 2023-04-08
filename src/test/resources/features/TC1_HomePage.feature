Feature: Launch ds-algo portal and navigate to home page
 # @smoketest
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
    
   
    
    
  Scenario Outline: User is on Home page and click on dropdown without sign in	
     Given  The user is on Home page	 
     When   The user clicks on datastructure dropdown without signin 
     Then   The user clicks on any dropdown "<value>" 	
     Then 	The user get warning message "You are not logged in"	
     Examples: 
      | value         |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |  

  Scenario Outline:  User is on Home page and click getstarted link on  home page without sign in
    Given The user is on Home page
    When The user clicks on any Get Started link "<value>" on homepage  without signin
    Then The user get warning message "You are not logged in"
    Examples: 
      | value        |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
      
     Scenario: User is on Home page and click on sign in 
      Given  The user is on Home page
      When   The user clicks on Signin link
      Then   The user should be redirected to Sign in page
      
     Scenario:  User is on Home page and click on Register 
     Given   The user is on Home page
     When    The user clicks on Register link
     Then    The user should be redirected to Register form