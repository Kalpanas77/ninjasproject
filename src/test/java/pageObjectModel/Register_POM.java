package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseclass;
import utils.Excelfilereader;
import utils.configreader;
import utils.logger_log4j;

public class Register_POM {

	public static WebDriver driver = baseclass.getdriver();
	String reg_page_url = configreader.Register();
//	String Excelpath=configreader.excel_data();
	
	//USERNAME  & PASSWORD WEBELEMENT
	@FindBy(xpath="//input[@id='id_username']") WebElement user_name;
	@FindBy(xpath="//input[@id='id_password1']") WebElement password;
	@FindBy(xpath="//input[@id='id_password2']") WebElement pass_confirm;
	@FindBy(xpath="//input[@type='submit']") WebElement reg_button;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement capture_err_msg;
	@FindBy(xpath="//a[text()='Login ']") WebElement nav_loginlink;
	
	public Register_POM()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void register_fields()
	{
		reg_button.click();
	}
	
	public void enter_username(String username)
	{
	   logger_log4j.info("Enter User name:");	
	   user_name.click();
	   user_name.clear();
	   user_name.sendKeys(username);
	//   reg_button.click();
	
	}
	
	public void enter_pass(String pass)
	{
		logger_log4j.info("Enter password : ");
        password.click();
		password.clear();
		password.sendKeys(pass);
		
	}
	
	public void enter_pass_confirm(String password_confimation)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger_log4j.info("Enter password confirmation : ");
		pass_confirm.click();
		pass_confirm.clear();
		
		pass_confirm.sendKeys(password_confimation);
	}
    public String err_message(String msg)
	{
         
    	
    	String inv_mssg = capture_err_msg.getText();
    	logger_log4j.warn(inv_mssg);
    	return inv_mssg;
    			
//	        String c_err=capture_err_msg.getText();
//			if( c_err!= err)
//			{
//			     c_err= err;
//			     return;
//			}
	}	
    
    //Display hidden username validation message 
    
    public String capture_usr_errmsg()
    {
    	 String ur_msg =user_name.getAttribute("validationMessage");
    	 logger_log4j.warn(ur_msg);
    	 return ur_msg;
    }

    //Display password validation message 
    public String capture_pass_msg()
    {
    	String pass_msg = password.getAttribute("validationMessage");
    	logger_log4j.warn(pass_msg);
    	return pass_msg;
    }
    
    //Display password CONFIMATION validation message 
    public String capture_pass_confirm_msg()
    {
    	String pass_cm_msg = pass_confirm .getAttribute("validationMessage");
    	logger_log4j.warn(pass_cm_msg);
    	return pass_cm_msg;
    }
    
	
}
