package org.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pageObjects.loginPageObjects;

import java.io.File;
import java.io.IOException;

public class loginPage extends loginPageObjects {


    public void loginintoapplication() throws InterruptedException, IOException {
        d.getDriver().get("https://www.skyscanner.co.in/");
        Thread.sleep(10000);
        TakesScreenshot ts = (TakesScreenshot) d.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+"/screenshot.png");
        FileUtils.copyFile(source,destination);
    }
}
