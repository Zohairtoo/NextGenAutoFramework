package xohairtoo.stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.slf4j.Logger;

@ContextConfiguration
public class TestSetup {

    private static Logger log = LoggerFactory.getLogger(TestSetup.class);

    @Before
    public void setup(final Scenario scenario){
        System.out.println("This the @Before setup step getting executed");
        log.info("This the @Before setup step getting executed");
    }

    @After
    public void tearDown(final Scenario scenario){
        System.out.println("This the @After setup step getting executed");
        log.info("This the @After setup step getting executed");
    }
}
