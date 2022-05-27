
  Feature: Signin and verify the address

    Scenario: TC-002 Sign In with newly created user credentials
      Given I am on homepage
      When Login using newly create credentials
      Then I shall verify the address information in my address section

    Scenario: TC-004 Contact customer service for the previous successful order
      Given I am on the Sign In Page
      When Login using newly create credentials
      And I am on the contact page
      Then I send refund request to customer care for previous order