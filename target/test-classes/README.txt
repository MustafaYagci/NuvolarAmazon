--(POM) Page Object Model
I used Page Object Model (POM) in this framework to centralize the Web Elements (locators). Assign once use all.
In case of any update or change in locators no need to change static way.
With the help of POM you only change it from centralized place and it will be updated in all test scripts.

--configuration.properties & ConfigurationSeter
In this framework I used configuration.properties file to use and access some common and repeated datas.
ConfigurationSeter class to convert this datas into Java.

--Feature file
Increase the readebility of the test scripts and connect the execution order.
Both technical and non technical people can understand what is going on the test scripts.

--stepDefinition package
Takes the corresponding feature file and convert to Java Code.
All the corresponding test script of feature files locates in this package
TestBase.class -> Works with Cucumber annotations.
                  Assigned before and after classes so it will work before or after every method.

--runner package
Runner -> It is our fire starter. We will provide some tags of test suites ex:(@regression, @smoke)
          and it will execute only test scripts with given tags. You can also set dry run (true, false)
          so it will create automaticaly step definitions where there is needed.
          You also can add plugins I added "json:target/cucumber.json" so it will handle reporting.

FailedRunner -> it will store our failed test feature files paths inside the target/rerun.txt
                so we can run only failed test scripts.

--docs file
It will store the documents related to project ex: if you are doing Data driven testing tou can add excel file.

--utilities package
ShortCuts -> I created my own codes to make it easy and dynamic.
Driver -> It is my driver class that takes the browser type from configuration.properties and create driver.
          With the help of InheritableThreadLocal(WebDriver) i can make parallel testing with singleton method.
          You can also type remote-chrome or firefox and provide the IP of remote machine so that you can make your testing
          on different devices with the help of SeleniumGrid relation of Hubs and Nodes.

--pom.xml
I take those dependencies from mvnrepo. I used maven sure fire plugin to make parallel testing
and cucumber report for reporting. You can set the number of tabs that will execute or run order etc.
Parallel testing is not works with Runner class. You can write to terminal or command prompt "mvnverify".


