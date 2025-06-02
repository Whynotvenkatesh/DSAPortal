package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions
        (

                features = "src/main/java/Features", // Path to your .feature files //Multiple we add .feature files
                glue = "StepDefinations", // Path to your step definition classes //mutiple we can add Step def class // <- Must match your package name exactly
                plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
                monochrome = true,
                dryRun = false // Set to true to check for unimplemented steps

        )

public class TestRunner {


}

/*
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true) // Enable parallel execution
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
*/







/*
        features = {
                //  "src/main/resources/Features/Login.feature",
                // "src/test/resources/Features/Dashboard.feature",

        },
        glue = {"StepDefinations"}




public class Testrunner
 {

}

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinations"}, // <- Must match your package name exactly
        plugin = {"pretty", "html:target/cucumber-reports"}
)
*/

