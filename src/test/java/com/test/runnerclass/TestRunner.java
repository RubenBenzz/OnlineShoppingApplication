package com.test.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/FeatureFiles", glue = { "com.test.steps" }, tags = {
		"@shop" }, plugin = { "json:target/cucumber-report-composite.json", "pretty", "html:target/cucumber/",
				"rerun:target/rerun.txt" })

public class TestRunner {

}
