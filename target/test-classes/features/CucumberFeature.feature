Feature: Verify the user search experiences

@Search
Scenario Outline: Verify search behaviour is same in both Home and Offer page

Given User is on GreenKart Home page
When User search with short name <Name> on Landing Page
And User extract the product Name on Home Page
Then User validate the search product <Name> on Offer page

Examples:
| Name |
| Tom |
| Beet |