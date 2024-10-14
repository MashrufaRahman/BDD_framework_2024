#Author: mashrfrhnm@gmail.com
#date 09/30/2024
@login
Feature: Log In
  	As an user
  	I want to login with my valid credentials to Enthrall IT Login Page
  	In order to get access of the Enthrall IT Dashboard

  Background: User navigate to Application URL
    Given User is on the Enthrall IT homepage URL

  Scenario: Login with valid credentials
    When User click on Login Button
    Then User will be navigated to Login Page
    When User enter Email in the Email field
    And User enter Password in the Password field
    And User finally click on Login Button
    

    # Imperative BDD, which is line by line discription
    
   
