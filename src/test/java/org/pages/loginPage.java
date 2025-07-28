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
//        waits(linkFlights);

    }

    public void oneWay() {
//        linkOneway.click();
        javaScriptExe(linkOneway);
//        waits(linkOneway);
    }

    public void leavingFrom(String city) throws InterruptedException {
//        buttonFrom.click();
//        inputFrom.sendKeys(city);
//        buttonCity.click();
        javaScriptExe(buttonFrom);
        javaScriptExe(buttonFrom,"chennai");
        sleep(300);
//        buttonFrom.sendKeys(city);
//        actions("chennai", inputFrom);
        javaScriptExe(buttonCity);
        sleep(300);

    }

    public void goingTo(String city) throws InterruptedException {
        //buttonTo.click();
        //inputTo.sendKeys(city);
        //buttonCityy.click();
        javaScriptExe(buttonTo);
//        javaScriptExe("delhi", buttonTo);
        sleep(10000);
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


    }

    public void search() throws InterruptedException {
//        buttonSearch.click();
        javaScriptExe(buttonSearch);
        Set<String> allWindowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(allWindowHandles);
        driver.switchTo().window(windowHandlesList.get(1));
        sleep(15000);
    }

    public void linkRoundTrip() throws InterruptedException {
        javaScriptExe(buttonDate);

    }


}
