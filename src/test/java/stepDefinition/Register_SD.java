package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjectModel.Register_POM;

import utils.Excelfilereader;
import utils.configreader;
import utils.logger_log4j;

public class Register_SD {

	Register_POM reg_pom = new Register_POM();
	
	static String username;
	static String password;
	static String confirmpwd;
  //  static String msg;
	
	

	@Given("User opens Register Page")
	public void user_opens_register_page() {
	    
	}

	@When("User clicks Register button with all fields empty")
	public void user_clicks_register_button_with_all_fields_empty() {
		
		reg_pom.register_fields();
		
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String act_warn) {
		String Expe_warn = reg_pom.capture_usr_errmsg();
		assertEquals(Expe_warn,act_warn);
	}

	

	@When("User clicks Register button after entering username as {string} with other fields empty")
	public void user_clicks_register_button_after_entering_username_as_with_other_fields_empty(String username) {
		reg_pom.enter_username(username);
		reg_pom.register_fields();
		
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
		reg_pom.capture_pass_msg();
	}

	@When("User clicks Register button after entering {string} and {string} with Password Confirmation field empty")
	public void user_clicks_register_button_after_entering_and_with_password_confirmation_field_empty(String username, String pass) {
	    reg_pom.enter_username(username);
	    reg_pom.enter_pass(pass);
	    reg_pom.register_fields();
	    
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
		reg_pom.capture_pass_confirm_msg();
	}

	@When("User enters {string} ,{string} and {string}")
	public void user_enters_and(String username, String pass, String pass_confirm) {
		reg_pom.enter_username(username);
	    reg_pom.enter_pass(pass);
	    reg_pom.enter_pass_confirm(pass_confirm);
	   
	}

	@Then("User clicks Register and  validate  {string}")
	public void user_clicks_register_and_validate(String er_message) {
		 reg_pom.register_fields();
		 reg_pom.err_message(er_message);
		 System.out.println("PRINTING ERROR MESSAGES FOR INVALID CREDENTIALS FROM FEATURE FILE  :"+er_message);
		 
	//	 logger_log4j.error("---------Error message with invalid combination-------------------------") ; 
	    
	}
	@When("User enters {string} and {int}")
	public void user_enters_and(String sheetname, Integer rowno) throws IOException {
	String path ="C:/Users/Padma/eclipse-kalpanasworkspace/SDET100/ninja+project/src/test/resources/testdata/ds_algo_testdata.xlsx";
	Excelfilereader er = new Excelfilereader(path);
//	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$SHEET NAME************* :"+sheetname);
//    int total_no_of_rows=er.getRowCount(sheetname);
 //   System.out.println("ROW TOTAL :"+total_no_of_rows);
 //   int tot_no_of_cols = er.getCellCount(sheetname,rowno);
  //  System.out.println("COLUMN TOTAL:"+tot_no_of_cols);
        
     	reg_pom.enter_username(er.getCellData(sheetname,rowno,0));
    	reg_pom.enter_pass(er.getCellData(sheetname,rowno, 1));
	    reg_pom.enter_pass_confirm(er.getCellData(sheetname,rowno, 2));
	 //   msg=reg_pom.err_message(er.getCellData(sheetname, rowno,3));
	  //  System.out.println("************"+msg+"********************");
		
    
	
    }
    
   
		
//	@Then("User clicks on Register buttton and should display Message {string}")
//	public void user_clicks_on_register_buttton_and_should_display_message(String err) {
		//reg_pom.register_fields();
//		reg_pom.err_message(err);
	
//	}
//
	@When("Clicks on Register buttton")
	public void clicks_on_register_buttton() {
		
		reg_pom.register_fields();
		
	}

	
	 
	@Then("It should display {string}")
	public void it_should_display(String msg) throws IOException {
	//	reg_pom.err_message(msg)
	//	String path ="C:/Users/Padma/eclipse-kalpanasworkspace/SDET100/ninja+project/src/test/resources/testdata/ds_algo_testdata.xlsx";
	//	Excelfilereader er = new Excelfilereader(path);
		String mssg="";
		try {
			assertEquals(msg, reg_pom.err_message(mssg));
		  //  Assert.assertEquals(actualString, expectedString);
		} catch (AssertionError e) {
		    System.out.println("Not equal");
		    throw e;
		    
		}
		System.out.println("Equal");
		//   System.out.println("***********MESSAGE FROM FEATURE FILE ********:"+msg);
		//   assertEquals(msg, reg_pom.err_message(mssg));
	//	  if((assertEquals(msg, reg_pom.err_message(mssg))
		    	
		    
		
	}

	
	
//	@Then("It should display {string}")
//	public void it_should_display(String sheetname) {
//	//	reg_pom.err_message(msg);
//		String path ="C:/Users/Padma/eclipse-kalpanasworkspace/SDET100/ninja+project/src/test/resources/testdata/ds_algo_testdata.xlsx";
//		Excelfilereader er = new Excelfilereader(path);
//		reg_pom.err_message(er.getCellData(sheetname, rowno,3));
//	}

	
	
	
	
}