@TC16
Feature: TC16 Place Order: Login before Checkout

  Scenario: Place Order: Login before Checkout

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Signup_Login button
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Add products to cart
    And Click View Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout
    Then Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button