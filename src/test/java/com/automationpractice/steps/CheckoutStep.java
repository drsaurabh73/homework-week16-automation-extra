package com.automationpractice.steps;

import com.automationpractice.pages.CommonPage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.pages.ProductPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CheckoutStep {
    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
    }

    @And("^I add below product to cart$")
    public void iAddBelowProductToCart(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> data : userList) {
            new MyAccountPage().slectCategory(data.get(0));
            new MyAccountPage().setSubCategory(data.get(1));
            new MyAccountPage().selectProduct(data.get(2));
            Assert.assertEquals("Model not found", data.get(3), new ProductPage().getModelText());
            new ProductPage().setClearQuantity();
            new ProductPage().setChangeQuantity(data.get(4));
            new ProductPage().clickOnCart();
            new ProductPage().clickOnClose();

        }
        new ProductPage().setProceedtocheckout();
    }

    @Then("^I shall validate shopping cart as below$")
    public void iShallValidateShoppingCartAsBelow(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> data : userList) {

            Assert.assertEquals("", data.get(0), new CommonPage().setProductSummary(data.get(0)));
            Assert.assertEquals("", data.get(1), new CommonPage().setProductSummary(data.get(1)));
            Assert.assertEquals("", data.get(2), new CommonPage().setProductSummary(data.get(2)));

        }
    }


        @Then("^I shall be able to Buy the product$")
        public void iShallBeAbleToBuyTheProduct () {
        }

        @And("^I shall be able to Buy using cheque payment$")
        public void iShallBeAbleToBuyUsingChequePayment () {

        }
        }

