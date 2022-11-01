@TC22
Feature: TC22 Add to cart from Recommended items

  Scenario: Add to cart from Recommended items

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Scroll to bottom of page
    And Verify RECOMMENDED ITEMS are visible
    And Click on Add To Cart on Recommended product
    And Click View Cart button
    And Verify that product is displayed in cart page