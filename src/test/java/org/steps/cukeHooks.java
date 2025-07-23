package org.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.utils.driverManager;

public class cukeHooks {
    driverManager d = new driverManager();
@Before
    public void initDriver() {
    String chromeDriverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//chromedriver";
    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    // Create ChromeOptions (optional)
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    // Initialize ChromeDriver with options

    d.setDriver(options);

}

@After
    public void tearDown() {
//    d.getDriver().quit();

}


}
