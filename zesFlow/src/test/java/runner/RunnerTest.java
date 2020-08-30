package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = " ",
        glue = "steps",
        plugin = {"json:target/reports/CucumberReports.json", "pretty"},
        snippets = SnippetType.CAMELCASE

)
public class RunnerTest {

}
