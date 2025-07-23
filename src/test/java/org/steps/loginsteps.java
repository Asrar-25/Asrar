package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class loginsteps extends stepObjects {

    @Given("Launch expedia home page")
    public void loginpage() throws InterruptedException, IOException {
     lp.loginintoapplication();

    }

    @When("I click on the Flights link")
    public void clickLink(){
      lp.clickFlightsLink();
    }

    @And("I select the One-way option")
    public void iSelectTheOneWayOption() {
        lp.oneWay();
    }

    @And("I enter Leaving from as {string}")
    public void iEnterLeavingFromAs(String arg0) {
        lp.leavingFrom("chennai");
    }

    @And("I enter Going to as {string}")
    public void iEnterGoingToAs(String arg0) {
        lp.goingTo("delhi");
    }

    @And("I select two travelers and Economy class")
    public void iSelectTravelersAndEconomyClass(int arg0) {
        lp.travelers();
    }

    @Then("I click on the Search button")
    public void iClickOnTheSearchButton() {
        lp.search();
    }

    @And("I should see the search results for the above search criteria")
    public void iShouldSeeTheSearchResultsForTheAboveSearchCriteria() throws IOException {
        lp.screenShot();

    }

}
