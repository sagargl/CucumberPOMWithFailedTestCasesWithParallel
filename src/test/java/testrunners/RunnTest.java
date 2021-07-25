package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/AppFeatures/AccountsPage.feature"},
glue= {"stepdefinitions", "AppHooks"},
tags="not @Skip",
plugin= {"pretty",  
				"timeline:test-output-thread/"}
)

public class RunnTest {

}
