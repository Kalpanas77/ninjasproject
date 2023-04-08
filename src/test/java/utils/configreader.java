package utils;
import java.io.*;
import java.util.*;

public class configreader {
	
 private static final String properties_path = "C:/Users/Padma/eclipse-kalpanasworkspace/SDET100/ninja+project/src/test/resources/config/config.properties";
 private static String browserType = null;
 private static Properties 	prop;
	
	public static void read_configfile() throws IOException
	{
		FileInputStream fis;
		fis= new FileInputStream( properties_path);
		prop = new Properties();
		prop.load(fis);
		
		logger_log4j.info("---Reading properties  from config.properties file");
		
	}
	
	public static String read_browsertype()
	{
		String browser_value = prop.getProperty("browser");
		System.out.println("Browser name :"+browser_value);
		if(browser_value!=null)
		{ 
			return browser_value;
		}
		else
		{
			throw new RuntimeException("Browser not specified in config.properties file");
		}
		
    }
// Reading application url from config file
	public static String app_url()
	{
		String url = prop.getProperty("base_url");
		if (url != null)
		{
			System.out.println("URL:"+url);
			return url;
		}
		else
			throw new RuntimeException("Application url not specified in config file");
	}	
	public static String homePage() { 
		String homePageurl = prop.getProperty("homepage_url");
		if (homePageurl != null)
		{
			System.out.println("HOME PAGE URL :"+homePageurl);
			return homePageurl;
		}		
		else
			throw new RuntimeException("HomePageurl not specified in the Config.properties file");
	}
	
	public static String Register()
	{
		String  reg_url= prop.getProperty("registerpage_url");
		if(reg_url !=null)
		{
			System.out.println("REGISTRATION PAGE :"+reg_url);
			return reg_url;
		}	
		else
		{
		  throw new RuntimeException("Registration page url not specified in config file");	
		}
	}
	
	public static String excel_data()
	{
		String ex_data = prop.getProperty("excel_path");
		System.out.println("EXCEL FILE PATH:"+ex_data);
		if(ex_data!=null)
		{
			return ex_data;
		}
		else
		{
			 throw new RuntimeException("Excel page url not specified in config file");		
		}
		
	}
	
	public static String  sigin()
	{
		String sin_url = prop.getProperty("signin_url");
		if(sin_url != null)
		{
			return sin_url;
		}
			else
		{
			throw new RuntimeException("SignIn  page url not specified in config file");
		}	
			
		
	}
	
	public static String linktoqueue()
	{
		String read_queue = prop.getProperty("Queue");
		if (read_queue !=null)
		{
			return read_queue;
		}
		else
		{
			throw new RuntimeException("QUEUE  page url not specified in config file");
		}
	}
		
		public static String linktoQueue_Implem()
		{
			String read_linkq = prop.getProperty("Queue_Implem");
			if(read_linkq != null)
			{	
				return read_linkq;
			}
			else
		      throw new RuntimeException("Queue Implementation  page not specified in config file");
			
		}
		public static String py_editor()
		{
			String ed = prop.getProperty("Editor");
			if (ed != null)
			{
				return ed;
			}
			else
				throw new RuntimeException("Editor page url not specified in config file");
		}
		
		public static String queue_collect()
		{
			String coln = prop.getProperty("Queue_collect");
			if(coln!=null)
				return coln;
			else
				throw new RuntimeException("Collection page url not specified in config file");
				
		}
		
		public static String queue_array()
		{
			String arr = prop.getProperty("Queue_imp_array");
			if(arr!=null)
				return arr;
			else
				throw new RuntimeException("Queue Implementatiom Array page url not specified in config file");
				
		}
		
		public static String queue_opns()
		{
			String q_opr = prop.getProperty("Queue_operations");
			if(q_opr!=null)
				return q_opr;
			else
				throw new RuntimeException("Queue Opeartions page url not specified in config file");
				
		}
		public static String pr_quest()
		{
			String p_qt = prop.getProperty("Prac_quest");
			if(p_qt!=null)
				return p_qt;
			else
				throw new RuntimeException("Practice Question page url not specified in config file");
				
		}
		
	}
	
	
	
	
	
