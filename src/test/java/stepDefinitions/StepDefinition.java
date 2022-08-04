package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver chromeDriver = new ChromeDriver();

    @Given("^User is on Google landing page$")
    public void userIsOnGoogleLandingPage() {
        System.out.println("Testing userIsOnGoogleLandingPage method - navigated to landing page");
        chromeDriver.get("http://www.google.com");
        chromeDriver.findElement(By
                        .id("https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/&ec=GAZAmgQ"))
                        .getAttribute("href");
    }

    @When("^User logs into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLogsIntoApplicationWithUsernameAndPassword(String username, String password) {
        System.out.println("Testing userLogsIntoApplicationWithUsernameAndPassword method - logs in to app with credentials " + username + " and " + password);
    }

    @Then("^Profile page is populated$")
    public void homepageIsPopulated() {
        System.out.println("Testing homepageIsPopulated method - homepage populates after login");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cardsAreDisplayed(boolean bool) {
        System.out.println("Testing cardsAreDisplayed method - cards displayed: " + bool);
    }
}
