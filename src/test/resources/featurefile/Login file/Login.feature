@Sign_Login_Activity
Feature: Sign_in
  
  UserStory: Sign_in
 
  Description : As a EIP User i should be able to Sign in EIP40Mobile App
 

  @Signin
  Scenario: As a EIP User i should be able to Sign in EIP40Mobile App
    Given Verify user can be able to Launch EIP40Mobile Application
    Then Verify user can be able to Enter Email ID
    Then Verify user can be able to Enter Password
    Then Verify user can be able to Sign_in to EIP40App
    Then Verify user can be able to Choose Stay Signed in
    Then Verify Name and Email Id displayed Correctly
    Then Verify user can be able to Enter mobile app PIN
    Then Verify user can be able to Enter mobile app PIN to confirm
    Then Verify user can be able to Register Device

  @Login
  Scenario: As a EIP User i should be able to Login in EIP40Mobile App
    Given Verify user can be able to Signin to EIP Mobile Application
    Then Verify user can be able to Enter Device Pin
    Then Verify user can be able to Login EIPMobile Application

  @Logout
  Scenario: As a EIP User i should be able to Logout from EIP40Mobile App
    Given Verify user can be able to Login EIPMobile Application
    Given Verify user can be able to Logout to EIP Mobile Application

