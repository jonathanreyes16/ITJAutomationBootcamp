- Automation Test - 
Automatic execution of functional tests, designed at least in some ways to simulate human beign executing manual tests

Advantages
- Performing some tests that cannot be performed at all or easily manually
- Reducing the time needed for test execution
- Increase the frequency that some tests can be run
- Reducing mistakes made by testers
- Executing test outside of normal business hours
- Increasing the confidence in the build

Disadvantages
- Delays, Costs, and mistakes associated with testers as they learn new technologies
- In worst cases, complexity may become overwhelming
- Considerable maintenance of tools, enviroments, and test assets required
- The pesticide paradox is increased when automation is used since exactly the same test is run each time
- Without clever programming in the automated tests, tools are literal minden and stupid; Testers are not.

- Web testing vs mobile testing -
Web Testing
web application is a program delivered through the internet in the form of a browser interface.

Testing Techniques that can be applied to web testing
- Functionality Testing
- Interface Testing
- Compatibility Testing
- Performance Testing 

- How to test Web apps - 
- Test all links in the webpages are working correctly and make sure there are no broken links
- Test forms are working as expected
- Test Cookies are working as expected
- Test HTML and CSS
- Test business workflow

 - Mobile testing
 - Native: they are downloaded, installed and updated from supplier stores.
 these apps may need testing all supported devices.
 - Browser based: These are Accessed through a mobile browser and they use a typical web-development technologies and browsers.
 -Hybrid: Hybrid applications are a combination of native and web app.

- How to test mobile apps? -

We need to consider the following specific risks and challenges
- The variety of mobile devices with device-specific defects on some of them.
- The availability of devices in-house or via the use of external test labs.
- The introduction of new technologies, devices and/or platforms during the application life cycle.
- The installation and upgrade of the app itself via various channels, including preserving app data an preferences.
- The ability to test using the networks of varios service providers.
- The use of mobile emulators, simulators and/or real devices for specific test levels and type of test

- Selenium -

Exploring web Elements
What's HTML?
an HTML document is a plaint text file which contains elements which specify certain contextual meanings when the document is parsed.
HTML describes the structure of a web page semantically and the most important benefit to using HTML is the universal applicability of the language.

HTML elements are introduced and often surrounded by tags which are defined by angle brackets
example: <h1> This is a Header</h1>

Chrome inspector
Chrome DevTools is a set of web developer tools build directly into the Google Chrome browser.

1. Click Customize and then select More Tools > Developer Tools.
2. Right-Click the element and select Inspect.

Selenium Facts
- Selenium is a Open-Source Automation Tool
- It's exclusively for Web Applications
- It works with different browsers: Firefox, Chrome, Safary, IE, Edge
- Can run in different OS: Windows, Linux, macOS
- Can use multiple programing languages: Java, C#, Python, JavaScript, Ruby

Selenium Architecture Components
Selenium IDE
it is an add-on to Chrome and Firefox browsers, its main function is recording and playing back user actions on web pages:
 the recorded scripts can be saved to disk as HTML tables or exported to several programing languages

Selenium Web driver
it is mainly a framework allowing test scripts to control web browsers, enables test automators to combine WebDriver's
ability to control web browsers with the power of general programing languages.

Selenium Grid
it enables running test scripts across multiples machines with different configurations. it allows distributed and simultaneous execution of test cases. it can be configured to use many
physical or virtual machines with different combinations of operating systems and versions of web browsers.

Selenium Standalone Server
this tool is written in Java and is delivered as a jar file that implements hubs and nodes functions for Selenium Grid.
This tool needs to be started separately(outside of test scripts) and configured properly to play its role in test environment.

How to integrate to Java
How Selenium and Java work together?
1. Verify if Java is installed in your computter
2. Install Java if not installed before
3. Set Environment Variables: JAVA_HOME and Path
4. Install IDE(IntelliJ) and create test cases(Java Project & Class files)
5. Install Selenium(.jar files)



PROJECT SETUP
1. Create a Maven project in intelliJ
2. Search for Maven Selenium dependency and get the maven dependency code and paste it on pom.xml after properties
<dependencies>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.7.2</version>
        </dependency>

    </dependencies>
3. Add the chrome driver on the project specific for the version of your chrome
4. in the main set System.setProperty to define the webdriver
5.and the we create the web driver object
