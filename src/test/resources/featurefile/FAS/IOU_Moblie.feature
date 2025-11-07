@EIP4_FAS_Mobile_Automation @EIP4_IOU
Feature: EIP40 I Own You Mobile Application 
  
  UserStory: EIP40 Mobile Application Finance
 
  Description : As a EIP User i should be able to Sign in EIP40Mobile App
 
	Scenario: As a EIP User i should be able to Login Approve I Own You (IOU) from EIP40 Mobile App
	
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can be able to select to IOU Document
    And Verify user can able to select to Document
    And Verify user can able to Approve to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application
  
  Scenario: As a EIP User i should be able to Login Reject I Own You (IOU) from EIP40 Mobile App
   
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can be able to select to IOU Document
    And Verify user can able to select to Document
    And Verify user can able to Rejeted to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application
  
  Scenario: As a EIP User i should be able to Login Document View I Own You (IOU) from EIP40 Mobile App
  
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can be able to select to IOU Document
    And Verify user can be click to View the Document
    And Verify user can be Get Document Number
    And Verify user can be Get Accounting Center
    And Verify user can be Get Document Creater Date
    And Verify user can be Get Document Creater Name
    And Verify user can be Get Document Purpose
    And Verify user can be Get Document Type
    And Verify user can be Get Amount
    And Verify user can be close to view page
    Then Verify user can be able to Logout to EIP Mobile Application
  
  Scenario: As a EIP User i should be able to Login Document Attachment View I Own You (IOU) from EIP40 Mobile App
  
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can be able to select to IOU Document
    And Verify user can be to Attachment view 
    Then Verify user can be able to Logout to EIP Mobile Application
    
  Scenario: As a EIP User i should be able to Login Work Flow Trace I Own You (IOU) from EIP40 Mobile App
  
  	Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can be able to select to IOU Document
    And Verify user can able to click on Work flow trace 
    And Verify user can able to get listout flow
    Then Verify user can be able to Logout to EIP Mobile Application
    
       