
Feature: TC-001 Create New User/SignUp

  Scenario: I should be able to create account and signup
    Given  I am on homepage
    When   I click on signin button
    Then  I navigate to signup page
    And   I can create account with random username
