@TC21
Feature: TC21 Add review on product

  Scenario: Add review on product

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Click on View Product of first product
    Then Verify Write Your Review is visible
    And Enter name, email and review an click Submit button
    Then Verify success message Thank you for your review.