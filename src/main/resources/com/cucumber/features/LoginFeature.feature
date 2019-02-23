@Login
Feature: Login application
  I want to use this test for login

  @smoke
  Scenario: Login to automationpractice.com
    Given I launch browser and navigate to application
    And I click on Sign in link
    And I enter Email address
    And I enter Password
    When I click on Sign in button
    Then I verify Login is success
