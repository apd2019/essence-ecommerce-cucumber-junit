<h1>Functional Testing for E-commerce Web Application</h1>

<h2>Project Agenda: To perform functional testing on an e-commerce web application using the test automation tool Selenium and TestNG</h2>

Description:<br>
As part of this project, you must clone the below e-commerce application:<br>
git clone https://github.com/Simplilearn-Edu/ATE_PEP2_Testing_Using_TestNG.git
and paste the cloned folder on the given path to deploy on the Apache 2 server: /var/www/html

<br>
This application is based on Java, HTML, and CSS.
<br>
The application will be available at the URL: localhost:80/ecomm and then use Selenium, TestNG, and Cucumber framework to perform testing.
<br>
In the first part of the project, create a Maven project in the Eclipse IDE and install Selenium and TestNG to perform this project.
<br>
Write Selenium and Cucumber scripts to:
<br>
•To validate and test the Home and Contact pages, as well as alerts
<br>
•Use different locators to test elements like textboxes, buttons, checkboxes, and radiobuttons on the application
<br>
•Use the TestNG framework to execute the Selenium scripts and generate the TestNGreport
<br>
•In the second part of the project, create a new project with the Cucumber framework
<br>
•Write a feature file to validate the Home and Checkout pages
<br>
•Write a step definition file for the features
<br>
•Validate the test cases by executing the feature file using JUnit
<br>

<h3>Set up a scenario:</h3>
<br>
•Clone the repository:https://github.com/SimplilearnEdu/ATE_PEP2_Testing_Using_TestNG.git
<br>
•Deploy the code on the Apache 2 server
<br>
•The application will be available on localhost:80/ecomm
<br>
•Create a simple Maven project In Eclipse IDE
<br>
•In the POM.xml file, add the dependencies to install Selenium and TestNG
<br>
•To execute the second part of the project, create a Maven project, download theCucumber plugin, and add JUnit and Cucumber dependencies in the POM.xml file
<br>
<h3>Tools required: Eclipse IDE, Selenium, Cucumber, TestNG, and Apache 2.</h3>
<br>
<h3>Detailed scenario 1:</h3>
<br>
Create a Base test class and write steps to:
<br>
• Create a method and name it OpenBrowser()
<br>
• Add steps to open the Chrome browser and maximize the window
<br>
• Add steps to open the application URL in the browser
<br>
• Add steps to code to delete cookies
<br>
• Add Selenium commands in the PageLoadTimeout code
<br>
• Create a new class to test elements on the e-commerce application's Home page
<br>
• The HomePage class should extend the test base class so that we can import method OpenBrowser()
<br>
• Create a test method and name it HomePageTest()
<br>
• Write steps to perform mouse hover action on menu option Pages
<br>
• Write steps to click on Contact in the dropdown list
<br>
• Write steps to handle the Alert box that will appear
<br>

<h3>Detailed scenario 2:</h3>
<br>
• Create a new Maven project and set up the JUnit and Cucumber dependencies
<br>
• Create a feature file and write a feature to test the Add to Cart page
<br>
• Write scenario in the feature file using Gherkin to test:
<br>
• If the user is able to click on the Add to Cart button
<br>
• If the user is able to click on the Checkout button
<br>
• If the user is able to add all required details in the Billing Address page
<br>
• If the user is able to click on the Place Order button
<br>
• Write a step definition file for the above scenario
<br>
• Create a test runner class to fetch the feature file, glue the step definition file, and execute all the tests
<br>


