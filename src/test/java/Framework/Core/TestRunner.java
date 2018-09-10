package Framework.Core;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by mdrahman on 9/8/18.
 * Spring 2018
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/site/cucumber-pretty"},

        snippets = cucumber.api.SnippetType.CAMELCASE,

        features = {"src/test/Resources/Features/Web/Homepage.feature"},

        tags = {"@login-1"},

        glue = {"Framework.WebDrivers_Local","Stepdefinition"}

)




public class TestRunner {

}
