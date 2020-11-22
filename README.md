# Westpac KiwiSaver Calculator GUI Automated TEST

The project is for demonstrating technical understanding on GUI automation using WestPac KiwiSaver Calculator page

### Installation
* Install Microsoft Edge
* Install the latest Java SDK
* Install [maven](https://maven.apache.org/install.html) on test clientA step by step series of examples that tell you have to get a development env running
* Download [Microsoft Edge WebDriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/) with Version and platform match with test client
* Copy downloaded webdriver to config sub-folder under this project
* Update `EdgeDriverPath` in `files/browse.properties` for the above plug-in location (Default -- lib/msedgedriver.exe) 

## Running the tests
* In project root folder, execute "mvn install" in command line will run the test scenarios
* HTML test report will be generated in target/cucumber-reports/cucumber-pretty/index.html after test finished

## Tools and framework used

- [Java](https://www.java.com) - Java programming language
- [Eclipse](https://www.eclipse.org/ide/) - Java project IDE
- [Maven](https://maven.apache.org/) - Dependency Management
- [Cucumber](https://cucumber.io) - BDD framework
- [TestNG](http://testng.org/doc/) - Testing framework
- [Selenium](https://www.seleniumhq.org) - Browser test automation suite
- Selenium Page Factory and Page Object Model

## Authors

* **Anthony Lai**
