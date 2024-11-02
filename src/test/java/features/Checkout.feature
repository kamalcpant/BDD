Feature: Verify the user checkout experience

@Checkout
Scenario Outline: Verify add to Cart functionality and Checkout implementation

Given User is on GreenKart Home page
When User search with short name <Name> on Landing Page
And User extract the product Name on Home Page
And User increase <Quantity> of product and add it to Cart
Then User click on CART icon and Proceed to Checkout
And User validate the product name on Checkout page and buttons availability

Examples:
| Name | Quantity |
| Bea | 2 |
