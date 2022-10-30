@TC10
Feature: TC10 Verify Subscription in home page

  Scenario: Verify Subscription in home page

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And  Scroll down to footer
    Then  Verify text SUBSCRIPTION
    And  Enter email address in input and click arrow button
    Then  Verify success message You have been successfully subscribed! is visible