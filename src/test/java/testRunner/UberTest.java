package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appFeature/Uber.feature"},
		glue = {"stepDefinations"},
		plugin = {"pretty"},
		tags = "@End2End or @Smoke",
		monochrome = true,
		dryRun = false
		
		)

public class UberTest {

}

