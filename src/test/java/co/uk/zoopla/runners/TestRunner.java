package co.uk.zoopla.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

    features = {"src/test/java/co/uk/zoopla/features"},
    glue = {"co/uk/zoopla/hooks", "co/uk/zoopla/StepDefinitions"},
        publish = true
)
public class TestRunner {
}
