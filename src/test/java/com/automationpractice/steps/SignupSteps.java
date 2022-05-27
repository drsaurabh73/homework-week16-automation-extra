package com.automationpractice.steps;

import com.automationpractice.pages.AuthPage;
import com.automationpractice.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps {


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }
    @When("^I click on signin button$")
    public void iClickOnSigninButton() {
      new HomePage().setSigninbutton();
    }

    @Then("^I navigate to signup page$")
    public void iNavigateToSignupPage() {

        new AuthPage().enterEmailField1("sam");
        new AuthPage().setCreateaccount();
    }

    @And("^I can create account with random username$")
    public void iCanCreateAccountWithRandomUsername() {
        new AuthPage().clickOnRadioButton();
        new AuthPage().setFirstname("Sam");
        new AuthPage().setLastname("Patel");
        new AuthPage().setPassword("456789@");
        new AuthPage().setDateofBirth("10");
        new AuthPage().setMonthofBirth("11");
        new AuthPage().setYearofBirth("2001");
        new AuthPage().setNewsletter();
        new AuthPage().setSpecialoffer();
        new AuthPage().setNameaddress("sam");
        new AuthPage().setLastaddress("Patel");
        new AuthPage().setCompany("Sigma");
        new AuthPage().setStreetname("West street");
        new AuthPage().setAddressline2("Leicester Square");
        new AuthPage().setCity("London");
        new AuthPage().setState("Texas");
        new AuthPage().setPostcode("56556");
        new AuthPage().setCountry("United States");
        new AuthPage().setAdditionalinformation("do not deliver next door");
        new AuthPage().setHomephone("02085556667");
        new AuthPage().setMobilenumber("0795566778");
        new AuthPage().setAssignAnAddressForFuture("my new address ");
        new AuthPage().setRegister();

    }


}
