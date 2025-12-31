package TestNgRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/FeatureFiles", glue = "StepDefinitions", monochrome = true, plugin = {
		"pretty", "html:target/Cucumber.html" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
