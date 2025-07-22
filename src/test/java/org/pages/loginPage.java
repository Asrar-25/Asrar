package org.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pageObjects.loginPageObjects;
import static org.utils.driverManager.driver;
import java.io.File;
import java.io.IOException;

public class loginPage extends loginPageObjects {


    public void loginintoapplication() throws InterruptedException, IOException {
        d.getDriver().get("https://www.expedia.com/");
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) d.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+"/screenshot.png");
        FileUtils.copyFile(source,destination);

    }

    public void screenShot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) d.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+"/screenshot.png");
        FileUtils.copyFile(source,destination);
    }


    public void clickFlightsLink(){
        linkFlights.click();
        driver.findElement(By.xpath("/*[text()='Flights']//parent::a"));
       // javaScriptExe(linkFlights);

    }

    public void oneWay() {
        linkOneway.click();
        //javaScriptExe(linkOneway);
    }

    public void leavingFrom(String city) {
        buttonFrom.click();
        inputFrom.sendKeys(city);
        buttonCity.click();
        //javaScriptExe(buttonFrom);
        //inputFrom.sendKeys(city);
        //javaScriptExe(buttonCity);

    }

    public void goingTo(String city) {
        buttonTo.click();
        inputTo.sendKeys(city);
        buttonCityy.click();
        //javaScriptExe(buttonTo);
        //inputTo.sendKeys(city);
        //javaScriptExe(buttonCityy);


    }

    public void travelers() {

        buttonPassenger.click();
        buttonAdult.click();
        buttonDone.click();
        //javaScriptExe(buttonPassenger);
        //javaScriptExe(buttonAdult);
        //javaScriptExe(buttonDone);


    }

    public void search() {
        buttonSearch.click();
        //javaScriptExe(buttonSearch);
    }


}
