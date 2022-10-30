@TC03
Feature: TC03 Kullanıcıyı yanlış e-posta ve parola ile oturum açın

  Scenario: Kullanıcıyı yanlış e-posta ve parola ile oturum açın

    Given Navigate to "autoexUrl" autoexercise
    And Verify that home page is visible successfully
    And Click on Signup_Login button
    And Verify Login to your account is visible
    And Enter incorrect email address and password
    And Click login button
    And Verify error Your email or password is incorrect! is visible