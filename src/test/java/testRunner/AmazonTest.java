package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appFeature/Search.feature"},
		glue = {"stepDefinations", "MyHooks"},
		plugin = {	"pretty",
					"json:target/MyReports/report.json",
					"junit:target/Myreports/report.xml"
					},
		monochrome = true,
		dryRun = false,
		publish = true
		
		)

// here if we take "AmazonTestRun/Runner" it's doesn't execute in cmd
public class AmazonTest {


} 
