package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appFeature/Billing.feature"},
		glue = {"stepDefinations"},
		plugin = {"pretty"},
		monochrome = true,
		dryRun = false,
		publish = true
		)

public class BillingTest {

}
