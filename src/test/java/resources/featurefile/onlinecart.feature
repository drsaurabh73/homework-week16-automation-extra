@Test
  Feature: Verifying product to online cart and checkout

    Scenario: TC-003 Add product to Online Cart and checkout
      Given I am on the Sign In Page
      When Login using newly create credentials
      And I add below product to cart
#        | category | subCategory    | name                        | model  | quantity |
        | Dresses  | CASUAL DRESSES | Printed Dress               | demo_3 | 2        |
        | Women    | TOPS           | Faded Short Sleeve T-shirts | demo_1 | 3        |
      Then I shall validate shopping cart as below
#        | name                        | model        | quantity |
        | Printed Dress               | SKU : demo_3 | 2        |
        | Faded Short Sleeve T-shirts | SKU : demo_1 | 3        |
      Then I shall be able to Buy the product
      And I shall be able to Buy using cheque payment