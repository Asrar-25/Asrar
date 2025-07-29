package org.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utils.driverManager;

import java.time.Duration;

import static org.utils.TestNGListener.test;
import static org.utils.driverManager.driver;

public class basePage {
     public driverManager d = new driverManager();
    public basePage() {
        PageFactory.initElements(d.getDriver(),this);

    }

    public void waits(WebElement w){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.elementToBeClickable(w)).isDisplayed();
//        wait.until(ExpectedConditions.visibilityOf(w));

    }

    public void javaScriptExe(WebElement w){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", w);


    }

    public void javaScriptExe(WebElement e, String s){
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute(e,s)");
        js.executeScript("arguments[0].setAttribute('value', arguments[1]);", e, s);

    }

    public void javaScriptExe(String s, WebElement e){
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].setAttribute(e,s)");
        js.executeScript("arguments[0].setAttribute('value', arguments[1]);", e, s);

    }

    public void actions(String s, WebElement e){
        Actions a = new Actions(driver);
        e.click();
        a.keyDown(Keys.CONTROL).sendKeys(s).keyUp(Keys.CONTROL).perform();

    }

    public void addStepLog(String log) {
        test.get().log(Status.INFO, log);
        System.out.println(log);
    }

}
