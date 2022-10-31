@TC17
Feature: TC17 Remove Products From Cart

  Scenario: Remove Products From Cart

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Add products to cart
    And Click View Cart button
    Then Verify that cart page is displayed
    And Click X button corresponding to particular product
    Then Verify that product is removed from the cart.