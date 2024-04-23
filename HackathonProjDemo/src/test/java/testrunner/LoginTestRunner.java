package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/login.feature" }, 
				glue = { "stepdefinitions" }, 
				plugin = {"pretty", "html:target/cucumber-html-report.html"},									
				dryRun = true,
				monochrome = true)
public class LoginTestRunner extends AbstractTestNGCucumberTests {

}
