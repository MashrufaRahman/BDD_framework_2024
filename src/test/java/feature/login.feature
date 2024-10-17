#Author: mashrfrhnm@gmail.com
#date 09/30/2024
@login
Feature: Log In
  	As an user
  	I want to login with my valid credentials to Enthrall IT Login Page
  	In order to get access of the Enthrall IT Dashboard

  Background: User navigate to Application URL
    Given User is on the Enthrall IT homepage URL

  @regression
  Scenario: Login with valid credentials
    When User click on Login Button
    Then User will be navigated to Login Page
    When User enter Email in the Email field
    And User enter Password in the Password field
    And User finally click on Login Button

  # Imperative BDD, which is line by line discription
  @sanity
  Scenario: Login with fixed valid credentials
    When User click on Login Button
    Then User will be navigated to Login Page
    When User enter UserId as 'tasnimchowdhury.qa@gmail.com'
    And User enter Password as 'Darimee2010'
    And User finally click on Login Button
    
    @smoke
    Scenario Outline: Login with Sets of valid credentials
    When User click on Login Button
    Then User will be navigated to Login Page
    When User enter UserId as <UserId>
    And User enter Password as <Password>
    And User finally click on Login Button
    
    
    Examples:
    
    |				 UserId                |       		 Password    |
    |	'shampa.afroz82@gmail.com'  |    'ShumuLove$2024&'	 |
    |	'S_1999'                    |   'Silia19??abcsilia'  |
    |	'Narima.tushty@gmail.com'   |  	'Login@123456789'		 |
    
    
    
    
    
    
    
    
    
    
