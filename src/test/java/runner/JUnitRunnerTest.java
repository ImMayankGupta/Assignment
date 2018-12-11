package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {"pretty"},
			glue = {"stepdefs"},//Your step definitions package.
			features ={"src/test/java/features"} )
	
	public class JUnitRunnerTest {}
