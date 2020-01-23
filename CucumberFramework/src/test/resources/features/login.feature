@Login
Feature: Sign In
  As an employee of the company
  I want to login to application with my credentails
  In order to use the application features.

  Background: User navigates to Applicaton URL
    Given I am on the Login pahe URL "http://192.168.43.16:2511/"
    Then I should see Log In Page

  @sanity
  Scenario: Sign In with valid credential
    When I enter username as "admin"
    And I enter password as "password"
    And Click on login button
