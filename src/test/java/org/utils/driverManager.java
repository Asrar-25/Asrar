package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverManager {
    public static WebDriver driver;
    public void setDriver(ChromeOptions options){
        driver = new ChromeDriver(options);
    }
    public WebDriver getDriver(){
        return driver;
    }


}
