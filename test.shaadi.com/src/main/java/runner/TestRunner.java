package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "/home/manish/git/cucumberSelenium.BDDFrameWork/test.shaadi.com/src/main/java/Features/loginMapTable.feature" //set the path of the feature files
		  , glue = {"stepDefinitions"} //set the path of the step definition files
		  , monochrome = true //makes the console more readable
		  , dryRun = false //true: checks if all the steps have the step definition
		  , strict = true //true: will fails execution of there are undefined or pending steps
		  , plugin = {"pretty", "html:test-output", "json:test-output/cucumber.json", "junit:test-output/cucumber.xml"}
		  //, tags = {"signUp"}
		  )



public class TestRunner {

}
