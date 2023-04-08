package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Padma/eclipse-kalpanasworkspace/SDET100/ninja+project/src/test/resources/features",
glue={"stepDefinition","hooks"}, 
plugin={"pretty","html:target/cucumberreports.html",
		"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

monochrome=true,publish=true) 

	
	public class testrunnner extends AbstractTestNGCucumberTests{
	@Override  @DataProvider(parallel = false)	
  	public Object[][] scenarios() {

	return super.scenarios();
    }
	}
	

