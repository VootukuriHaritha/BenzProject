
# BenzProject

Benzproject is a small maven project to validate price of vehicle models. This project runs in google chrome and microsoft edge browser .

## Instructions to Run the BenzProject:

#### Pre-requisites:

1.Install JAVA and Set Enviroment Variables

Java Download and installation links
https://www.java.com/en/download/help/windows_manual_download.html
https://devwithus.com/install-java-windows-10/

2.Install Latest Version of Eclipse 

Eclipse Download and installation links
https://www.eclipse.org/downloads/

https://www.eclipse.org/downloads/packages/installer


- JDK Version : 11
- Eclipse Version :2023-03 (4.27.0)
- Windows 10

### How To Run the Project:

1.Open the Project in Eclipse IDE and go to "src/test/java" folder

2.Go to "BenzApplicationTests" package and Right click on "BenzapplicationTest" java file and Run as ->TestNG Test

3.After run, the testresults "screenshot.png" and "prices.txt" are saved under "\BenzProject\Artifacts" folder.


### How to Run the Project in two different Browsers:

#### Google Chrome Browser

1.Goto config.properties folder and change the browser parameter value to "chrome" if you want to run in Google chrome

**location**:BenzProject\src\main\java\Mercedez\BenzProject\TestUtils\config.properties

#### Microsoft Edge Browser
2.Goto config.properties folder and change the browser parameter value to "edge" if you want to run in Microsoftedge

**location**:BenzProject\src\main\java\Mercedez\BenzProject\TestUtils\config.properties

### Project Folders Description:

#### src/main/java 

- TestBase.java ->Setting up driver ,website and initializing the driver.

- config.properties ->project configuration data

- HomePage ->Identifying elements present and perform actions on elements like click ,select.
The webpage elements are under the shadow Root, it was difficult to locate the elements using selenium locators.
I used Selenium WebDriver’s getShadowRoot() method to locate Shadow DOM elements.

#### src/test/java 
- BenzapplicationTests -> Contains test details

#### Artifacts

- TestResults are saved in this folder

#### pom.xml 

It contains all the necessary dependencies to execute the project

 
