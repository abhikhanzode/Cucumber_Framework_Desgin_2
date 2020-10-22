package cucumberOptions;

import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features ="src/test/java/feature",
		glue = {"StepDefinationPkg"},
		plugin = {"pretty","html:target/cucumber","json:target/cucumber.json"})

@Listeners(cucumberOptions.Listeners.class)

public class TestRunner extends AbstractTestNGCucumberTests {

}
