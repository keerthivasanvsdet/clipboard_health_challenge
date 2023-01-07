# clipboard_health_challenge

- The test should run and pass in the chrome browser - Yes have added debug.log file which has the logs regarding this point.
- Platform independent. (It should run on Windows, Mac, or Linux) - I've used webdrivermanager which works across Windows, Mac & Linux
- Better page layer management - I've followed POM pattern
- Helper methods for page interactions like click, sendkeys - Have written a Common file for all the usages
- Readable and clean code - Minimum clean code written without hard-coding stuffs
- Clear instructions about the framework and how to execute it in the readme file - I've added the same below
- Commits history to see how you have approached the problem - Have set the project in local, uploaded in github hence commit history won't be much. Let's dicuss in detail going forward in the next round.
- Follow sound design principles - Yes have used wherever needed


About Framework

Language: Java

Tools/Libraries Used:-
Selenium
Webdrivermanager
TestNG
Maven
log4j

Have setup a maven project where the framework follows Page Object Model pattern which suits the workflow given. 

Execution command: 
mvn clean install
mvn test
or 
mvn clean test -Dsurefire.suiteXmlFiles=/path/to/testng.xml
