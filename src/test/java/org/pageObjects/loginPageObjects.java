package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.basePage;

public class loginPageObjects extends basePage {
    public loginPageObjects() {
        super();
    }

    @FindBy(xpath = "(//li//a[@href='/flights'])[1]")

    public WebElement linkFlights;

    @FindBy(xpath = "//button[text()='One Way' and @role='tab']")
    public WebElement linkOneway;

    @FindBy(xpath = "(//*[text()='From']//parent::p//parent::div//parent::div//parent::div)[1]")
    public WebElement buttonFrom;

    @FindBy(xpath = "(//*[text()='To']//parent::p//parent::div//parent::div//parent::div)[1]")
    public WebElement buttonTo;

//    @FindBy(xpath = "//input[@id='origin_select']")
//    public WebElement inputFrom;

//    @FindBy(xpath = "//input[@id='destination_select']")
//    public WebElement inputTo;

    @FindBy(xpath = "(//*[contains(text(),'MAA')]//parent::div//parent::div)[1]")
    public WebElement buttonCity;

    @FindBy(xpath = "(//*[contains(text(),'DEL')]//parent::div//parent::div)[1]")
    public WebElement buttonCityy;

    @FindBy(xpath = "//*[@aria-label='30 August 2025']//parent::button")
    public WebElement buttonDate;


    @FindBy(xpath = "(//*[text()='Travellers & Class']//parent::p//parent::div//parent::div//parent::div)[1]")
    public WebElement buttonPassenger;

    @FindBy(xpath = "//p[text()='Adults']//parent::div//following-sibling::div//button[text()='2']")
    public WebElement buttonAdult;

    @FindBy(xpath = "//button[text()='Done']")
    public WebElement buttonDone;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement buttonSearch;

    @FindBy(xpath = "//input[@value='cheapest']")
    public WebElement objectResults;


}

