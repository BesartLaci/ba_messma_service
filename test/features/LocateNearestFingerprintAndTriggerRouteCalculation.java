package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class LocateNearestFingerprintAndTriggerRouteCalculation {

    @Given("there are GridPoints:")
    public void there_are_GridPoints(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("there are FingerPrintSnippets:")
    public void there_are_FingerPrintSnippets(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the client {string} requests Guidance to Destination {string} with telemetry:")
    public void the_client_requests_Guidance_to_Destination_with_telemetry(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I know the position from client {string} is the same as chosenDestination")
    public void i_know_the_position_from_client_is_the_same_as_chosenDestination(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("will return {string}")
    public void will_return(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I will not trigger {string}")
    public void i_will_not_trigger(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("we approximate the client {string} to the {string} GridPoint")
    public void we_approximate_the_client_to_the_GridPoint(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the client {string} wants to go to the {string} GridPoint")
    public void the_client_wants_to_go_to_the_GridPoint(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("we trigger {string}")
    public void we_trigger(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
