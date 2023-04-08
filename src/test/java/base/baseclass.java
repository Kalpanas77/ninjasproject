package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.apache.logging.log4j.*;

public class baseclass {
	
//  public static Logger log;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public WebDriver browser_setup(String browser_name) throws Exception
	{
		if(browser_name.equalsIgnoreCase("chrome"))
				{
			
			   WebDriverManager.chromedriver().setup();
			   ChromeOptions co= new ChromeOptions();
			   co.addArguments("--remote-allow-origins=*");
			   co.setAcceptInsecureCerts(true);
			  // WebDriverManager.chromedriver().create();
		    	 driver = new ChromeDriver(co);
				}
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			 driver  = new FirefoxDriver();
			 
		}
		else if(browser_name.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else 
		{
			throw new RuntimeException("Browser type not supported");
			
		}
		 //Setting implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		//Setting WebDriverWait with max timeout value of 20 seconds
		wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		
		return driver;
		
	
	}

	public static WebDriver getdriver()
	{
		return driver;
	}
	
	}

	

	

	

//// code from bhansikha
//package base;
//import java.time.Duration;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.WebDriverManager;
//public class baseclass {
//	public static WebDriver driver;
//	public static WebDriverWait wait;
//	public  WebDriver initialize(String browser)throws  Exception  {
//		if (browser.equalsIgnoreCase("Chrome")) {
//			WebDriver driver = WebDriverManager.chromedriver().create();
//			ChromeOptions CO= new ChromeOptions();
//			CO.addArguments("--remote-allow-origins=*");	
//			// driver = new ChromeDriver(CO);
//		}
//		else if(browser.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}else if (browser.equalsIgnoreCase("Firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}
//		else {
//			throw new RuntimeException("BrowserType Not Supported");
//		}
//		//Setting implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.manage().window().maximize();
//		
//		//Setting WebDriverWait with max timeout value of 20 seconds
//		wait =new WebDriverWait(driver,Duration.ofSeconds(20));
//		return driver;
//	}
//	public static  WebDriver getdriver() {
//		return driver;
//	}
//	public void closeallDriver() {
//		driver.close();
//	}
//	//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//WebDriverManager.chromedriver().setup();
//		//ChromeOptions CO= new ChromeOptions();
//		//CO.addArguments("--remote-allow-origins=*");	
//		//WebDriver driver = new ChromeDriver(CO);
//		
//		//driver.get("http://google.com");
//		//driver.close();
//	
//	}







