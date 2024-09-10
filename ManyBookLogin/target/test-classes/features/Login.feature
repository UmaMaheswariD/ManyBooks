Feature: Verify Flipkart Login


  Background:
    Given Launch the Flipkart Url

  @Login
  Scenario: To check successful login on Flipkart website
    When User login with Registered credentials
    Then Verify successful login


   
      
