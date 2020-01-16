
@navigation
  Feature: Navigation Menu

    Scenario: Sales Manager is in Vehicle page under Fleet module
      Given the user is on the login page
      When the user is in expected page
      Then the user should be able to see URL related to fleet

    Scenario: Login as Sales Manager
      Given the user is on the Marketing page under Campaigns
      When the user is in expected page
      Then the user should be able to see URL related to campaigns

    Scenario: Login as Sales Manager
      Given the user is on the Calendar events page under Activities
      When the user is in expected page
      Then the user should be able to see URL related to event

