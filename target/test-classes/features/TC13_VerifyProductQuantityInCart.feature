@TC13
Feature: TC13 Verify Product quantity in Cart

  Scenario: Verify Product quantity in Cart

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click View Product for any product on home page
    Then Verify product detail is opened
    And Increase quantity to 4
    And Click Add to cart button
    And Click View Cart button
    Then Verify that product is displayed in cart page with exact quantity