package stepDefinitions;

/**
 * Created by mgoode on 12/7/16.
 */

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = {}
)
public class TestRunner {
}
