@TC02
Feature:TC02 Kullanıcıyı doğru e-posta ve parola ile oturum açın

  Scenario: Kullanıcıyı doğru e-posta ve parola ile oturum açın

    Given Navigate to "autoexUrl" autoexercise
    Then Verify that home page is visible successfully
    And Click on Signup_Login button
    Then Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    Then Verify that Logged in as username is visible
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button