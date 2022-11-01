@TC09
Feature:TC09 Search Product

  Scenario:Search Product

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product "T-Shirt" in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to "T-Shirt" are visible