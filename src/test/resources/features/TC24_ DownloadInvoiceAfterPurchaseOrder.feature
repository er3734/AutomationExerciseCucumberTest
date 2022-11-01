@TC24
Feature: TC24  Download Invoice after purchase order

  Scenario:  Download Invoice after purchase order

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And  Add products to cart
    And Click View Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Click on Register_Login button
    And Fill all details in Signup and create account
    And  Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And  Verify that Logged in as username is visible
    And Click Cart button
    And  Click Proceed To Checkout
    And  Verify Address Details and Review Your Order
    And  Enter description in comment text area and click Place Order
    And  Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And  Click Pay and Confirm Order button
    And  Verify success message Your order has been placed successfully!
    And  Click Download Invoice button and verify invoice is downloaded successfully.
    And  Click Continue. button
    And  Click Delete Account button
    And  Verify that ACCOUNT DELETED! is visible and click Continue button