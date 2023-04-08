package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.SignIn_POM;
import utils.configreader;
import utils.logger_log4j;

public class SignIn_SD {
	
	SignIn_POM spom = new SignIn_POM();
	
	
	@Given("User is on SignIn Page")
	public void user_is_on_sign_in_page() {
	   logger_log4j.info("**************User is on SignIn Page*******************");	
	   spom.signin_portal(); 
	}

	@When("User Clicks on Register link")
	public void user_clicks_on_register_link() {
		 logger_log4j.info("**************User Clicks on Register link*******************");
		
	}

	@Then("User is redirected to Register Page")
	public void user_is_redirected_to_register_page() {
		 logger_log4j.info("**************User is redirected to Register Page*******************");
	  //  spom.register_portal();
	}

	

	@When("User clicks on Login button with all fields empty")
	public void user_clicks_on_login_button_with_all_fields_empty() {
	    spom.signin_withempty();
	}

	@Then("User is presented with errormessage at username as {string}")
	public void user_is_presented_with_errormessage_at_username_as(String string) {
	    spom.usr_msg();
	}
    
	
	@When("User enters username as  {string} and Clicks on Login button")
	public void user_enters_username_as_and_clicks_on_login_button(String uname) {
		 spom.sign_useronly(uname);
		 spom.signin_withempty();
	}
	
	
	@Then("User is presented with errormessage at Password as {string}")
	public void user_is_presented_with_errormessage_at_password_as(String string) {
	 spom.pass_msg();   
	}

	
	@When("User enters {string} only and Clicks on Login button")
	public void user_enters_only_and_clicks_on_login_button(String pss) {
	     spom.sign_passonly(pss);
	     spom.signin_withempty();
	     
	}

	@Then("User is presented with error message {string}")
	public void user_is_presented_with_error_message(String string) {
	   spom.usr_msg();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String pass) {
	    spom.sign_useronly(uname);
	    spom.sign_passonly(pass);
	    
	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
	    spom.signin_withempty();
	}

	@Then("It displays error message {string}")
	public void it_displays_error_message(String string) {
		
	    spom.print_invalid_msg();
		
	}



}
