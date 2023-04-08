package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.logger_log4j;
import base.baseclass;
import utils.configreader;

public class SignIn_POM {

	private static final CharSequence password = null;
	private static final CharSequence username = null;
	public static WebDriver driver = baseclass.getdriver();
	@FindBy(xpath="//input[@id='id_username']") WebElement signin_username;
	@FindBy(xpath="//input[@id='id_password']") WebElement sign_pass;
	@FindBy(xpath="//input[@type='submit']")WebElement login_button;
	@FindBy(linkText = "Register!") WebElement reg;
	@FindBy(linkText=" Register ") WebElement Reg_nexttosigin;
	@FindBy(xpath="Sign out") WebElement Signout;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement sign_err_msg;
	
	
	public SignIn_POM()
	{
		PageFactory.initElements(driver,this);
	}
	public void signin_portal()
	{
	  String sign_Url=configreader.sigin();
	  driver.get(sign_Url);
	}
	public void register_portal()
	{
		String r_port= configreader.Register();
		driver.get(r_port);
	}
	
	public void signin_withempty()
	{
		login_button.click();
	}
	public void sign_useronly(String uname)
	{
		System.out.println("USERNAME : "+uname);
		logger_log4j.warn("Enter Username :");
		signin_username.clear();
		signin_username.click();
		signin_username.sendKeys(uname);
	}

    
	public void sign_passonly(String pa_ss)
    {
		System.out.println("PASSWORD : "+pa_ss);
    	logger_log4j.warn("Enter Password :");
    	sign_pass.clear();
    	sign_pass.click();
    	sign_pass.sendKeys(pa_ss);
    }
    public String print_invalid_msg()
    {
    	String msg = sign_err_msg.getText();
    	logger_log4j.warn(msg);
    	return msg;
    }
    public String usr_msg()
    {
    	String umsg= signin_username.getAttribute("validationMessage");
    	logger_log4j.warn(umsg);
    	return umsg;
    	
    }
    public String pass_msg()
    {
    	String pmsg=sign_pass.getAttribute("validationMessage");
    	logger_log4j.warn(pmsg);
    	return pmsg;
    }
}


