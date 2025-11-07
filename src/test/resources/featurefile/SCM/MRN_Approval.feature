@EIP4_SCM_Mobile_Automation
Feature: EIP40 Material Receipt Notes (MRN) Mobile Application
  
  UserStory: EIP40 Mobile Application Supply Chain Management
  
  Description :User i should be able to EIP40 Mobile App
@MRN
  Scenario: User i should be able to Login Approved Material Receipt Notes (MRN) from EIP40 Mobile App
  
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select MRN Document
    And Verify user can able to View to Document
    And Verify user can able to Approve to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application

  Scenario: User i should be able to Login Document View Material Receipt Notes (MRN) from EIP40 Mobile App
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select MRN Document
    And Verify user can be click to View the Document
    And Verify user can be Get Document Number
    And Verify user can be Get Document Purpose
    And Verify user can be Get Job
    And Verify user can be Get Receivec from
    And Verify user can ve Get Receivec date
    And Verify user can be Get sender remarks
    And Verify user can be Get Approver remarks
    And Verify user can be close to view page
    Then Verify user can be able to Logout to EIP Mobile Application

  Scenario: User i should be able to Login Document Attachment View Material Receipt Notes (MRN) from EIP40 Mobile App
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select MRN Document
    And Verify user can be to Attachment view
    Then Verify user can be able to Logout to EIP Mobile Application

  Scenario: User i should be able to Login Work Flow Trace Material Receipt Notes (MRN) from EIP40 Mobile App
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select MRN Document
    And Verify user can able to click on Work flow trace
    And Verify user can able to get listout flow from SR
    Then Verify user can be able to Logout to EIP Mobile Application
