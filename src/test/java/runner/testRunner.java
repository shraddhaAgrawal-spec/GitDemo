package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import com.cucumber.listener.ExtentCucumberFormatter;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber.html"},
		 features = {"src/test/resources/features"},
		// tags = " @LoginTest ", 
		 glue = {"stepdefinition"}, 
		 monochrome = false

)

public class testRunner {
	

}
