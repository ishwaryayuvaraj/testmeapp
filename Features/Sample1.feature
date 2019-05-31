Feature: Login
- Description :Login
Scenario: Login with validate
Given user launch chrome browser And enter TestMeApp URL
When User enter username in username field
When User enter password in password field
When User clicks on OK button
Then verify result