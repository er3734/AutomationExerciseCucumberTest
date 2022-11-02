@TC26
Feature: TC26 Verify Scroll Up without 'Arrow' button and Scroll Down functionality

  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Scroll down page to bottom
    Then Verify SUBSCRIPTION is visible
    And Scroll up page to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen

