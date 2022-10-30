@TC08
Feature: TC07 Verify All Products and product detail page

  Scenario: Verify All Products and product detail page

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then The products list is visible
    And Click on View Product of first product
    And User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand