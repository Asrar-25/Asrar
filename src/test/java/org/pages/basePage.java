package org.pages;

import org.openqa.selenium.support.PageFactory;
import org.utils.driverManager;

public class basePage {
     public driverManager d = new driverManager();
    public basePage() {
        PageFactory.initElements(d.getDriver(),this);

    }

}
