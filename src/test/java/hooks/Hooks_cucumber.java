package hooks;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import java.io.ByteArrayInputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.baseclass;
import base.baseclass;
import io.qameta.allure.Allure;
import utils.configreader;
import utils.logger_log4j;



	public class Hooks_cucumber extends baseclass {
		public static WebDriver driver;
		private  static baseclass base_class;
		
		@BeforeAll
		public static void launchbrowser()  throws Throwable {
			
			logger_log4j.info("Loading Config file");
		//	
			configreader.read_configfile();
			//Reading browser from config.properties file
			String browser=configreader.read_browsertype();
			System.out.println("BROWSER TYPE READ FROM CONFIG FILE PASSED TO HOOKS:"+browser);
			base_class= new baseclass();
			
			driver=base_class.browser_setup(browser);
					
           
			logger_log4j.info("Intializing");
			
		}
		
			
		
		
//// code from bhansikha
//		package hooks;
//		import io.cucumber.java.AfterAll;
//		import io.cucumber.java.BeforeAll;
//		import io.cucumber.java.Scenario;
//		import io.qameta.allure.Allure;
//		import utils.logger_log4j;
//		//import utils.LoggerLoad;
//		import org.openqa.selenium.WebDriver;
//		import base.baseclass;
//		//import base.BaseClass;
//		import utils.configreader;
//	//	import utils.Configreader;
//		import org.openqa.selenium.OutputType;
//		import org.openqa.selenium.TakesScreenshot;
//		import java.io.ByteArrayInputStream;
//		import io.cucumber.java.AfterStep;
//		import io.cucumber.java.Before;
//
//
//		public class Hooks_cucumber {
//			private static WebDriver driver;
//			private static baseclass base;
//
//			@BeforeAll
//			public static void launchbrowser()  throws Throwable {
//				//Get Browser Type
//				logger_log4j.info("Loading config file");
//				//LoggerLoad.info("Loading Config file");
//				System.out.println("in hooks.Hook");
//				configreader.readConfig();
//				//Configreader.setbrowser(Configreader.prop.getProperty("browser"));
//				String browser = configreader.getbrowser();
//				System.out.println(configreader.getbrowser());
//				//System.out.println(Configreader.browser());
//				//Initialize driver from baseclass
//				base = new baseclass();
//				
//				driver = base.initialize(browser);
//				logger_log4j.info("Intializing" + browser +"driver");
//				
//			}	
//		
//		
//		
		
		
	//@AfterStep
	//	public void afterstep(Scenario scenario) {
	//	if (scenario.isFailed()) {
	//		logger_log4j.error("Steps Failed , Taking Screenshot");
	//			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		//		scenario.attach(screenshot, "image/png", "My screenshot");
//		Allure.attachment("Myscreenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
 		
	//	}
    	}
//
//		@AfterAll
//		public static void after() throws InterruptedException {
//			LoggerLoad.info("Closing Driver");
//			//Thread.sleep(5000);
//			BaseClass.closeallDriver();
//		}
//		
//
//	}
//	
	

