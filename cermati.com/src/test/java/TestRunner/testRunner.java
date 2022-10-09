package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//feature/register.feature",
		glue= "StepDefinitions",
		dryRun= false,
		format= {"pretty", "html: test-output", "json:target/report-json"}
	)
public class testRunner {

}
