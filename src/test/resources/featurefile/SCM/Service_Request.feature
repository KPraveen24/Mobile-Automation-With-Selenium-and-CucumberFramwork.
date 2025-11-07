@EIP4_SCM_Mobile_Automation @Service_Request
Feature: EIP40 Service Request Mobile Application 
  
  UserStory: EIP40 Mobile Application Supply Chain Management
 
  Description : As a EIP User i should be able to EIP40 Mobile App

	Scenario: User can able to Approved on Service Request (SR) from EIP4O Mobile Application
	
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select SR Document
    And Verify user can able to select to Document
    And Verify user can able to Approve to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application    

  Scenario: As a EIP User i should be able to Login Reject Service Request (SR) from EIP40 Mobile App
   
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select SR Document
    And Verify user can able to select to Document
    And Verify user can able to Rejeted to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application


	Scenario: As a EIP User i should be able to Login Hold Service Request (SR) from EIP40 Mobile App
	
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select SR Document
    And Verify user can able to select to Document
    And Verify user can able to Hold to Document
    And Verify user can able to Handle Alert Message from Hold
    Then Verify user can be able to Logout to EIP Mobile Application 
    
 Scenario: As a EIP User i should be able to Login Hold document Appprove Service Request (SR) from EIP40 Mobile App
	
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select SR Document
    And Verify user can able to click on Hold icon
    And Verify user can able to select to Document
    And Verify user can able to Hold in Approve to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application 
     
 	Scenario: As a EIP User i should be able to Login Hold Service Request (SR) from EIP40 Mobile App
	
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select SR Document
    And Verify user can able to select to Document
    And Verify user can able to Hold to Document
    And Verify user can able to click on Hold icon
    And Verify user can able to select to Document
    And Verify user can able to Hold and Reject to Document
    And Verify user can able to Handle Alert Message
    Then Verify user can be able to Logout to EIP Mobile Application 
    
 
  Scenario: As a EIP User i should be able to Login Document View Service Request (SR) from EIP40 Mobile App
  
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select SR Document
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

  Scenario: As a EIP User i should be able to Login Document Attachment View Service Request (SR) from EIP40 Mobile App
  
    Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select SR Document
    And Verify user can be to Attachment view 
    Then Verify user can be able to Logout to EIP Mobile Application
 
  Scenario: As a EIP User i should be able to Login Work Flow Trace Service Request (SR) from EIP40 Mobile App
  
  	Given Verify user can be able to Login EIPMobile Application
    When Verify user can be able to click on Work Bench EIP40Mobile
    And Verify user can able to click on SCM
    And Verify user can able to select SR Document
    And Verify user can able to click on Work flow trace 
    And Verify user can able to get listout flow from SR
    Then Verify user can be able to Logout to EIP Mobile Application
    
 
    