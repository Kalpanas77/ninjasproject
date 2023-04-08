package stepDefinition;


//import static org.testng.Assert.assertEquals;

//import static org.testng.AssertJUnit.assertequals;
//import org.openqa.selenium.WebDriver;

import base.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Homepage_POM;
//import utils.LoggerLoad;
//import utils.configreader;
import utils.logger_log4j;

	
public class homepage extends baseclass  {
	
	Homepage_POM home_page =new Homepage_POM();
   	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		
	   home_page.dsalgoportal();//n
	
	    
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string_getstart)//got error fixed by adding parameter
	{
		home_page.click_getstarted();
		
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	   logger_log4j.info("-------------user should be redirected to homepage-----------------");
	   String title = home_page.get_title_page();
	   System.out.println("User is on "+title+"page");
	//   assertequals(title,"numpy");
	}

	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
	    logger_log4j.info("**********************USER IS ON HOME PAGE****************");
	    home_page.open_home_page();
	}
	@When("The user clicks on datastructure dropdown without signin")
	public void the_user_clicks_on_datastructure_dropdown_without_signin() {
	    System.out.println("********User clcik on data structure dropdown without login************");
	    
	}

	@Then("The user clicks on any dropdown {string}")
	public void the_user_clicks_on_any_dropdown(String string) {
	    home_page.drop_down_menu(string);
	}
	
	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string){
		 System.out.println("**********ALERT MESSAGE**************");	
	 String mssg = home_page.alert_message();	 
	 System.out.println("**********ALERT MESSAGE : "+mssg+"**************");		
	}
	 
    
	@When("The user clicks on any Get Started link {string} on homepage  without signin")
	public void the_user_clicks_on_any_get_started_link_arrays_on_homepage_without_signin(String string) {
	 home_page.get_started_button_Options(string);
		
	}
	
	@When("The user clicks on Signin link")
	public void the_user_clicks_on_signin_link() {
		home_page.sigin();
	}



	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    
	}
	@When("The user clicks on Register link")
	public void the_user_clicks_on_register_link() {
	    home_page.register_page();
	}

    
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	   System.out.println("TITLE PAGE");
		String  title = home_page.get_registerpage_title();
	   System.out.println("Registration page title :"+title);
	   
	}

	

	}
