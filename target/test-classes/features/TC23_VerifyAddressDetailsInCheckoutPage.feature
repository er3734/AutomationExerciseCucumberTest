@TC23
Feature: TC23 Verify address details in checkout page

  Scenario: Verify address details in checkout page

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Signup_Login button
    And Fill all details in Signup and create account
    Then Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    Then Verify that Logged in as username is visible
    And Add products to cart
    And Click View Cart button
    And Click Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible and click Continue button