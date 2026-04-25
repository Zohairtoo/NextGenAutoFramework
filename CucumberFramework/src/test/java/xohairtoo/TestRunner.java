package xohairtoo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"xohairtoo"},
        plugin = {"pretty", "html:target/cucumber-reports/"+ "cucumber-pretty.html", "json:target/cucumber-reports/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // This class is empty, it just acts as the runner
}
