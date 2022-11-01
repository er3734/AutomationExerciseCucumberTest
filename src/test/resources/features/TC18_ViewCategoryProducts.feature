@TC18
Feature: TC18 View Category Products

  Scenario: View Category Products

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Women category
    And Click on any category link under Women category
    Then Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    And On left side bar, click on any sub-category link of Men category
    And Verify that user is navigated to that category page