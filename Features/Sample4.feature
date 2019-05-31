Feature: The user wants to select product and proceed with checkout
Background: welcome to home page
  Scenario: Select product and checkout
    Given user login to TestMe
    When user selects product as headphone
    When user clicks on add to cart
    When user clicks on cart link
    When user provides quantity as 9
    When user proceed checkout
    Then verify the review and payment page

  

 