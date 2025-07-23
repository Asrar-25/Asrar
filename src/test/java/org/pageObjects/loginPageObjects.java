package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.basePage;

public class loginPageObjects extends basePage {
    public loginPageObjects() {
        super();
    }

    @FindBy(xpath = "//span[text()='Flights']")
    public WebElement linkFlights;

    @FindBy(xpath = "//span[text()='One-way']")
    public WebElement linkOneway;

    @FindBy(xpath = "//button[@aria-label='Leaving from']")
    public WebElement buttonFrom;

    @FindBy(xpath = "//button[@aria-label='Going to']")
    public WebElement buttonTo;

    @FindBy(xpath = "//input[@id='origin_select']")
    public WebElement inputFrom;

    @FindBy(xpath = "//input[@id='destination_select']")
    public WebElement inputTo;

    @FindBy(xpath = "//button[contains(@aria-label,'MAA - Chennai Intl')]")
    public WebElement buttonCity;

    @FindBy(xpath = "//button[contains(@aria-label,'DEL - Indira Gandhi Intl')]")
    public WebElement buttonCityy;


    @FindBy(xpath = "//button[contains(@aria-label,'Travelers')]")
    public WebElement buttonPassenger;

    @FindBy(xpath = "//*[text()='Adults']//parent::div//child::button[2]")
    public WebElement buttonAdult;

    @FindBy(xpath = "//*[text()='Done']")
    public WebElement buttonDone;

    @FindBy(xpath = "//*[text()='Search']")
    public WebElement buttonSearch;


}

