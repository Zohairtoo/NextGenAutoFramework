package xohairtoo.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Scope;
import xohairtoo.SpringIntegrationTest;
import xohairtoo.service.stepService.ProductStepService;

import java.util.Map;

@Scope("cucumber-glue")
public class FakeStoreApiSteps extends SpringIntegrationTest {

    @Resource
    private ProductStepService productStepService;

    @Given("client navigates to fakeStoreApi")
    public void client_navigates_to_fake_store_api() {
        System.out.println("Executed step: client navigates to fakeStoreApi");
    }

    @When("client creates a new user")
    public void client_creates_a_new_user(Map<String, String> userDetails) {
        String email = userDetails.get("email");
        String password = userDetails.get("password");
        System.out.println("Executed step: client creates a new user");
    }

    @Then("client logs in with user_pass")
    public void client_logs_in_with_user_pass() {
        System.out.println("Executed step: client logs in with user_pass");
    }

    @Given("client creates a new product")
    public void client_creates_a_new_product() {
        productStepService.getListOfProducts();
        System.out.println("Executed step: client creates a new product");
    }

    @Given("product is successfully added")
    public void client_is_successfully_added() {
        System.out.println("Executed step: product is successfully added");
    }

    @Given("client is successfully added")
    public void clientIsSuccessfullyAdded() {
        System.out.println("Executed step: client is successfully added");
    }
}
