package Stepdefinition;

import Pages.Web.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by mdrahman on 9/9/18.
 * Spring 2018
 */


public class HomePageSD {

    Homepage homepage = new Homepage();

    @Given("^I am on the Home Page$")
    public void imOnTheHomePage(){
        Assert.assertEquals("Facebook - Log In or Sign Up",
                            "Facebook - Log In or Sign Up",
                            "Page Title not Matched");
    }

    @When("^I enter (.+) as Username and (.+) as Password$")
    public void enterUsrNm_Pass(String username, String Password){
        homepage.enterUsrNm_Pass(username, Password);
    }

    @And("^I click Login button$")
    public void clickLogIn() throws InterruptedException {
        homepage.clickSubmitButton();

    }

    @Then("^I verify the invalid login message$")
    public void verifyInvalidMessage(){
        Assert.assertEquals("Facebook","Facebook","Mismatched");

    }

}
