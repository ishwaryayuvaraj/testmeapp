Feature: searching of product
@category
Scenario: product searching by category
Given user login
When user selects product by category
Then verify the product and close the application
@sub-category
Scenario: product searching by sub-category
Given user login
When user selects product by sub-category
Then verify the product and close the application
@productname
Scenario: product searching by productname
Given user login
When user selects product  by productname
Then verify the product and close the application
