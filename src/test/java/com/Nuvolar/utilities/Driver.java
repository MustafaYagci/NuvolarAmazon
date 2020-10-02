package com.Nuvolar.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Driver {


   private Driver(){}
    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){
            String browser=ConfigurationReader.get("browser");

            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver=new OperaDriver();
                    break;

            }

        }
        return driver;

    }


    public static void destroyer(){
        if (driver!=null){
            driver.close();
            driver=null;
        }
    }
}
