package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
//      dryRun = true, Cucumber will only checks that every Step mentioned in the Feature File have corresponding code
//      written in Step Definition file or not
        features={"src/test/resources/features/main_page",
                  "src/test/resources/features/basic_auth",
                  "src/test/resources/features/add_remove_elements",
                  "src/test/resources/features/a_b_testing"},
        glue={"step_definitions.main_page_definitions/",
              "step_definitions.basic_auth_definitions/",
              "step_definitions.add_remove_elements_definitions/",
              "step_definitions.a_b_testing_definitions/"}
        )
public class TestRunner {

}