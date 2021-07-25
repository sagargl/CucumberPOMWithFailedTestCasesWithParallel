package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"@target/failedrun.txt"},
glue= {"stepdefinitions", "AppHooks"},
plugin= {"pretty",  
		"timeline:test-output-thread/",
		"rerun:target/failedrun.txt"})


public class ReRunTest {
	

}
