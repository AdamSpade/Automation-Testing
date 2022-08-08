package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    @Given("^User is on bank landing page$")
    public void userIsOnGoogleLandingPage() {
        System.out.println("Testing userIsOnGoogleLandingPage method - navigated to landing page");
    }

    @When("^User logs into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLogsIntoApplicationWithUsernameAndPassword(String username, String password) {
        System.out.println("Testing userLogsIntoApplicationWithUsernameAndPassword method - logs in to app with credentials " + username + " and " + password);
    }

    @Then("^Homepage is populated$")
    public void homepageIsPopulated() {
        System.out.println("Testing homepageIsPopulated method - homepage populates after login");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cardsAreDisplayed(boolean bool) {
        System.out.println("Testing cardsAreDisplayed method - cards displayed: " + bool);
    }
}
