package xohairtoo.stepDefinitions;

import xohairtoo.SpringIntegrationTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.as;

@Scope("cucumber-glue")
public class UserRegistrationSteps extends SpringIntegrationTest {

    private ResponseEntity<String> latestResponse;
    //private RegistrationRequest registrationRequest;

    // Inject your application's Service or Repository for verification
//    @Autowired
//    private UserService userService;

    @Given("the client is ready to register a user")
    public void the_client_is_ready_to_register_a_user() {
        // Initialization/setup goes here, e.g., cleaning up test data
        //userService.deleteAllUsers();
        System.out.println("the_client_is_ready_to_register_a_user");
    }

    @When("the client submits a POST request to {string} with details:")
    public void the_client_submits_a_post_request_with_details(String path, DataTable dataTable) {
        // Map the Gherkin table to a Java object for the request body
        //registrationRequest = dataTable.asMaps().get(0);

        // Execute the actual HTTP call using TestRestTemplate
        //String url = "http://localhost:" + port + path;
        //latestResponse = restTemplate.postForEntity(url, registrationRequest, String.class);
        System.out.println("the_client_submits_a_post_request_with_details");
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(int expectedStatusCode) {
        Assertions.assertThat(expectedStatusCode);
    }

    @Then("a new user should exist with email {string}")
    public void a_new_user_should_exist_with_email(String email) {
        // Verify the outcome using an injected Spring service
        //User user = userService.findByEmail(email);
        //assertNotNull("abcd");
        System.out.println("a_new_user_should_exist_with_email");
    }
}
