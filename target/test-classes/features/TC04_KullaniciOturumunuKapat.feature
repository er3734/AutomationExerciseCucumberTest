@TC04
Feature: TC04 Kullanıcı Oturumunu Kapat

  Scenario: Kullanıcı Oturumunu Kapat

    Given Navigate to "autoexUrl" autoexercise
    And Verify that home page is visible successfully
    And Click on Signup_Login button
    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    Then Verify that Logged in as username is visible
    Then Verify that Logged in as username is visible
    And Click Logout button
    Then Verify that user is navigated to login page