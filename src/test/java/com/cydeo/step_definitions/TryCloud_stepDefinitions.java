package com.cydeo.step_definitions;

import com.cydeo.pages.TryCloudLoginPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TryCloud_stepDefinitions {
TryCloudLoginPages tryCloudLoginPages = new TryCloudLoginPages();
    @Given("user is on the tryCloud login page")
    public void user_is_on_the_try_cloud_login_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login?");

    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
    tryCloudLoginPages.userNameField.sendKeys("User1");

    }
    @When("user enters validd password")
    public void user_enters_valid_password() {
        tryCloudLoginPages.passwordField.sendKeys("Userpass123");

    }
    @And("user clicks on the Log in button")
    public void userClicksOnTheLogInButton() {
tryCloudLoginPages.LoginBtn.click();

    }
    @Then("user should land on the {string} page")
    public void user_should_land_on_the_page(String expectedTitle) {

    }

}
