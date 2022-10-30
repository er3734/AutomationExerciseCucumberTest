@TC05
Feature: TC05 Kullanıcıyı mevcut e-posta ile kaydedin

  Scenario: Kullanıcıyı mevcut e-posta ile kaydedin

    Given Navigate to "autoexUrl" autoexercise
    And Verify that home page is visible successfully
    And Click on Signup_Login button
    Then Verify New User Signup! is visible
    And Enter name and already registered email address
    And Click Signup button
    Then Verify error Email Address already exist! is visible
