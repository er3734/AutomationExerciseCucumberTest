@TC12
Feature: TC12 Add Products in Cart

  Scenario:  Add Products in Cart

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    Then Verify both products are added to Cart
    Then Verify their prices, quantity and total price