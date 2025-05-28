package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                //  "src/main/resources/Features/Login.feature",
                // "src/test/resources/Features/Dashboard.feature",

        },
        glue = {"StepDefinations"}


)
public class Testrunner
{

}

/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinations"}, // <- Must match your package name exactly
        plugin = {"pretty", "html:target/cucumber-reports"}
)
*/

