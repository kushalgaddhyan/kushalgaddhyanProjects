Overview

1.Implemented a Web Test Automation solution for a flight ticket booking website "http://newtours.demoaut.com/"
2.Upon execution, the automated test will perform end to end cycle from user login to ticket booking confirmation
3.The Test Automation framework used for implementation is Selenium  with Cucumber which is behaviour Driven Development framework
4.The choice of Cucumber is because it is easy for non technical users to easily understand the test scenarios and
5.also add test scenarios wherever required
6.Even functional/manual testers with no automation background can contribute in this framework
7.This framework has basically 3 components:- Feature , StepDefinition and TestRunner
8.Feature class is used to define all test scenarios in simple english language called Gherkin which the WebDriver understands
9.StepDefinition class is used to define the steps and methods for all the test scenarios mentioned in Feature class
10.This basically creates a one to one mapping between Feature and Step Defintion classes
11.To run the test scenarios, there is a seperate TestRunner class with CucumeberOptions to control the execution process
12.Upon completion of execution, the project needs to be refreshed in order to view the test execution report generated inside the test-output folder in html and json formats respectively

Installation Instructions

1.To start with, please make sure that you have downloaded Eclipse IDE on your machine
2.Open the path where you have the unzipped Eclipse folder. Double click on eclipse.exe to open it
3. Please ensure that you have installed Apache Maven in your system
4. Please download the binary zip file from Maven website and store in your local computer
5. Then unzip it and note the path of the Maven
6. Set the environment variable in system properties as M2_HOME as name of the environment variable and also set the path of the Bin folder
7.Please ensure that JDK version 1.8 is installed in your system and the environment variable and path of JDK is defined as above
8. Now clone the project from github either from gitbash or from eclipse
9. Once the code is reflecting in your eclipse, right click on the project and click on Run As-->Maven Build
10. Set Maven goal as clean install and run
11. Once the build is successful, please open the TestRunner.java under src/main/java-->TestRunner and right click inside anywhere
12. Right Click  --->Click on Run As-->Junit Test
13. Once done, the chrome browser will open and the automated test will start executing
14. Once the test is completed, refresh your project
15.Under test-output folder, the test results will be present in index.html and report.js files

Frameworks/Tools/Patterns used
Please provide with details of the frameworks/patterns used in this test suite and reasons for using them.

1. Framework Used:- Behaviour Driven Development(BDD) using Selenium, java ,Cucumber and JUNIT
2. Tools Used: - Eclipse(Code Editor) ,Selenium WebDriver 3(Test Automation) ,JDK 1.8(Java programming),
Cucumber Jars(BDD libraries), Junit Jars(Unit Testing Framework for Java),, Maven (Build Automation Tool)

The reasons to choose the above BDD framework are listed below:-

1.It is helpful to involve business stakeholders who can't easily read code
2.Cucumber Testing focuses on end-user experience
3.Style of writing tests allow for easier reuse of code in the tests
4.Quick and easy set up and execution
5.Efficient tool for testing
6.It’s test driving it based on the business requirement right from the start.
And it’s also a communication mechanism to make sure  the right code is created
for the value which is  to be  delivered to the business. After we communicate and get the what to design from the business,
from there then it’s a style in how we write our tests, what tests to write, 
and at what level we start to write the tests at in the beginning.

Some potential drawbacks of using Cucumber (BDD) are :-

1.Requires a deep understanding of a larger number of concepts, that does not allow to recommend BDD
to a junior tester before he completely understands TDD concept

