@login
#if we put @login here it runs all scenario in CukesRunner with defining tags = "@login"
Feature: Users should be able to login

  #Each scenario is one test case

  @driver @smoke  @wip
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enter the driver information
    Then the user should be able to login

  @sales_manager @smoke @db
  Scenario: Login as a manager
    Given the user is on the login page
    When the user enter the sales manager information
    Then the user should be able to login

  @store_manager @smoke @db
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enter the store manager information
    Then the user should be able to login



