package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Kushal.Gaddhyan\\workspace\\BabbelWebAutomation\\src\\main\\java\\Features" //the path of the feature file
		,glue = {"StepDefinition"},//the path of the step definition file
		format = {"pretty","html:test-output" , "json:json_output/cucumber.json"},//to generate pretty output of test runs
		monochrome = true,//displays the output in the console in readable format,
		strict = true,//it will check if any step is not defined
		dryRun=false// to check whether the mapping is correct between feature and step definition
		)

public class TestRunner {

}
