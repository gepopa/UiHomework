Homework Seleniul UI tests
-
Some UI tests using Selenium and testNG

Dependencies:
- 
- Java 1.8;
- Chromedriver (depends on OS and Chrome browser version);

Config:
-
For MacOS and Chrome version 81, 85 or 86:
- Change the name of the chromedriver depending on the Chrome version in: main/utils/TestBase (Ex: System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver85");)

For other OS and Chrome versions:
- Get chromedriver accordingly to the Google Chrome browser version from: https://chromedriver.chromium.org/downloads
- Add the chromedriver in: src/main/resources and change the path in main/utils/TestBase

When running form IntelliJ: 
- Go to "RUN" menu and select "Edit Configurations..." 
- As VM options add "-ea -Dtestng.dtd.http=true"
- As Environment variables add username and password in the format:KEY=VALUE (Ex: username=aaa;password=1234)

Test results:
-
The test flow and test results can be found in the logs folder.
