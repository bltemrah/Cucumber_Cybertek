package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @Given("the user is on the Vehicle page under Fleet")
    public void the_user_is_on_the_Vehicle_page_under_Fleet() {

    }

    @When("the user is in expected page")
    public void the_user_is_in_expected_page() {

    }

    @Then("the user should be able to see URL related to fleet")
    public void the_user_should_be_able_to_see_URL_related_to_fleet() {
        System.out.println("https://qa3.vytrack.com/entity/fleet");
    }

    @Given("the user is on the Marketing page under Campaigns")
    public void the_user_is_on_the_Marketing_page_under_Campaigns() {

    }

    @Then("the user should be able to see URL related to campaigns")
    public void the_user_should_be_able_to_see_URL_related_to_campaigns() {
        System.out.println("https://qa3.vytrack.com/campaign");

    }

    @Given("the user is on the Calendar events page under Activities")
    public void the_user_is_on_the_Calendar_events_page_under_Activities() {

    }

    @Then("the user should be able to see URL related to event")
    public void the_user_should_be_able_to_see_URL_related_to_event() {
        System.out.println("https://qa3.vytrack.com/calendar/event");

    }
}
