$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlinecart.feature");
formatter.feature({
  "line": 2,
  "name": "Verifying product to online cart and checkout",
  "description": "",
  "id": "verifying-product-to-online-cart-and-checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.before({
  "duration": 7576610100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "TC-003 Add product to Online Cart and checkout",
  "description": "",
  "id": "verifying-product-to-online-cart-and-checkout;tc-003-add-product-to-online-cart-and-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I add below product to cart",
  "rows": [
    {
      "comments": [
        {
          "line": 8,
          "value": "#        | category | subCategory    | name                        | model  | quantity |"
        }
      ],
      "cells": [
        "Dresses",
        "CASUAL DRESSES",
        "Printed Dress",
        "demo_3",
        "2"
      ],
      "line": 9
    },
    {
      "cells": [
        "Women",
        "TOPS",
        "Faded Short Sleeve T-shirts",
        "demo_1",
        "3"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I shall validate shopping cart as below",
  "rows": [
    {
      "comments": [
        {
          "line": 12,
          "value": "#        | name                        | model        | quantity |"
        }
      ],
      "cells": [
        "Printed Dress",
        "SKU : demo_3",
        "2"
      ],
      "line": 13
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts",
        "SKU : demo_1",
        "3"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I shall be able to Buy the product",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I shall be able to Buy using cheque payment",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutStep.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 129696700,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 2831168200,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.iAddBelowProductToCart(DataTable)"
});
formatter.result({
  "duration": 40013045200,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.iShallValidateShoppingCartAsBelow(DataTable)"
});
formatter.result({
  "duration": 25413000,
  "error_message": "java.lang.AssertionError: expected:\u003cSKU : demo_3\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat com.automationpractice.steps.CheckoutStep.iShallValidateShoppingCartAsBelow(CheckoutStep.java:42)\r\n\tat ✽.Then I shall validate shopping cart as below(onlinecart.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CheckoutStep.iShallBeAbleToBuyTheProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutStep.iShallBeAbleToBuyUsingChequePayment()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1004063900,
  "status": "passed"
});
});