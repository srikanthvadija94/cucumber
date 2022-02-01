package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appFeature/Login.feature"},
		glue = {"stepDefinations"},
		plugin = {"pretty"},
		monochrome = true,
		dryRun = false
		)


public class LoginTest {

}
