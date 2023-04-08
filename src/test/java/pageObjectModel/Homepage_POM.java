package pageObjectModel;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseclass;


import utils.configreader;


public class Homepage_POM  extends baseclass{
	public static WebDriver driver =baseclass.getdriver();
	String url =configreader.app_url();
	String homePageurl=configreader.homePage();
	
	//GETSTARTED BUTTON
	@FindBy(xpath="//button[@class='btn']") WebElement getstart_buttton;
	//ALERT MESSAGE
	//@FindBy(xpath="//div[@role='alert']") WebElement alert_msg;
	
	@FindBy(xpath="//div[contains(text(),'You are not logged in')]") WebElement alert_msg;
	// GETSTATRED BUTTON WITH LOGIN AND SIGNIN
	@FindBy(xpath="//div[1][@class='col']//a") WebElement datastruct_intro_gt;
	@FindBy(xpath="//div[2][@class='col']//a") WebElement array_gt;
	@FindBy(xpath="//div[3][@class='col']//a") WebElement linkedlist_gt;
	@FindBy(xpath="//div[4][@class='col']//a") WebElement stack_gt;
	@FindBy(xpath="//div[5][@class='col']//a") WebElement queue_gt;
	@FindBy(xpath="//div[6][@class='col']//a") WebElement tree_gt;
	@FindBy(xpath="//div[7][@class='col']//a") WebElement graph_gt;
	//DROPDOWN MENU OPTIONS
	@FindBy(xpath="//div[1][@class='navbar-nav']/div") WebElement drop_down;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[1]") WebElement drop_down_array;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[2]") WebElement drop_down_linkedlist;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[3]") WebElement drop_down_stack;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[4]") WebElement drop_down_queue;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[5]") WebElement drop_down_tree;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a[6]") WebElement drop_down_graph;
	
	// Sigin
	@FindBy(xpath="//a[text()='Sign in']") WebElement sign_in;
	// Register
	@FindBy(xpath="//a[text()=' Register ']") WebElement register;
	public Homepage_POM() {
		PageFactory.initElements(driver,this);
	}
	 
	public void dsalgoportal()
	 {
		String url = configreader.app_url();
		System.out.println("APPLICATION URL:"+url);
	    driver.get(url);
	 }
	 public void click_getstarted()
	 {
		
		 getstart_buttton.click();
	 }
	 
	 public String get_title_page()
	 { 
		 String title = driver.getTitle();
		 return title;
	 }
	 
	 public void open_home_page()
	 {
		 driver.get(homePageurl);
	 }	 
	 
	 public void sigin()
	 {
		 sign_in.click();
	 }
	 
	 public void register_page()
	 {
		 register.click();
	 }
	 public String alert_message()
	 {
		String msg =null;
		msg=  alert_msg.getText();
		return msg;
	 }
	 
	 public String get_registerpage_title()
	 {
		 String title_reg=driver.getTitle();
		 return title_reg;
		 
	 }
	 public void get_started_button_Options(String string)
	 {
		 
		 switch(string)
		 {
		   case  "Datastructures"               : datastruct_intro_gt.click();
		   										  break;
		   case "Arrays"    						: array_gt.click();
		   					                      break;
		   case "Linkedlist"                   : linkedlist_gt.click();
		                                          break;
		                                          
		   case "Stack"							: stack_gt.click();
		   									      break;
		  
		   case "Queue"							: queue_gt.click();
		   										  break;
		   										  
		   case "Tree"                          : tree_gt.click();	
		   										  break;
		   										  
		   case "Graph"                         : graph_gt.click();
		   										  break;
		   									  
		   										  
		   										  
		 }
		 
	 }
	 public void drop_down_menu(String string)
	 {
		 drop_down.click();
		 
		 switch(string)
		 { 
		 	case "Arrays"      :  drop_down_array.click();
		                          break;
		 	case "Linkedlist" : drop_down_linkedlist.click();
		 	                     break;
		 	case "Stack"       : drop_down_stack.click();
		 	                     break;
		 	case "Queue"       : drop_down_queue.click();
		 	                     break;
		 	case "Tree"        : drop_down_tree.click();
		 	                     break;
		 	                     		 	                     
		 	case "Graph"       : drop_down_graph.click();
		 	                     break;
		 	                
	 }
	 
	 }
}

