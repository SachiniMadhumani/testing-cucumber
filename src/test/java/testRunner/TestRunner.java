package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\User\\Desktop\\Assignment\\src\\test\\resources",
        glue = {"stepDefinition"})
public class TestRunner {


}
