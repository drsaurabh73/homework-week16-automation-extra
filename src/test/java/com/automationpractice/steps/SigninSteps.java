package com.automationpractice.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.pages.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class SigninSteps {
    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new HomePage().setSigninbutton();
        new SignInPage().setRegemail("sampatil@gmail.com");
        new SignInPage().setRegpassword("123456");
        new SignInPage().clickOnSignin();
    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new MyAccountPage().setMyaddressbutton();
        String[] expected = { "West field Avenue North London","London, Texas 22235","United States" };
        for (int i = 0; i < expected.length; i++) {
            System.out.println(new MyAccountPage().getAddressText()[i]);
            Assert.assertEquals("address not correct", expected[i], new MyAccountPage().getAddressText()[i]);
        }

        }
    }
