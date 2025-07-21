package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class loginsteps extends stepObjects {

    @Given("User is on the login Page")
    public void loginpage() throws InterruptedException, IOException {
     lp.loginintoapplication();

    }
    @And("I click on something")
    public void click() {

    }


}
