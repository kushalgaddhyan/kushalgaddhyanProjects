$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Implemented a Web Test Automation solution for a flight ticket booking website \"http://newtours.demoaut.com/\""
    },
    {
      "line": 2,
      "value": "#Upon execution, the automated test will perform end to end cycle from user login to ticket booking confirmation"
    },
    {
      "line": 3,
      "value": "#The Test Automation framework used for implementation is Selenium  with Cucumber which is behaviour Driven Development framework"
    },
    {
      "line": 4,
      "value": "#The choice of Cucumber is because it is easy for non technical users to easily understand the test scenarios and"
    },
    {
      "line": 5,
      "value": "#also add test scenarios wherever required"
    },
    {
      "line": 6,
      "value": "#Even functional/manual testers with no automation background can contribute in this framework"
    },
    {
      "line": 7,
      "value": "#This framework has basically 3 components:- Feature , StepDefinition and TestRunner"
    },
    {
      "line": 8,
      "value": "#Feature class is used to define all test scenarios in simple english language called Gherkin which the WebDriver understands"
    },
    {
      "line": 9,
      "value": "#StepDefinition class is used to define the steps and methods for all the test scenarios mentioned in Feature class"
    },
    {
      "line": 10,
      "value": "#This basically creates a one to one mapping between Feature and Step Defintion classes"
    },
    {
      "line": 11,
      "value": "#To run the test scenarios, there is a seperate TestRunner class with CucumeberOptions to control the execution process"
    },
    {
      "line": 12,
      "value": "#Upon completion of execution, the project needs to be refreshed in order to view the test execution report generated inside the test-output folder in html and json formats respectively"
    }
  ],
  "line": 16,
  "name": "Mercury Travels Login Feature",
  "description": "",
  "id": "mercury-travels-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 18,
  "name": "Mercury Travels Login Test Scenario",
  "description": "",
  "id": "mercury-travels-login-feature;mercury-travels-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "User is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User enters username and enters password",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enters flight details and preferences",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User selects the flight and clicks on Continue",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User enters passenger details",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User logs out",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_login_page()"
});
formatter.result({
  "duration": 18694014967,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 440315431,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 29869003640,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_details_on_home_page()"
});
formatter.result({
  "duration": 1941518403,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_selects_flight()"
});
formatter.result({
  "duration": 1485027790,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_traveller_details()"
});
formatter.result({
  "duration": 1647837972,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_logs_out()"
});
formatter.result({
  "duration": 3091095890,
  "status": "passed"
});
});