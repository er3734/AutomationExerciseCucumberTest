@TC20
Feature: TC20 Search Products and Verify Cart After Login

  Scenario: Search Products and Verify Cart After Login

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product "T-Shirt" in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to "T-Shirt" are visible
    And Add those products to cart
    And Click Cart button
    Then Verify "T-Shirt" that products are visible in cart
    And Click on Signup_Login button
    And Submit login details
    And Again, go to Cart page
    And Verify that "T-Shirt" products are visible in cart after login as well