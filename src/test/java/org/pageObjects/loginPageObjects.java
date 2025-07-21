package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.basePage;

public class loginPageObjects extends basePage {
    public loginPageObjects() {
        super();
    }

    @FindBy(xpath = "")
    public WebElement username;

}
