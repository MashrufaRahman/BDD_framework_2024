#Author: Kaylith1@gmail.com
#Date: October 10th 2024

@newUserEnrollment
Feature: As an user 
I want to enroll as a new user to the EnthrallIt Portal
In order to get access of the Application feature

Background: user navigates to Application URL
Given user is on the EnthrallIt Home portal page URL


Scenario: user click on the enrollHome page submit button by putting value in each field to see 
the enrollment successful message
When user click the login Button and put the credential 
Then user nevigate to the dashboard
When User click on Automation 
Then User navigate to EnrollNow Automation page 
When User click on EnrollNow 
#Then User navigate to EnrollHome Application page 
Then User navigate to the enrollment process and click on submit Button to sees the successful message



 #declarative BDD, not line by line discription