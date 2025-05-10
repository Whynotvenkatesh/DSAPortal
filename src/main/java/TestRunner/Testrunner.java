package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/main/resources/Features/Login.feature",
                "src/test/resources/Features/Dashboard.feature",

        },
        glue = {"StepDefinations"}


)
public class Testrunner
{

}


