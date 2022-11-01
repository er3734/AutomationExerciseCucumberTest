@TC19
Feature: TC19 View & Cart Brand Products

  Scenario: View & Cart Brand Products

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify that Brands are visible on left side bar
    And Click on any brand name
    Then Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    Then Verify that user is navigated to that brand page and can see products