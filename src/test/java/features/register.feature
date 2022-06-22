@test
Feature: Registration
  Scenario: As a user, I should able to register successfully
  So that. I can use all feature on nop commerce website


    Given I am on registration page
    When  I enter registration
    And I click on register submit button
    Then I should able to registered successfully
    And I should be logged in