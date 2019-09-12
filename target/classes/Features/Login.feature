#Implemented a Web Test Automation solution for a flight ticket booking website "http://newtours.demoaut.com/"
#Upon execution, the automated test will perform end to end cycle from user login to ticket booking confirmation
#The Test Automation framework used for implementation is Selenium  with Cucumber which is behaviour Driven Development framework
#The choice of Cucumber is because it is easy for non technical users to easily understand the test scenarios and
#also add test scenarios wherever required
#Even functional/manual testers with no automation background can contribute in this framework
#This framework has basically 3 components:- Feature , StepDefinition and TestRunner
#Feature class is used to define all test scenarios in simple english language called Gherkin which the WebDriver understands
#StepDefinition class is used to define the steps and methods for all the test scenarios mentioned in Feature class
#This basically creates a one to one mapping between Feature and Step Defintion classes
#To run the test scenarios, there is a seperate TestRunner class with CucumeberOptions to control the execution process
#Upon completion of execution, the project needs to be refreshed in order to view the test execution report generated inside the test-output folder in html and json formats respectively



Feature: Mercury Travels Login Feature

Scenario: Mercury Travels Login Test Scenario

Given User is already on the login page
Then  User enters username and enters password  
And   User clicks on login button
Then  User enters flight details and preferences
Then  User selects the flight and clicks on Continue
Then  User enters passenger details
Then  User logs out




