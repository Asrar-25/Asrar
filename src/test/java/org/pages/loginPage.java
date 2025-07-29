package org.pages;

import com.google.common.collect.Sets;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.pageObjects.loginPageObjects;

import static java.lang.Thread.sleep;
import static org.utils.driverManager.driver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class loginPage extends loginPageObjects {


    public void loginintoapplication() throws InterruptedException, IOException {
        d.getDriver().get("https://www.ixigo.com/");
        sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) d.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+"/screenshot.png");
        FileUtils.copyFile(source,destination);

    }

    public void screenShot(String i) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) d.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+"/screenshot"+i+".png");
        FileUtils.copyFile(source,destination);
    }


    public void clickFlightsLink(){
//        linkFlights.click();
//        driver.findElement(By.xpath("/*[text()='Flights']//parent::a"));
        javaScriptExe(linkFlights);
        addStepLog("clicked on flight");
//        waits(linkFlights);

    }

    public void oneWay() {
//        linkOneway.click();
        javaScriptExe(linkOneway);
        addStepLog("clicked on oneWay");
//        waits(linkOneway);
    }

    public void leavingFrom(String city) throws InterruptedException {
//        buttonFrom.click();
//        inputFrom.sendKeys(city);
//        buttonCity.click();
        javaScriptExe(buttonFrom);
        javaScriptExe(buttonFrom,city);
        sleep(300);
        addStepLog("Enter text in textbox as "+city);
//        buttonFrom.sendKeys(city);
//        actions("chennai", inputFrom);
        javaScriptExe(buttonCity);
        sleep(300);

    }

    public void goingTo(String city) throws InterruptedException {
        //buttonTo.click();
        //inputTo.sendKeys(city);
        //buttonCityy.click();
        javaScriptExe(buttonTo, city);
//        javaScriptExe("delhi", buttonTo);
        sleep(10000);
        addStepLog("Enter text in textbox as "+city);
//        buttonTo.sendKeys(city);
//        actions("delhi", inputTo);
//        javaScriptExe(buttonCityy);
        javaScriptExe(buttonDate);
    }


    public void travelers() throws InterruptedException {

//        buttonPassenger.click();
//        buttonAdult.click();
//        buttonDone.click();
        javaScriptExe(buttonPassenger);
        sleep(3000);
        javaScriptExe(buttonAdult);
        javaScriptExe(buttonDone);
        addStepLog("clicked on travelers");


    }

    public void search() throws InterruptedException {
//        buttonSearch.click();
        javaScriptExe(buttonSearch);
        Set<String> allWindowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(allWindowHandles);
        driver.switchTo().window(windowHandlesList.get(1));
        sleep(15000);
        addStepLog("clicked o search");
    }

    public void linkRoundTrip() throws InterruptedException {
        javaScriptExe(buttonDate);
        addStepLog("clicked on roundTrip");
    }


}
