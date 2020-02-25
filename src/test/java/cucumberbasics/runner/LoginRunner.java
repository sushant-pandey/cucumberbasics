package cucumberbasics.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/cucumberbasics/featureFiles/"}, glue= {"cucumberbasics/stepDefinition/"},
		tags= {}, monochrome=true,
		plugin = {"pretty", "html:target/cucumberreport", "json:target/cucumberreport.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)
public class LoginRunner {

}
