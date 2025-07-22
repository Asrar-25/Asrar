package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utils.driverManager;

import java.time.Duration;

import static org.utils.driverManager.driver;

public class basePage {
     public driverManager d = new driverManager();
    public basePage() {
        PageFactory.initElements(d.getDriver(),this);

    }

    public void waits(WebElement w){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        wait.until(ExpectedConditions.elementToBeClickable(w));

    }


}
