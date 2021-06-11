package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "features"
		 ,glue={"test.mm.stepdefs"},
		 plugin = {"pretty","json:target/cucumber.json","html:target/htmlreport"} 
		)

public class Runner {

	
}
