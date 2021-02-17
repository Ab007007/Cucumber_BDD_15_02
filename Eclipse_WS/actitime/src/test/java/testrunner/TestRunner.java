package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature/",
		glue = {"stepdefinition"},
		plugin = {"pretty","junit:target/JunitReport/report.xml",
				  			"html:target/htmlReports/report.html",
				  			"json:target/JsonReports/report.json"},
		tags = "@dev",
		//dryRun = true,
		monochrome = true
		)
public class TestRunner {
	 
}
