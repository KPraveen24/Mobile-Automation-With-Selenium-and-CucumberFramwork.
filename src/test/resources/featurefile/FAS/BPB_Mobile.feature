@EIP4_FAS_Mobile_Automation @EIP4_BPB 
Feature: EIP40 Bank Payment Booking Mobile Application 
  
  UserStory: EIP40 Mobile Application Finance
 
  Description : As a EIP User i should be able to EIP40 Mobile App

	Scenario: As a EIP User i should be able to Login Approve Bank Payment Booking (BPB) from EIP40 Mobile App
	
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can de able to select BPB Document
    And Verify user can able to select to Document
    And Verify user can able to Approve to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application    

  Scenario: As a EIP User i should be able to Login Reject Bank Payment Booking (BPB) from EIP40 Mobile App
   
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can de able to select BPB Document
    And Verify user can able to select to Document
    And Verify user can able to Rejeted to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application
 
  Scenario: As a EIP User i should be able to Login Document View Bank Payment Booking (BPB) from EIP40 Mobile App
  
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can de able to select BPB Document
    And Verify user can be click to View the Document
    And Verify user can be Get Document Number
    And Verify user can be Get Accounting Center
    And Verify user can be Get Document Creater Date
		And Verify user can be Get Document Register Type
		And Verify user can ve Get Document Favouring
		And Verify user can be Get Document Voucher Amount
    And Verify user can be close to view page
    Then Verify user can be able to Logout to EIP Mobile Application

  Scenario: As a EIP User i should be able to Login Document Attachment View Bank Payment Booking (BPB) from EIP40 Mobile App
  
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can de able to select BPB Document
    And Verify user can be to Attachment view 
    Then Verify user can be able to Logout to EIP Mobile Application
    
  Scenario: As a EIP User i should be able to Login Work Flow Trace Bank Payment Booking (BPB) from EIP40 Mobile App
  
  	Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench
    And Verify user can de able to select BPB Document
    And Verify user can able to click on Work flow trace 
    And Verify user can able to get listout flow
    Then Verify user can be able to Logout to EIP Mobile Application
 

    