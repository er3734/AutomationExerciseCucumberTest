@TC11
Feature:TC11 Verify Subscription in Cart page

  Scenario:Verify Subscription in Cart page

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click Cart button
    And Scroll down to footer
    Then Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible