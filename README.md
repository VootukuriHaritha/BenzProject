
# BenzProject

Benzproject is a small maven project to validate price of vehicle models . Its a page object model , where Elements are in one class, Tests are in an another class and project base details are an another class

This project can be run in two different browsers google chrome and microsoftedge .

## Instructions to Run the BenzProject:

#### Precondtions:

1.Install JAVA and Set Enviroment Variables

Java Download and installation links
https://www.java.com/en/download/help/windows_manual_download.html
https://devwithus.com/install-java-windows-10/

2.Install Latest Version of Eclipse 

Eclipse Download and installation links
https://www.eclipse.org/downloads/

https://www.eclipse.org/downloads/packages/installer


- JDK Version :11
- Eclipse Version :2023-03 (4.27.0)
- Windows 10

### How To Run the Project:

1.Open the Project in Eclipse IDE and goto src/test/java folder

2.Go to BenzApplicationTests package and open BenzapplicationTests java file

3.Right click on the java file Run as ->TestNG Test

4.After the run ,the Testresults screenshot.png and prices.txt are saved in \BenzProject\Artifacts folder.


### How to Run the Project in two different Browsers:

1.Goto config.properties folder and change the browser parameter value to "chrome" if you want to run in Google chrome 

2.Goto config.properties folder and change the browser parameter value to "edge" if you want to run in Microsoftedge
location:BenzProject\src\main\java\Mercedez\BenzProject\TestUtils\config.properties

### Project Folders Description:

#### src/main/java 

- TestBase.java ->Setting up driver ,website and initializing the driver.

- config.properties ->project configuration data

- HomePage ->Identifying elements present and perform actions on elements like click ,select.
The Webpage elements are under the shadow Root, it was difficult to locate the elements using selenium locators .
I Used Selenium WebDriver’s getShadowRoot() method to locate Shadow DOM elements.

#### src/test/java 
- BenzapplicationTests ->Test code

#### Artifacts

- TestResults are saved in this folder

#### pom.xml 

It contains all the necessary dependencies to execute the project

 
