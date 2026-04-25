package xohairtoo;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = TestAutomationApplication.class)
public class SpringIntegrationTest {

    // The random port Spring Boot starts on is useful for testing
//    @LocalServerPortßß
//    protected int port;
}
